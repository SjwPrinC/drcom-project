package com.drcom.hippo.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drcom.hippo.dao.IOnlineUserDao;
import com.drcom.hippo.domain.OnlineUser;

@Repository
public class OnlineUserDao extends BaseDao<OnlineUser> implements IOnlineUserDao {

	public List<OnlineUser> findAllOnlineUsers() {
		return null;
	}
	
	
}
