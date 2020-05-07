package com.sia.tacocloud.data;

import com.sia.tacocloud.Order;

public interface OrderRepository {

    Order save(Order order);

}