package com.webank.webase.front.event.entity;

import lombok.Data;

@Data
public class ContractEventPublisher {

	MQInfo mqInfo;
	Integer appId;
	Integer groupId;
	String eventInfo;
}
