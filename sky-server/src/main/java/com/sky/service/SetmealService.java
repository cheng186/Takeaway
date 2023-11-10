package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.dto.SetmealDTO;
import com.sky.entity.Employee;
import com.sky.entity.SetmealDish;
import com.sky.result.PageResult;
import org.springframework.stereotype.Service;

@Service
public interface SetmealService {

    /**
     * 新增套餐
     * @param setmealDTO
     * @return
     */
    void insertWithDish(SetmealDTO setmealDTO);


}
