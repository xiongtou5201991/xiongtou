package org.xiongtou.dao;

import java.util.List;

import org.xiongtou.model.Group;
import org.xiongtou.model.Permission;
import org.xiongtou.model.Role;
import org.xiongtou.model.User;



public interface IUserDao extends IBaseDao<User>{
	
	public User getUserByName(String username);
	
	public List<User> listUser();
	public List<Role> listRole();
	public List<Group> listUsergroup();
	public List<Permission> listPermission();
	

}
