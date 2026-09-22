package Arrays.HashMapDemo;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(7,"MSD");
//        map.put(18,"VK");
//        map.put(10,"ST");
//        map.put(17,"RP");
//        System.out.println(map);
//        System.out.println(map.get(7));
//        System.out.println(map.put(18,"SM"));
//        System.out.println(map);
//        System.out.println(map.containsKey(17));
//        System.out.println(map.containsValue("RP"));
//        System.out.println(map.remove(18));
//        System.out.println(map);

        int arr[] = {1,1,1,2,2,1,5,6,4,4,3,3,3,7,7,8,9,5,3,2,7,8,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
