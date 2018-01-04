package com.drcom.hippo.dao;

import com.drcom.hippo.domain.EntityWithId;

public interface IBaseDao<T extends EntityWithId> {
	T findById(long id);
}
