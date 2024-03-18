package com.sx.suanfatest;


import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(value = MqConst.QUEUE_MSM_ITEM, durable = "true"),
//            exchange = @Exchange(value = MqConst.EXCHANGE_DIRECT_MSM),
//            key = {MqConst.ROUTING_MSM_ITEM}
//    ))
//    public void send(MsmVo msmVo, Message message, Channel channel) {
//        smsService.send(msmVo);
//    }
    @Bean
    public Queue send() {
       Queue queue = new Queue("hello");
        return queue;
    }
    @Bean
    public Exchange exchange() {
        return new DirectExchange("hello-exchange");
    }
    @Bean
    public Binding testBinding() {
        return new Binding("hello", Binding.DestinationType.QUEUE, "hello-exchange", "hello", null);
    }
    @Bean
    public Queue send2() {
        Queue queue = new Queue("hello2");
        return queue;
    }
    @Bean
    public Binding testBinding2() {
        return new Binding("hello2", Binding.DestinationType.QUEUE, "hello-exchange", "hello2", null);
    }
    @Bean
    public Exchange exchange2() {
        return new DirectExchange("hello-exchange2");
    }
    @Bean
    public Binding testBinding3() {
        return new Binding("hello2", Binding.DestinationType.QUEUE, "hello-exchange2", "hello2", null);
    }
}
