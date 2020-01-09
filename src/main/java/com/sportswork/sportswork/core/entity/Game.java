package com.sportswork.sportswork.core.entity;

import com.sportswork.sportswork.core.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dengwei
 * @date 2020/1/9 13:37
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game extends BaseEntity {
    private String name;
    private String time;
    private String area;
}