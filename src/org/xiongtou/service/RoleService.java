package org.xiongtou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xiongtou.dao.IRoleDao;
import org.xiongtou.model.Role;

@Service("roleService")
public class RoleService implements IRoleService {
	
	@Autowired
	private IRoleDao roleDao;
	
	public IRoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public Role load(int id) {
		return roleDao.load(id);
	}
//	private IRoleDao roleDao;
//	private IUserDao userDao;
//	
//	
//	public IRoleDao getRoleDao() {
//		return roleDao;
//	}
//	@Inject
//	public void setRoleDao(IRoleDao roleDao) {
//		this.roleDao = roleDao;
//	}
//
//	public IUserDao getUserDao() {
//		return userDao;
//	}
//	@Inject
//	public void setUserDao(IUserDao userDao) {
//		this.userDao = userDao;
//	}
//
//	@Override
//	public void add(Role role) {
//		roleDao.add(role);
//	}
//
//	@Override
//	public void delete(int id) {
//		List<User> us = userDao.listRoleUsers(id);
//		if(us!=null&&us.size()>0) throw new CmsException("鍒犻櫎鐨勮鑹插璞′腑杩樻湁鐢ㄦ埛锛屼笉鑳藉垹闄�");
//		roleDao.delete(id);
//	}
//
//	@Override
//	public void update(Role role) {
//		roleDao.update(role);
//	}
//
//	@Override
//	public Role load(int id) {
//		return roleDao.load(id);
//	}
//
//	@Override
//	public List<Role> listRole() {
//		return roleDao.listRole();
//	}
//
//	@Override
//	public void deleteRoleUsers(int rid) {
//		roleDao.deleteRoleUsers(rid);
//	}

}
