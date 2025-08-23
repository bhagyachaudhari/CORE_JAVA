package org.example.stringexamples;

public class Client2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        System.out.println(sb);//Java
        sb.append('.');
        System.out.println(sb);//Java.
        sb.append("Kava", 0, 2);
        System.out.println(sb);//Java.Ka
        sb.insert(4, "##");
        System.out.println(sb);//Java##.Ka
        sb.delete(4, 7);
        System.out.println(sb);//JavaKa
        sb.deleteCharAt(4);
        System.out.println(sb);//Javaa
        String str = sb.toString();
        System.out.println(str);//Javaa
        str.concat("World");
        System.out.println(str);//Javaa
        sb.reverse();
        System.out.println(sb);//aavaJ
        int a1 = sb.indexOf("aa");
        System.out.println(a1);//0
        int a2 = sb.lastIndexOf("a");
        System.out.println(a2);//3
        int a3 = sb.length();
        System.out.println(a3);//5
        int a4 = sb.capacity();
        System.out.println(a4);//16
        char c = sb.charAt(2);
        System.out.println(c);//v
        sb.setCharAt(4, 'a');
        System.out.println(sb);//aavaa
        sb.replace(0, 2, "!!!");
        System.out.println(sb);//!!!vaa
        String s = sb.substring(0, 3);
        System.out.println(s);//!!!
        /*StringBuffer*/
        StringBuffer sf = new StringBuffer();

    }
}
