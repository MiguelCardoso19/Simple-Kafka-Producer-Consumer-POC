package com.example.consumer1.service;

import com.example.consumer1.dto.OrderDTO;

public interface OrderService {
    public void orderListener(OrderDTO order);
    public void saveOrder(OrderDTO order);
}
