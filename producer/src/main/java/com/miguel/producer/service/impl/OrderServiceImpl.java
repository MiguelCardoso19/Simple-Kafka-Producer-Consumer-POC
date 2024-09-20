package com.miguel.producer.service.impl;

import com.miguel.producer.service.OrderService;
import com.miguel.producer.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final KafkaTemplate<String, OrderDTO> kafkaTemplateOrder;

    @Override
    @SuppressWarnings("null")
    public void sendMessageOrder(OrderDTO order) {
        int partition = new Random().nextInt(2) ;
        System.out.println("Sent message to partition: " + partition);
        System.out.println("Sending Order: " + order.name());
        kafkaTemplateOrder.send("msPOC-order-processed", partition, null, order);
    }
}