package com.drcom.hippo.dao;

import java.util.List;

import com.drcom.hippo.domain.OnlineUser;

/**
 * @author jerry
 *
 */
public interface IOnlineUserDao {
	/**
	 * ��ȡ��ǰ���е������û�
	 *
	 */
	List<OnlineUser> findAllOnlineUsers();
}
