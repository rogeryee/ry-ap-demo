package com.yee.andpay.demo.srv.hello.dao;

import com.yee.andpay.demo.api.hello.model.UserMsg;
import com.yee.andpay.demo.api.hello.model.QueryUserMsgCond;
import me.andpay.ti.daf.dao.hibernate.HibernateGenericDao;

/**
 * Author: RogerYee
 * Create: 8/14/15
 */
public class UserMsgDao extends HibernateGenericDao<UserMsg, Long, QueryUserMsgCond>
{
}
