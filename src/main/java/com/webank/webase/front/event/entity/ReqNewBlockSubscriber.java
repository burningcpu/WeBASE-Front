package com.webank.webase.front.event.entity;
import lombok.Data;

@Data
public class ReqNewBlockSubscriber {
	MQInfo mq;
	Integer appId;
	Integer groupId;
}
