package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/16 11:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisposalSuggestions {
    private int id;  //主键约束，自增id
    private String subCategory;     //告警子类型
    private String suggestion;      //处置建议
    private String alarmDescription;     //告警描述
}
