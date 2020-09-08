package com.anheng.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.anheng.dao.DistributionTrendMapper;
import com.anheng.pojo.*;
import org.apache.ibatis.session.SqlSession;

import java.io.*;

import java.util.List;

public class Main2 {
    public static final void readF1(String filePath) throws IOException {
        DistributionTrend dbt = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DistributionTrendMapper mapper = sqlSession.getMapper(DistributionTrendMapper.class);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            dbt = JSONObject.parseObject(line, DistributionTrend.class);
            mapper.addDistributionTrend(dbt);
        }
        sqlSession.close();
        br.close();
    }

    public static final void readF2(String filePath) throws IOException {
        AttackerAnalysis dbt = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DistributionTrendMapper mapper = sqlSession.getMapper(DistributionTrendMapper.class);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            dbt = JSONObject.parseObject(line, AttackerAnalysis.class);
            mapper.addAttackerAnalysis(dbt);
        }
        sqlSession.close();
        br.close();
    }

    public static final void readF3(String filePath) throws IOException {
        AttackerTopN dbt = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DistributionTrendMapper mapper = sqlSession.getMapper(DistributionTrendMapper.class);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            dbt = JSONObject.parseObject(line, AttackerTopN.class);
            mapper.addAttackerTopN(dbt);
        }
        sqlSession.close();
        br.close();
    }

    public static final void readF4(String filePath) throws IOException {
        DisposalSuggestions dbt = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DistributionTrendMapper mapper = sqlSession.getMapper(DistributionTrendMapper.class);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            dbt = JSONObject.parseObject(line, DisposalSuggestions.class);
            mapper.addDisposalSuggestions(dbt);
        }
        sqlSession.close();
        br.close();
    }

    public static final void readF5(String filePath) throws IOException {
        Victim dbt = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DistributionTrendMapper mapper = sqlSession.getMapper(DistributionTrendMapper.class);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            dbt = JSONObject.parseObject(line, Victim.class);
            mapper.addVictim(dbt);
        }
        sqlSession.close();
        br.close();
    }

}
