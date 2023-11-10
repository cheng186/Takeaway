package com.sky.service;

import com.sky.dto.*;
import com.sky.entity.Employee;
import com.sky.entity.SetmealDish;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SetmealService {

    /**
     * 新增套餐
     * @param setmealDTO
     * @return
     */
    void insertWithDish(SetmealDTO setmealDTO);


    /**
     * 套餐分页查询
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 批量删除套餐
     * @param ids
     * @return
     */
    void delectSetmeal(List<Long> ids);

    /**
     * 根据套餐ID查询菜品信息
     * @param id
     * @return
     */
    SetmealVO getById(Long id);
}
