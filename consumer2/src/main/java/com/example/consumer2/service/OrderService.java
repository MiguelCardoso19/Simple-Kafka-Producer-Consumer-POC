package com.example.consumer2.service;

import com.example.consumer2.dto.OrderDTO;

public interface OrderService {
    public void orderListener(OrderDTO order);
    public void saveOrder(OrderDTO order);
}