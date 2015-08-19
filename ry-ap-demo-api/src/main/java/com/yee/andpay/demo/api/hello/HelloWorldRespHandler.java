package com.yee.andpay.demo.api.hello;

import me.andpay.ti.lnk.annotaion.LnkAbstractService;
import me.andpay.ti.lnk.annotaion.LnkMethod;

/**
 * Author: RogerYee
 * Create: 8/14/15
 */
@LnkAbstractService
public interface HelloWorldRespHandler
{
    @LnkMethod(async = true)
    void onSuccess(HelloWorldResponse resp);
}
