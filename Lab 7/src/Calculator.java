package Lab7;

public class Calculator {
    private double a;
    private double b;

    Calculator(){
    }

    Calculator(float a, float b){
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }

    public void subtract(){
        System.out.println(a-b);
    }

    public void multiply(){
        System.out.println(a*b);
    }

    public void divide(){
        System.out.println(a/b);
    }

}
