package com.webank.webase.front.event.entity;

import lombok.Data;

@Data
public class MQInfo {
    String userName;
    String passWord;
    String host;
    String exchangeName;
    String routingKey;
}
