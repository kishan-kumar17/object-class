public class OperatorPrecedence {
    public static void main(String[] args){
     Double a=2d, b=7d, c=8d, d=18d, e=18d;
     System.out.println("  :" + ((a+b)/c)/d);
     System.out.println("  :" + ((a+b)-(d-c)/e));
    }
}
