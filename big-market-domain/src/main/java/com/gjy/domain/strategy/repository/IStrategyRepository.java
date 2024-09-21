package com.gjy.domain.strategy.repository;

import com.gjy.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.LinkedHashMap;
import java.util.List;

public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, int size, LinkedHashMap<Integer, Integer> shuffleStrategyAwardSearchRateTable);

    int getRateRandom(Long strategyId);

    Integer getStrategyAwardAssemble(Long strategyId, Integer i);
}
