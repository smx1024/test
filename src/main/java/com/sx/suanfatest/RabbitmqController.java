package com.sx.suanfatest;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitmqController {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @RequestMapping("/rabbitmq")
    public String rabbitmq() {
        rabbitTemplate.convertAndSend("hello2","hello world1");
        return "rabbitmq";
    }
}
