package org.example.bitmanipulation;

public class CheckBit {
    public static void main(String args[]){
        System.out.println(Math.pow(3,2));
        int A = 3;
        int bit = 0;
        double output = 0;
        for(int i = 31; i >= 0; i--){
            if((A & (1<<bit)) != 0)
                 output = output + Math.pow(2, i);
        }
        System.out.println(output);

    }

}
