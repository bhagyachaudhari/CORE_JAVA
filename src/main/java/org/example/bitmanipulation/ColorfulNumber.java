package org.example.bitmanipulation;

import java.util.Arrays;
import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String args[]){
        System.out.println(colorful(23));
    }

    public static int colorful(int A) { //23

        HashSet<Integer> set = new HashSet<>();
        int prev = -1;
        int prod = 1;
        int flag = -1;
        while(A > 0){

            int rem = A % 10; //3 //2

            if(set.contains(rem))
                return 0;

            set.add(rem); //[3]  //[3, 2]

            prod = prod * rem; //3 //6
            if(prev > 0){//-1 //3
                if(set.contains(prod))
                    return 0;

                set.add(prod); //[3, 2, 6]
            }

            int seqProd = prev * rem; //-3 //6
            if(flag > 0){ //-1 //0
                if(set.contains(seqProd))
                    return 0;

                set.add(seqProd);
            }

            prev = rem; //3 //2
            A = A / 10; //2 //0
            flag++; //0 //1


        }

        return 1;
    }
}
