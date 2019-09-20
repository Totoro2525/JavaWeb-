package com.totoro.service;

import com.totoro.dao.GoodDao;
import com.totoro.model.Goods;

import java.util.List;

public class GoodService {
    public List<Goods> selectAllGoods(){
        return new GoodDao().getAllGoods();
    }
}
