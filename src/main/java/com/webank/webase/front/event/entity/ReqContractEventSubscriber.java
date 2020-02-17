package com.webank.webase.front.event.entity;
import java.util.List;

import lombok.Data;

@Data
public class ReqContractEventSubscriber {
	MQInfo mq;
	Integer appId;
	Integer groupId;
	String contractAbi;
	String contractAddress;
	List<String> eventList;
}
