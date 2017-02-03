package org.xiongtou.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.xiongtou.model.Role;
import org.xiongtou.model.RoleType;
import org.xiongtou.service.IUserService;

@RequestMapping("/Login")
@Controller
public class LoginController {
	
	@Autowired
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}
	
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String doLogin(HttpServletRequest request) {
		String username = request.getParameter("loginname");  
        String pwd = request.getParameter("password");  
        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);   
        Subject currentUser = SecurityUtils.getSubject();   
        currentUser.login(token);    
        return "index";  
	}
	
	@SuppressWarnings("unchecked")
	private Set<String> getAllActions(List<Role> rs,HttpSession session) {
		Set<String> actions = new HashSet<String>();
		Map<String,Set<String>> allAuths = (Map<String,Set<String>>)session.getServletContext().getAttribute("allAuths");
		actions.addAll(allAuths.get("base"));
		for(Role r:rs) {
			if(r.getRoleType()==RoleType.ROLE_ADMIN) continue;
			actions.addAll(allAuths.get(r.getRoleType().name()));
		}
		return actions;
	}
	
	
	private boolean isRole(List<Role> rs,RoleType rt) {
		for(Role r:rs) {
			if(r.getRoleType()==rt) return true;
		}
		return false;
	}
	
	
//	@RequestMapping("/drawCheckCode")
//	public void drawCheckCode(HttpServletResponse resp,HttpSession session) throws IOException {
//		resp.setContentType("image/jpg");
//		int width = 200;
//		int height = 30;
//		Captcha c = Captcha.getInstance();
//		c.set(width, height);
//		String checkcode = c.generateCheckcode();
//		session.setAttribute("cc", checkcode);
//		OutputStream os = resp.getOutputStream();
//		ImageIO.write(c.generateCheckImg(checkcode), "jpg", os);
//	}
}
