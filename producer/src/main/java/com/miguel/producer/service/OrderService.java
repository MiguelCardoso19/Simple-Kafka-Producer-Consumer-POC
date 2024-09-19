package com.miguel.producer.service;

import com.miguel.producer.dto.OrderDTO;

public interface OrderService {
    public void sendMessageOrder(OrderDTO order);
}
