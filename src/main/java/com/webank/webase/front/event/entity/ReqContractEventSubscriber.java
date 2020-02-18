package com.webank.webase.front.event.entity;
import java.util.List;

import lombok.Data;

@Data
public class ReqContractEventSubscriber {
	MQInfo mq;
	Integer subscribe; //1-订阅，0-取消
	Integer appId;
	Integer groupId;
	String contractAbi;
	String contractAddress;
	List<String> eventList;
}
