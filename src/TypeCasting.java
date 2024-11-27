public class TypeCasting {
    public static void main(String[] args){
        int x=9;
        float y=89.0f;
        double z=y;
        float k=x;
        System.out.println("  :" + z);
        System.out.println("   :" + k);

        char x1 = 'k';
        int y1=x1;
        float z1=x1;
        System.out.println("  :" + y1);
        System.out.println("  :" + z1);

        int x2=90;
        float y2=89.9f;
        double z2=y2;
        double k2=x2;
        float o=(float)x2;
        int i=(int)y2;
        System.out.println("  :" + z2);
        System.out.println("   :" + k2);
        System.out.println("   :" + o);
        System.out.println("   :" + i);

        int myint = 100;
        char kk=(char)myint;
        System.out.println("  :" + kk);
    }
}
