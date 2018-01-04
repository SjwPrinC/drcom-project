package com.drcom.hippo.dao;

import java.util.List;

import com.drcom.hippo.domain.OnlineUser;

/**
 * @author jerry
 *
 */
public interface IOnlineUserDao {
	/**
	 * 获取当前所有的在线用户
	 *
	 */
	List<OnlineUser> findAllOnlineUsers();
}
