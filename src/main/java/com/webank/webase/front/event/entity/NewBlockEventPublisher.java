package com.webank.webase.front.event.entity;

import lombok.Data;

@Data
public class NewBlockEventPublisher {

	MQInfo mqInfo;
	Integer appId;
	Integer groupId;
	Integer BlockHeight;
}
