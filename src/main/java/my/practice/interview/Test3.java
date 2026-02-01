package my.practice.interview;

public class Test3 {

    public static void main(String[] args) {
        int ans = divide(0);
        System.out.println(ans);
    }

    public static int divide(int i){
        try{
            int a = 10/i;
        }/*catch(Exception e){
            return 10;
        }*/
        finally{
            //return 20;
        }

        return 1;
    }
}
