package com.anheng.dao;

import com.anheng.pojo.*;
import org.apache.ibatis.annotations.Insert;

public interface DistributionTrendMapper {
    //插入数据
    int addDistributionTrend(DistributionTrend dbt);
    int addAttackerAnalysis(AttackerAnalysis aA);
    int addAttackerTopN(AttackerTopN atn);
    int addDisposalSuggestions(DisposalSuggestions ds);
    int addRiskAssetDistribution(RiskAssetDistribution rad);
    int addVictim(Victim victim);
}
