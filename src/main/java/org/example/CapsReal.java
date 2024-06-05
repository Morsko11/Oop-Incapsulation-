package org.example;

public class CapsReal extends Incaps{

    public CapsReal(int a, String b, int c) {
        super(a, b, c);
    }
    public CapsReal() {
        super();

    }
    public Korgi getanimal(){
        return new Korgi();
    }
    public void capsrealmetod(){

    }
    public void showA() {
        System.out.println(5);

    }

    @Override
    public Integer getnumber(Number number) {
        return 5;
    }
}
