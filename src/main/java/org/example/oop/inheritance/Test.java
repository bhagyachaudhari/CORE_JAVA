package org.example.oop.inheritance;

public class Test
{
    public static void main(String [] args)
    {
        Test t1 = new Test();
        System.out.println(t1.hashCode());
        Test t2 = m1(t1); // line 6
        System.out.println(t2.hashCode());
        Test t3 = new Test();
        System.out.println(t3.hashCode());
        t2 = t3; // line 8
        System.out.println(t2.hashCode());
        System.gc();
    }

    static Test m1(Test temp)
    {
        temp = new Test();
        return temp;
    }

    @Override
    protected void finalize(){
        System.out.println("...."+this.hashCode());
    }
}