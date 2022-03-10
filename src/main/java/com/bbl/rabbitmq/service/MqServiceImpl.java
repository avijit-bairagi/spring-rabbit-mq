package com.bbl.rabbitmq.service;

import com.bbl.rabbitmq.model.MqMessageBody;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MqServiceImpl implements MqService {

    private final RabbitTemplate rabbitTemplate;

    private final String queueName;

    public MqServiceImpl(RabbitTemplate rabbitTemplate,
                         @Value("${rabbitmq.queue}") String queueName) {
        this.rabbitTemplate = rabbitTemplate;
        this.queueName = queueName;
    }

    @Override
    public void publish(MqMessageBody body) {

        rabbitTemplate.convertAndSend(queueName, body);
    }
}
