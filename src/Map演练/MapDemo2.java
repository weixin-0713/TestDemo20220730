package Map演练;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map2= new HashMap<String,String>();
        map2.put("001","林青霞");
        map2.put("002","张曼玉");
        map2.put("003","王祖贤");

// 方法1  get() 根据键获取value值
        System.out.println(map2.get("002"));

//  方法2  keySet() 获取所有键的集合
        Set<String> keySet = map2.keySet();
        System.out.println(keySet);

        for (String key:keySet){
            System.out.println(key);
        }

// 方法3  values() 获取所有值的集合
        Collection<String> collection = map2.values();
        for (String value:collection){
            System.out.println(value);
        }

        System.out.println("---------");
//   遍历方法1     Map 集合的遍历 , 获取键值,然后再获取值
        Set<String> keySet2 = map2.keySet();
        for (String key1:keySet2){
            String s = map2.get(key1);
            System.out.println(key1 + "-" + s);
        }
        System.out.println("---------");

// 遍历方法2       Map 集合的遍历  entrySet() 获取键值对集合
        Set<Map.Entry<String, String>> set = map2.entrySet();
        for (Map.Entry<String, String> me:set){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"+"+value);
        }


    }
}
