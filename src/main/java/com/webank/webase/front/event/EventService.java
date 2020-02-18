package com.webank.webase.front.event;
import com.webank.webase.front.event.entity.NewBlockEventPublisher;
import com.webank.webase.front.event.entity.ReqContractEventSubscriber;
import com.webank.webase.front.event.entity.ReqNewBlockSubscriber;
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;


public class EventService {

	/**
     * New Block Event Subscriber
     */
	public String newBlockEventSubscriber(ReqNewBlockSubscriber reqNewBlockSubscriber) throws Exception {
		
		
		if(reqNewBlockSubscriber.getSubscribe() == 1) {
			//将订阅的信息保存到h2数据库做持久化保存
		}else {
			//取消订阅
		}
        
	        return null;
	    }
	
	/**
     * Contract Event Subscriber
     */
	public String contractEventSubscriber(ReqContractEventSubscriber reqContractEventSubscriber) throws Exception {
		
		//将订阅的信息保存到h2数据库做持久化保存
		if(reqContractEventSubscriber.getSubscribe() == 1) {
			//将订阅的信息保存到h2数据库做持久化保存
		}else {
			//取消订阅
		}
        
	        return null;
	    }
	
	/**
     * event publish
     */
	public String publishNewBlock(NewBlockEventPublisher mqPublisher) throws Exception {

		// 监听sdk的事件，将事件发布到队列
		// 创建连接工厂
//		ConnectionFactory factory = new ConnectionFactory();
//		factory.setUsername(mqPublisher.getMqInfo().getUserName());
//		factory.setPassword(mqPublisher.getMqInfo().getPassWord());
//		// 设置 RabbitMQ 地址
//		factory.setHost(mqPublisher.getMqInfo().getHost());
//		// 建立到代理服务器到连接
//		Connection conn = factory.newConnection();
//		// 获得信道
//		Channel channel = conn.createChannel();
//		// 声明交换器
//		String exchangeName = "hello-exchange";
//		channel.exchangeDeclare(exchangeName, "direct", true);
//
//		String routingKey = "hola";
//		// 发布消息
//		byte[] messageBodyBytes = "quit".getBytes();
//		channel.basicPublish(exchangeName, routingKey, null, messageBodyBytes);
//
//		channel.close();
//		conn.close();
		return null;
	}
	
	public String publishContractEvent(NewBlockEventPublisher mqPublisher) throws Exception {

		return null;
	}
}
