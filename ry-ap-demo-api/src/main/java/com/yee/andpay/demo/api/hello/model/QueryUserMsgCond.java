package com.yee.andpay.demo.api.hello.model;

import me.andpay.ti.daf.dao.simplequery.AbstractOrderableCondition;
import me.andpay.ti.daf.dao.simplequery.annotation.Condition;
import me.andpay.ti.daf.dao.simplequery.annotation.Like;

/**
 * Author: RogerYee
 * Create: 8/14/15
 */
@Condition
public class QueryUserMsgCond extends AbstractOrderableCondition
{
    private static final long serialVersionUID = 1L;

    @Like(property = "name")
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
