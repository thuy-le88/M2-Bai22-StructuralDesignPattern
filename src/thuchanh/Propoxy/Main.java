package thuchanh.Propoxy;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy=new MathCalculatorProxy();
        System.out.println("1 + 2 = "+proxy.add(1,2));
        System.out.println("1 - 2 = "+proxy.sub(1,2));
        System.out.println("1 * 2 = "+proxy.mul(1,2));
        System.out.println("1 / 2 = "+proxy.div(1,2));
    }
}
