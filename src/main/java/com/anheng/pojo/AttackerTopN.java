package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/16 11:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttackerTopN {
    private int id;  //主键约束，自增id
    private String killChain;       //攻击链
    private String deviceAssetSubType;     //设备类型
    private String subCategory;      //告警子类型
    private String threatSeverity;   //安全告警威胁等级
    private String modelType;      //模型类型
    private String eventCount;        //事件数量
    private String startTime;       //起始时间
}
