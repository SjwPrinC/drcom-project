package com.drcom.hippo.dao.Impl;

import javax.persistence.EntityManager;

import com.drcom.hippo.dao.IBaseDao;
import com.drcom.hippo.domain.EntityWithId;

public abstract class BaseDao<T extends EntityWithId> implements IBaseDao<T> {
	
	protected EntityManager eManager;
	
	public T findById(long id) {
		return null;
	}
}
