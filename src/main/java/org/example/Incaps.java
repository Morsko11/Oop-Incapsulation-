package org.example;

public class Incaps {
    private int a=12412;
    private String b;
    private int c;

    public Incaps(int a, String b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Incaps() {

    }
    public Number getnumber(Number number){
        return number;
    }
    public Animal getanimal(){
        return null;
    }



    public void showA() {
        System.out.println(a);

    }

    public void setA(int x) {
        a = x;
    }
    private void hello(){
        System.out.println("hello");
    }
    public void helloCall(){
        hello();
    }
}
