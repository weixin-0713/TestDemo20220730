package Map演练;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String>  map = new HashMap<String,String>();
//  方法1      Map 添加方法put
        map.put("001","林青霞");
        map.put("002","张曼玉");
        map.put("003","王祖贤");

        System.out.println("---------");
//        输出集合对象
        System.out.println(map);

//  方法2  remove删除方法
//        map.remove("001");
        System.out.println(map.remove("001"));



//  方法3   clear清空方法(慎重使用)
//        map.clear();

//  方法4  containKey
        System.out.println(map.containsKey("002"));

//  方法5   containValue
        System.out.println(map.containsValue("张曼玉"));

//  方法6   isEmpty
        System.out.println(map.isEmpty());

//  方法7  size
        System.out.println(map.size());

        System.out.println(map);
    }

}
