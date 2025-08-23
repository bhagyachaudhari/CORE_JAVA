package org.example.bitmanipulation;

import java.math.BigInteger;

public class AddBinary {

    public static void main(String args[]){
        String A = "10001100010111000101100010100110001001101010000010011010";
        String B = "101111000100100100111110010010101110101001100100101001111010011000000110";
        //String A = "110";
        //String B = "10";
        System.out.println(addBinary(A, B));
    }
    public static String addBinary(String A, String B) {
        int k = A.length()-1;
        BigInteger sumA = new BigInteger("0");
        for(int i = 0; i < A.length(); i++){
            sumA = sumA.add(BigInteger.valueOf(Character.getNumericValue(A.charAt(i))).multiply(BigInteger.valueOf(Long.parseLong("2")).pow(k)));
            k--;
        }

        k = B.length()-1;
        BigInteger sumB = new BigInteger("0");
        for(int i = 0; i < B.length(); i++){
            sumB = sumB.add(BigInteger.valueOf(Character.getNumericValue(B.charAt(i))).multiply(BigInteger.valueOf(Long.parseLong("2")).pow(k)));
            k--;
        }

        StringBuilder output = new StringBuilder();
        BigInteger totalSum = sumA.add(sumB);
        while(totalSum.compareTo(BigInteger.valueOf(0)) == 1){
            BigInteger rem = totalSum.mod(BigInteger.valueOf(2)); // 7%2 = 1 // 3%2 = 1 // 1%2 = 1
            output.append(rem); // 111
            totalSum = totalSum.divide(BigInteger.valueOf(2)); // 7/2 = 3 // 3/2 = 1 //// 1/2 = 0
        }

        char[] outputArr = output.toString().toCharArray();
        int s = 0, e = outputArr.length-1;
        while(s < e){
            char temp = outputArr[s];
            outputArr[s] = outputArr[e];
            outputArr[e] = temp;
            s++;
            e--;
        }

        output = new StringBuilder();
        for(int i = 0; i < outputArr.length; i++){
            output.append(outputArr[i]);
        }
        return output.toString();
    }
}

