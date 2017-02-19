package org.xiongtou.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xiongtou.model.Group;
import org.xiongtou.model.Permission;
import org.xiongtou.model.Role;
import org.xiongtou.model.User;
import org.xiongtou.service.IGroupService;
import org.xiongtou.service.IRoleService;
import org.xiongtou.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IGroupService groupService;
	@Autowired
	private IRoleService roleService;
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public IGroupService getGroupService() {
		return groupService;
	}
	public void setGroupService(IGroupService groupService) {
		this.groupService = groupService;
	}
	public IRoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
	
	@RequestMapping(value="/listUser")
	public ModelAndView listUser(){
		ModelAndView mav=new ModelAndView("userList");
		List<User> userList=userService.listUser();
		mav.addObject("userList", userList);
		return mav;
	}
	
	@RequestMapping(value="/listRole")
	public ModelAndView listRole(){
		ModelAndView mav=new ModelAndView("roleList");
		List<Role> roleList=userService.listRole();
		mav.addObject("roleList", roleList);
		return mav;
	}
	
	@RequestMapping(value="/listUsergroup")
	public ModelAndView listUsergroup(){
		ModelAndView mav=new ModelAndView("groupList");
		List<Group> groupList=userService.listUsergroup();
		mav.addObject("groupList", groupList);
		return mav;
	}
	
	
	@RequestMapping(value="/listPermission")
	public ModelAndView listPermission(){
		ModelAndView mav=new ModelAndView("permissionList");
		List<Permission> permissionList=userService.listPermission();
		mav.addObject("permissionList", permissionList);
		return mav;
	}
	
	@RequestMapping(value="/userDetail")
	public ModelAndView userDetail(int id){
		ModelAndView mav=new ModelAndView("userDetail");
		User user=userService.loadUserDetail(id);
		mav.addObject("user", user);
		return mav;
	}
	
	@RequestMapping(value="/roleDetail")
	public ModelAndView roleDetail(int id){
		ModelAndView mav=new ModelAndView("roleDetail");
		Role role=roleService.load(id);
		mav.addObject("role", role);
		return mav;
	}
	
	@RequestMapping(value="/groupDetail")
	public ModelAndView usergroupDetail(int id){
		ModelAndView mav=new ModelAndView("groupDetail");
		Group group=groupService.load(id);
		mav.addObject("group", group);
		return mav;
	}
	

	
}
