import java.awt.*;

public class ComparisonOperators {
    public static void main(String[] args){
        boolean x=true;
        boolean xy = x == true;
        System.out.println("    :" + xy);

        boolean x8 = true;
        System.out.println("  :" + (x8==true));
        System.out.println("  :" + (x8==false));
        System.out.println("  :" + (x8!=false));

        int x1=9, y1=17;
        System.out.println("   :" + (x1==y1));
        System.out.println("   :" + (x1!=y1));
        System.out.println("  :" + (x1==17));
        System.out.println("   :" + (x1!=17));
        System.out.println("  :" + (y1!=9));
        System.out.format("\n x1=%d \t y1=%d",x1,y1);


        int x2=17, y2=18;
        System.out.println("  :" + (x2>y2));
        System.out.println("  :" + (x2<y2));
        System.out.println("  :" + (x2<=y2));
        System.out.println("  :" + (x2>=y2));
        System.out.format("\n x2=%d \t y2=%d",x2,y2);

        String x3= "ma";
        String y3="love";
        System.out.println("   :" + (x3.equals("ma")));
        System.out.println("  :" + (y3.equals("love")));
        System.out.println("  :" + (x3.equalsIgnoreCase("MA")));
        System.out.println("  :" + (!x3.equalsIgnoreCase("MA")));
        System.out.format("\n x3=%s \t y3=%s",x3,y3);


    }
}
