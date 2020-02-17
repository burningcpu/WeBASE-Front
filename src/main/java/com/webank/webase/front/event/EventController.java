package com.webank.webase.front.event;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.webank.webase.front.base.BaseController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import com.webank.webase.front.event.entity.*;



/**
 * EventController.
 */
@Api(value = "/event", tags = "event interface")
@Slf4j
@RestController
@RequestMapping(value = "/event")
public class EventController extends BaseController {

    @Autowired
    EventService eventService;

    /**
     * newBlockEventSubscriber.
     *
     * @param newBlockEventSubscriber request data
     * @param result checkResult
     */
    @ApiOperation(value = "newBlock event subscribe", notes = "event subscribe")
    @ApiImplicitParam(name = "newBlockEventSubscriber", value = "subscribe info", required = true, dataType = "ReqNewBlockSubscriber")
    @PostMapping("/subscribe")
    public String newBlockEventSubscriber(@Valid @RequestBody ReqNewBlockSubscriber reqNewBlockSubscriber, BindingResult result)
        throws Exception {
        log.info("event subscribe start. ReqSubscribe:[{}]", JSON.toJSONString(reqNewBlockSubscriber));
        checkParamResult(result);
        String ret = eventService.newBlockEventSubscriber(reqNewBlockSubscriber);
        log.info("success deploy. result:{}", ret);
        return ret;
    }
    
    /**
     * contractEventSubscriber.
     *
     * @param contractEventSubscriber request data
     * @param result checkResult
     */
    @ApiOperation(value = "contract event subscribe", notes = "event subscribe")
    @ApiImplicitParam(name = "contractEventSubscriber", value = "subscribe info", required = true, dataType = "ReqContractEventSubscriber")
    @PostMapping("/subscribe")
    public String contractEventSubscriber(@Valid @RequestBody ReqContractEventSubscriber reqContractEventSubscriber, BindingResult result)
        throws Exception {
        log.info("event subscribe start. ReqSubscribe:[{}]", JSON.toJSONString(reqContractEventSubscriber));
        checkParamResult(result);
        String ret = eventService.contractEventSubscriber(reqContractEventSubscriber);
        log.info("success deploy. result:{}", ret);
        return ret;
    }
}
    
