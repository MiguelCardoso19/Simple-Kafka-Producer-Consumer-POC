package com.example.consumer2.service.impl;

import com.example.consumer2.dto.OrderDTO;
import com.example.consumer2.mapper.OrderMapper;
import com.example.consumer2.repository.OrderRepository;
import com.example.consumer2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    @KafkaListener(topicPartitions = @TopicPartition(topic = "msPOC-order-processed", partitions = {"0"}), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(OrderDTO order) {
        System.out.println("Received Message Consumer 02: " + order.name());
        saveOrder(order);
    }

    @Override
    public void saveOrder(OrderDTO order) {
        orderRepository.save(orderMapper.toOrder(order));
        System.out.println("Saved order : " + order.name());
    }
}