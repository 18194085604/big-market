package com.gjy.domain.strategy.repository;

import com.gjy.domain.strategy.model.entity.StrategyAwardEntity;
import com.gjy.domain.strategy.model.entity.StrategyEntity;
import com.gjy.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.LinkedHashMap;
import java.util.List;

public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, int size, LinkedHashMap<Integer, Integer> shuffleStrategyAwardSearchRateTable);

    int getRateRandom(Long strategyId);

    Integer getStrategyAwardAssemble(String key, Integer i);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleWeight);

    int getRateRange(String key);
}
