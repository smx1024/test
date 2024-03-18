package com.sx.suanfatest;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.nio.channels.Channel;

@RabbitListener(queues = "hello")
@Service
public class Raabitlistener {
    @RabbitHandler
    public void listener(Object msg1){
        System.out.println("hello收到消息：" + msg1.toString());
    }
    @RabbitListener(queues = "hello2")
    public void listener2(Object msg1){
        System.out.println("hello2收到消息：" + msg1.toString());
    }
}
