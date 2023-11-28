package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public class OrderDetailMapper {

    /**
     * 批量插入订单明细数据
     * @param orderDetails
     */
    public void insertBatch(List<OrderDetail> orderDetails) {
    }
}
