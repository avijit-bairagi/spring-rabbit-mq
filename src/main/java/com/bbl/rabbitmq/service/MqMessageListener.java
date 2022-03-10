package com.bbl.rabbitmq.service;

import com.bbl.rabbitmq.model.MqMessageBody;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MqMessageListener {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void listen(MqMessageBody body) {
        System.out.println("Message read from Queue : " + body.getId() + " -> " + body.getMessage());
    }
}
