package org.xiongtou.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.xiongtou.model.Group;
import org.xiongtou.model.Permission;
import org.xiongtou.model.Role;
import org.xiongtou.model.User;


@SuppressWarnings("unchecked")
@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {

	@Override
	public User getUserByName(String username) {
		String sql="select * from t_user where username=?";
		SQLQuery query=getSession().createSQLQuery(sql).addEntity(User.class);
		query.setString(0, username);
		User user=(User) query.uniqueResult();
		return user;
	}

	@Override
	public List<User> listUser() {
		String sql="select * from t_user";
		SQLQuery query=getSession().createSQLQuery(sql).addEntity(User.class);
		List<User> userList=query.list();
		return userList;
	}

	@Override
	public List<Role> listRole() {
		String sql="select * from t_role";
		SQLQuery query=getSession().createSQLQuery(sql).addEntity(Role.class);
		List<Role> roleList=query.list();
		return roleList;
	}

	@Override
	public List<Group> listUsergroup() {
		String sql="select * from t_group";
		SQLQuery query=getSession().createSQLQuery(sql).addEntity(Group.class);
		List<Group> groupList=query.list();
		return groupList;
	}

	@Override
	public List<Permission> listPermission() {
		String sql="select * from t_permission";
		SQLQuery query=getSession().createSQLQuery(sql).addEntity(Permission.class);
		List<Permission> permissionList=query.list();
		return permissionList;
	}




}
