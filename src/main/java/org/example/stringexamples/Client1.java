package org.example.stringexamples;

public class Client1 {
    public static void main(String[] args) {
        String str = "Bhagyashri";
        String newstr = str.concat(" Chaudhari");
        System.out.println(str);//Bhagyashri
        System.out.println(newstr);//Bhagyashri Chaudhari
        String replacestr = str.replace('a','@');
        System.out.println(replacestr);//Bh@gy@shri
        String str1 = str.intern();
        System.out.println(str);//Bhagyashri
        String str2 = str.substring(0, 6);
        System.out.println(str2);//Bhagya
        String str3 = str.substring(5);
        System.out.println(str3); //ashri
        String str4 = "Bhagya1s5h2ri";
        String str5 = str4.replaceAll("[0-9]", "");//Bhagyashri
        System.out.println(str5);
        String str6 = str4.replaceAll("[a-z]", "");//B152
        System.out.println(str6);
        String str7 = str4.replaceAll("[A-Za-z]", "");//152
        System.out.println(str7);
        String str8 = "Bh@gy@$hri!!";
//String str9 = str8.replaceAll("[\\W+]", "");//Bhgyhri
        String str9 = str8.replaceAll("[^A-Za-z0-9]", "");//Bhgyhri
        System.out.println(str9);
        String s1 = " Hello World ";
        System.out.println(s1);
        String s2 = s1.trim(); //trim leading and trailing whitespaces
        System.out.println(s2);
        String s3 = "Java is kava";
        System.out.println(s3);
        String s4 = s3.replace(" ", ""); //Javaiskava
        System.out.println(s4);
        String s5 = s3.replace("kava", ""); //Java is
        System.out.println(s5);
        String s6 = s3.replaceFirst("[av]", "");//Jva is kava
        System.out.println(s6);
        String s7 = s3.toLowerCase();//java is kava
        System.out.println(s7);
        String s8 = s3.toUpperCase();//JAVA IS KAVA
        System.out.println(s8);
        int year = 2019;
        String s9 = s3.format("Happy New Year %d", year);//Happy New Year 2019
        System.out.println(s9);
        String s10 = s3.join("-", s9,s3);//Happy New Year 2019-Java is kava
        System.out.println(s10);
        char c = s3.charAt(8); //k
        System.out.println(c);
        int length = s3.length(); //12
        System.out.println(length);
        String s11[] = s3.split(" ");
        for(String s12 : s11)
        {
            System.out.print(s12+", "); //Java, is, kava,
        }
        System.out.println();
        String s13[] = s3.split(" ", 2);
        for(String s14 : s13)
        {
            System.out.print(s14+", "); //Java, is kava,
        }
        System.out.println();
        String s15[] = s3.split(" ", 1);
        for(String s16 : s15)
        {
            System.out.print(s16+", ");//Java is kava,
        }
        System.out.println();
        char c1[] = s3.toCharArray();
        for(char c2 : c1)
        {
            System.out.print(c2+","); //J,a,v,a, ,i,s, ,k,a,v,a,
        }
        System.out.println();
        String b1 = "Java";
        String b2 = "Kava";
        int i1 = b1.compareTo(b2);
        System.out.println(i1);//-1
        int i2 = b2.compareTo(b1);
        System.out.println(i2);//1
        int i3 = b1.compareTo("Java");
        System.out.println(i3);//0
        boolean b = b1.equals(b2);
        System.out.println(b); //false
        boolean bb = b1.equals("Java");
        System.out.println(bb); //true
    }
}
