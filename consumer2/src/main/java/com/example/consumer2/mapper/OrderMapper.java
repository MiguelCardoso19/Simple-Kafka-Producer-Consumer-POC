package com.example.consumer2.mapper;

import com.example.consumer2.dto.OrderDTO;
import com.example.consumer2.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    public Order toOrder(OrderDTO order);
}
