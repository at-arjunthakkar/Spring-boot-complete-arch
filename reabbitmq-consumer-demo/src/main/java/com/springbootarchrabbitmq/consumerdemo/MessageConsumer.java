package com.springbootarchrabbitmq.consumerdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Component
public class MessageConsumer {

    @RabbitListener(queues = MessageQConfig.MESSAGE_QUEUE)
    public void consumeMessage(@RequestBody CustomMessage customMessage){
        log.info(customMessage.toString());
    }
}
