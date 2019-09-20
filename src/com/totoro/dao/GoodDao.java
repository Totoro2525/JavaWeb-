package com.totoro.dao;

import com.totoro.model.Goods;
import com.totoro.util.DBUtil;

import java.util.List;

public class GoodDao {
    public List<Goods> getAllGoods(){
        return DBUtil.goodList;
    }
}
