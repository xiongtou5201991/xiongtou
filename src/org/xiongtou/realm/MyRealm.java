package org.xiongtou.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.xiongtou.model.User;
import org.xiongtou.service.IUserService;

public class MyRealm extends AuthorizingRealm{
	
	@Autowired
	private IUserService userService;
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		
		UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
		User currentUser = userService.getUserByName(token.getUsername());  
        if(currentUser != null){  
            if(currentUser.getStatus()!=null && currentUser.getStatus() == 0){  
                throw new AuthenticationException("msg:该已帐号禁止登录.");  
            }  
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(currentUser.getUsername(), currentUser.getPassword(),this.getName());  
            //this.setSession("currentUser", member.getLoginName());  
              
            return authcInfo;  
        }  
        return null;  
	}

}
