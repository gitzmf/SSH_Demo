package org.user.dao;

import org.user.domain.User;

/**
　* @Description: ${todo}
　* @param
　* @return
　* @throws
　* @author zmf
　* @date 2018/4/10 23:28
　*/
public interface IUserDao {

    public boolean save(User user) throws Exception;

}