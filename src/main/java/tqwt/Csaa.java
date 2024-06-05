package tqwt;

import org.example.Incaps;

public class Csaa extends Incaps {


    static int id = 0;
    static int count;
     static {
        count = 50;

    }

    public Csaa(int a, String b, int c) {
        super(a, b, c);
    }


    public void display() {
        System.out.println("id = "+ id);
    }
    public void helloCall(){
         super.helloCall();
    }
}
