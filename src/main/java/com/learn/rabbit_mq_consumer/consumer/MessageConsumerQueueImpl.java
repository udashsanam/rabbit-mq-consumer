package com.learn.rabbit_mq_consumer.consumer;

import com.learn.rabbit_mq_consumer.pojo.NotificationPojo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MessageConsumerQueueImpl {
    
    @RabbitListener(queues = "public-darta")
    public void consumerFromDartaChalaniQueue(String pojo) {
//
//        System.out.println(pojo.getDetailEn());
//        System.out.println(pojo.getDetailEn());
        System.out.println(pojo);
        // todo conver this string and process as it requires

    }
}
