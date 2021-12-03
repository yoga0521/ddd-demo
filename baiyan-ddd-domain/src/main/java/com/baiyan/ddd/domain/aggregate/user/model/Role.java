package com.baiyan.ddd.domain.aggregate.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 角色实体
 * @author baiyan
 * @date 2021/12/03
 */
@Data
@AllArgsConstructor
public class Role {

    /**
     * 角色id
     */
    private Long id;
}