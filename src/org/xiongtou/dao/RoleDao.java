package org.xiongtou.dao;


import java.util.List;

import org.springframework.stereotype.Repository;
import org.xiongtou.model.Role;

@Repository("roleDao")
public class RoleDao extends BaseDao<Role> implements IRoleDao {

//	@Override
//	public List<Role> listRole() {
//		return this.list("from Role");
//	}
//
//	@Override
//	public void deleteRoleUsers(int rid) {
//		this.updateByHql("delete UserRole ur where ur.role.id=?",rid);
//	}


}
