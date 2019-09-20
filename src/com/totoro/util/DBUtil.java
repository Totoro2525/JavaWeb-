package com.totoro.util;

import com.totoro.model.Goods;
import com.totoro.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {
    public static Map<String,User> userMap=new HashMap<String,User>();
    public static List<Goods> goodList=new ArrayList<Goods>();
    static {
        addUser(new User("Totoro","cyx12580",20,"男",true));
        addGood(new Goods("西瓜","新疆西瓜",15,700));
        addGood(new Goods("苹果","美国红富士 ",10,500));
        addGood(new Goods("葡萄","新疆",8,600));
        addGood(new Goods("哈密瓜","新疆",17,900));
        addGood(new Goods("水蜜桃","新疆",15,400));
    }
    private static void addUser(User user){
        userMap.put(user.getUsername(),user);
    }
    private static void addGood(Goods good){
        goodList.add(good);
    }
}
