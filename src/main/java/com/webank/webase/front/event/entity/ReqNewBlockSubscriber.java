package com.webank.webase.front.event.entity;
import lombok.Data;

@Data
public class ReqNewBlockSubscriber {
	MQInfo mq;
	Integer subscribe; //1-订阅，0-取消
	Integer appId;
	Integer groupId;
}
