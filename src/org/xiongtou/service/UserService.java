package org.xiongtou.service;

import java.security.NoSuchAlgorithmException;

import org.apache.jasper.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xiongtou.dao.IUserDao;
import org.xiongtou.model.User;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
//	private IRoleDao roleDao;
//	private IGroupDao groupDao;
	

	public IUserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUserByName(String username) {
		User currentUser = userDao.getUserByName(username);
//		if(currentUser==null) throw new CmsException("鐢ㄦ埛鍚嶆垨鑰呭瘑鐮佷笉姝ｇ‘");
//		try {
//			if(!SecurityUtil.md5(username,password).equals(currentUser.getPassword())) {
//				throw new CmsException("鐢ㄦ埛鍚嶆垨鑰呭瘑鐮佷笉姝ｇ‘");
//				
//			}
//		} catch (NoSuchAlgorithmException e) {
//			throw new CmsException("瀵嗙爜鍔犲瘑澶辫触:"+e.getMessage());
//		}
//		if(currentUser.getStatus()==0) throw new CmsException("鐢ㄦ埛宸茬粡鍋滅敤锛岃涓庣鐞嗗憳鑱旂郴");
		return currentUser;
		
	}

//	public IRoleDao getRoleDao() {
//		return roleDao;
//	}
//	@Inject
//	public void setRoleDao(IRoleDao roleDao) {
//		this.roleDao = roleDao;
//	}
//
//	public IGroupDao getGroupDao() {
//		return groupDao;
//	}
//	@Inject
//	public void setGroupDao(IGroupDao groupDao) {
//		this.groupDao = groupDao;
//	}
//	
//	private void addUserRole(User user,int rid) {
//		//1銆佹鏌ヨ鑹插璞℃槸鍚﹀瓨鍦紝濡傛灉涓嶅瓨鍦紝灏辨姏鍑哄紓甯�
//		Role role = roleDao.load(rid);
//		if(role==null) throw new CmsException("瑕佹坊鍔犵殑鐢ㄦ埛瑙掕壊涓嶅瓨鍦�");
//		//2銆佹鏌ョ敤鎴疯鑹插璞℃槸鍚﹀凡缁忓瓨鍦紝濡傛灉瀛樺湪锛屽氨涓嶆坊鍔�
//		userDao.addUserRole(user, role);
//	}
//	
//	private void addUserGroup(User user,int gid) {
//		Group group = groupDao.load(gid);
//		if(group==null) throw new CmsException("瑕佹坊鍔犵敤鎴风殑缁勫璞′笉瀛樺湪");
//		userDao.addUserGroup(user, group);
//	}
//
//	@Override
//	public void add(User user, Integer[] rids, Integer[] gids) {
//		User tu = userDao.loadByUsername(user.getUsername());
//		if(tu!=null)throw new CmsException("娣诲姞鐨勭敤鎴峰璞″凡缁忓瓨鍦紝涓嶈兘娣诲姞");
//		user.setCreateDate(new Date());
//		try {
//			user.setPassword(SecurityUtil.md5(user.getUsername(),user.getPassword()));
//		} catch (NoSuchAlgorithmException e) {
//			throw new CmsException("瀵嗙爜鍔犲瘑澶辫触:"+e.getMessage());
//		}
//		userDao.add(user);
//		//娣诲姞瑙掕壊瀵硅薄
//		for(Integer rid:rids) {
//			this.addUserRole(user, rid);
//		}
//		//娣诲姞鐢ㄦ埛缁勫璞�
//		for(Integer gid:gids) {
//			addUserGroup(user, gid);
//		}
//	}
//
//	@Override
//	public void delete(int id) {
//		//TODO 闇�瑕佽繘琛岀敤鎴锋槸鍚︽湁鏂囩珷鐨勫垽鏂�
//		
//		//1銆佸垹闄ょ敤鎴风鐞嗙殑瑙掕壊瀵硅薄
//		userDao.deleteUserGroups(id);
//		//2銆佸垹闄ょ敤鎴风鐞嗙殑缁勫璞�
//		userDao.deleteUserRoles(id);
//		userDao.delete(id);
//	}
//
//	@Override
//	public void update(User user, Integer[] rids, Integer[] gids) {
//		//1銆佽幏鍙栫敤鎴峰凡缁忓瓨鍦ㄧ殑缁刬d鍜岃鑹瞚d
//		List<Integer> erids = userDao.listUserRoleIds(user.getId());
//		List<Integer> egids = userDao.listUserGroupIds(user.getId());
//		//2銆佸垽鏂紝濡傛灉erids涓笉瀛樺湪rids灏辫杩涜娣诲姞
//		for(Integer rid:rids) {
//			if(!erids.contains(rid)) {
//				addUserRole(user, rid);
//			}
//		}
//		for(Integer gid:gids) {
//			if(!egids.contains(gid)) {
//				addUserGroup(user,gid);
//			}
//		}
//		//3銆佽繘琛屽垹闄�
//		for(Integer erid:erids) {
//			if(!ArrayUtils.contains(rids, erid)) {
//				userDao.deleteUserRole(user.getId(), erid);
//			}
//		}
//		
//		for(Integer egid:egids) {
//			if(!ArrayUtils.contains(gids, egid)) {
//				userDao.deleteUserGroup(user.getId(), egid);
//			}
//		}
//	}
//
//	@Override
//	public void updateStatus(int id) {
//		User u = userDao.load(id);
//		if(u==null) throw new CmsException("淇敼鐘舵�佺殑鐢ㄦ埛涓嶅瓨鍦�");
//		if(u.getStatus()==0) u.setStatus(1);
//		else u.setStatus(0);
//		userDao.update(u);
//	}
//
//	@Override
//	public Pager<User> findUser() {
//		return userDao.findUser();
//	}
//
//	@Override
//	public User load(int id) {
//		return userDao.load(id);
//	}
//
//	@Override
//	public List<Role> listUserRoles(int id) {
//		return userDao.listUserRoles(id);
//	}
//
//	@Override
//	public List<Group> listUserGroups(int id) {
//		return userDao.listUserGroups(id);
//	}
//	@Override
//	public List<Integer> listUserRoleIds(int id) {
//		return userDao.listUserRoleIds(id);
//	}
//	@Override
//	public List<Integer> listUserGroupIds(int id) {
//		return userDao.listUserGroupIds(id);
//	}
//	@Override
//	public List<User> listGroupUsers(int gid) {
//		return userDao.listGroupUsers(gid);
//	}
//	@Override
//	public List<User> listRoleUsers(int rid) {
//		return userDao.listRoleUsers(rid);
//	}
//	@Override
//	public User login(String username, String password) {
//		User user = userDao.loadByUsername(username);
//		if(user==null) throw new CmsException("鐢ㄦ埛鍚嶆垨鑰呭瘑鐮佷笉姝ｇ‘");
//		try {
//			if(!SecurityUtil.md5(username,password).equals(user.getPassword())) {
//				throw new CmsException("鐢ㄦ埛鍚嶆垨鑰呭瘑鐮佷笉姝ｇ‘");
//			}
//		} catch (NoSuchAlgorithmException e) {
//			throw new CmsException("瀵嗙爜鍔犲瘑澶辫触:"+e.getMessage());
//		}
//		if(user.getStatus()==0) throw new CmsException("鐢ㄦ埛宸茬粡鍋滅敤锛岃涓庣鐞嗗憳鑱旂郴");
//		return user;
//	}
//	@Override
//	public void update(User user) {
//		userDao.update(user);
//	}
//	@Override
//	public void updatePwd(int uid, String oldPwd, String newPwd) {
//		try {
//			User u = userDao.load(uid);
//			if(!SecurityUtil.md5(u.getUsername(),oldPwd).equals(u.getPassword())) {
//				throw new CmsException("鍘熷瀵嗙爜杈撳叆涓嶆纭�");
//			}
//			u.setPassword(SecurityUtil.md5(u.getUsername(), newPwd));
//			userDao.update(u);
//		} catch (NoSuchAlgorithmException e) {
//			throw new CmsException("鏇存柊瀵嗙爜澶辫触:"+e.getMessage());
//		}
//	}

}
