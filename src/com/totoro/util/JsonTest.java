package com.totoro.util;

import com.alibaba.fastjson.JSON;
import com.totoro.model.Goods;

public class JsonTest {
    public static void main(String[] args) {
//        Goods goods=new Goods("apple","美国",10,500);
//        String json= JSON.toJSONString(goods);
//        System.out.println(json);
        String s="{\"des\":\"美国\",\"inventory\":500,\"name\":\"apple\",\"price\":10}";
        Goods goods= JSON.parseObject(s,Goods.class);
        System.out.println(goods.getName());
        System.out.println(goods.getDes());
        System.out.println(goods.getPrice());
        System.out.println(goods.getInventory());

    }
}
