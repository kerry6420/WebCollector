package com.plane

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class planeaccident {
        //数据获取存取链表
        private static List<String> alldata=new ArrayList<>();
        
        public static void main(String args[]){
            getData("飞行事故数据统计_Since_1908.csv");
            alldata.remove(0);
            //System.out.println(alldata.size());
            //死亡人数最多的年份
            MaxDeadYear();
            //事故发生次数最多的年份
            MaxAccidentsYear();
            //事故各个时间段发生的次数
            FrequencyPeriod();
            //幸存率最高的一条数据
            MaximumSurvival();
        }
        
        /**
         * 从源文件爬取数据
         * getData(String filepath)
         * @param filepath
         * /
        public static void getData(String filepath){
            File f = new File(filepath);
            //行读取数据
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line = null;
                while((line = (br.readLine()))!=null){
                    alldata.add(line);
                }
                br.close();
             }catch(Exception e){
                 e.printStacktTrace();
            }
}
    /**
     * 记录每年对应的死亡人数
     * @throws
     * 并输出死亡人数最多的年份，及该年死亡人数
     * 并输出死亡人数最多的年份，及该年死亡人数
     *
     * 并输出死亡人数最多的年份，及该年死亡人数 *
     * 并输出死亡人数最多的年份，及该年死亡人数
     * /
     public static void MaxDeadYear(){
         //记录年份对应死亡人数
         Map<Integer, Integer> map = new HashMap<>();
         //时间用date显示
         SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
         //循环所有数据
         for(String data:alldata){
              //用逗号将数据分离，第一个是年份，第11个是死亡人数
              String[] strs = data.split(",");
              if(strs[0]!=null){
                  //获取年份
                  try{
                  Date date = sdf.parse(strs[0]);
                  int year = date.getYear();
                  //判断map中是否记录过这个数据
                  if(map.containsKey(year)) {
                    //已存在，则记录数+该年死亡人数
                    map.put(year, map.get(year)+Integer.parseint(strs[10]));
                  }else{
                      map.put(year, Integer.parseInt(strs[10]));
                  }
                  
                  }catch(Exception e) {
                  // Todo Auto-generated catch block
                  }
                  }
              }
         }
     }
     //System.out.println(map);
     
     //记录死亡人数最多的年份
     int max_year = -1;
     //记录死亡人数
     int dead_count = 0;
     //用set无序获取map中的key值，即年份
     Set<Integer> keyset = map.keySet();
     /
     Set<Integer> keyset = map.keySet();/
     Set<Integer> keyset = map.keySet();
     for(int year:keyset){
        //当前年事故死亡最多的年份，记录年和次数
        if(map.get(year)>dead_count&&map.get(year)<10000){
            max_year = year;
            dead_count = map.get(year);
            }
        }
        
        System.out.println("死亡人数最多的年份："+(max_year+1901)+"死亡人数："+dead_count);
        }
        /**
         * 记录事故次数最多的年份
         * 输出该年及事故次数
         * /
         public static void MaxAccidentsYear(){
            //存放年份，该年的事故次数
            Map<Integer,Integer> map = new HashMap<>();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
            //循环所有数据
            for(String data:alldata){
                String[] strs = data.split(".");
                if(strs[0]!=null){
                }}
         }
     Set<Integer> keyset = map.keySet();o
     Set<Integer> keyset = map.keySet();r
     Set<Integer> keyset = map.keySet();
