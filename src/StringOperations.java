public class StringOperations {
    public static void main(String[] args){
        String x="I";
        String y="mom";
        System.out.println(x +"  " + y);
        String z="100";
        int d=90;
        System.out.println("   :" + (z+d));

        char[] ch={'k','i','s','h','a','n'};
        String name = new String(ch);
        System.out.println("  :" + ch);
        System.out.println("  :" +name);

        String k= "I love My mom's";
        System.out.println("  :" + k);
        System.out.println("  :" + k.length());
        System.out.println("  :" + k.toUpperCase());
        System.out.println("  :" + k.toLowerCase());
        System.out.println("   :" + k.trim());
        System.out.println("  :" + k.indexOf('I'));
        System.out.println("   :" + k.indexOf('o'));
        System.out.println("  :" + k.charAt(8));
        System.out.println("   :" + k.charAt(2));


    }
}
