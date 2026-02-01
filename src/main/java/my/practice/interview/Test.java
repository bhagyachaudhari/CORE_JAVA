package my.practice.interview;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String str1 = "ABCDCD";
        String str2 = "CDEFDC"; //

        // A-1, B-1, C-2, D-2

        // C-2, D-2, E-1, F-1

        //o/p -> CDD

        Map<Character, Integer> map = new HashMap<>();

        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(map.get(ch)== null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(map2.get(ch)== null) {
                map2.put(ch, 1);
            } else {
                map2.put(ch, map2.get(ch) + 1);
            }
        }


        /*for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if(map.get(ch) != null && map.containsKey(ch)) {
                //map.put(ch, map.get(ch) - 1);
                System.out.println(ch +"");
            }
        }*/

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {


            char ch = entry.getKey(); // C
            int count = entry.getValue(); // 2

            if(map2.get(ch) != null) {

                int min = Math.min(count, map2.get(ch)); // (2,1)
                    while (min > 0) { //
                        System.out.println(ch);
                        min--;
                    }
                }
            }


        }

}
