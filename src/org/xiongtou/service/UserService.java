package org.xiongtou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xiongtou.dao.IGroupDao;
import org.xiongtou.dao.IRoleDao;
import org.xiongtou.dao.IUserDao;
import org.xiongtou.model.Group;
import org.xiongtou.model.Permission;
import org.xiongtou.model.Role;
import org.xiongtou.model.User;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Autowired
	private IRoleDao roleDao;
	@Autowired
	private IGroupDao groupDao;
	

	public IUserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	
	
	public IRoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public IGroupDao getGroupDao() {
		return groupDao;
	}

	public void setGroupDao(IGroupDao groupDao) {
		this.groupDao = groupDao;
	}

	@Override
	public User getUserByName(String username) {
		User currentUser = userDao.getUserByName(username);

		return currentUser;
		
	}

	@Override
	public List<User> listUser() {
		
		return userDao.listUser();
	}

	@Override
	public List<Role> listRole() {
		return userDao.listRole();
	}

	@Override
	public List<Permission> listPermission() {
		return userDao.listPermission();
	}

	@Override
	public List<Group> listUsergroup() {
		return userDao.listUsergroup();
	}

	@Override
	public User load(int id) {
		
		return userDao.load(id);
	}



}
