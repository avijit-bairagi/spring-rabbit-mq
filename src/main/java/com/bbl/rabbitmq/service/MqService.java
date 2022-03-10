package com.bbl.rabbitmq.service;

import com.bbl.rabbitmq.model.MqMessageBody;

public interface MqService {

    void publish(MqMessageBody body);
}
