package com.bbl.rabbitmq;

import com.bbl.rabbitmq.model.MqMessageBody;
import com.bbl.rabbitmq.service.MqService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(MqService service) {
        return args -> {
            service.publish(new MqMessageBody("1", "hello from spring boot app."));
        };
    }
}
