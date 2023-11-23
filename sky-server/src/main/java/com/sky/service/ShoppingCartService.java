package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     * @return
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清除购物车
     * @return
     */
    void cleanShoppingCart();

    /**
     * 删除购物车一个数据
     * @return
     */
    void delete(ShoppingCartDTO shoppingCartDTO);
}
