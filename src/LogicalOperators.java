public class LogicalOperators {
    public static void main(String[] args){

        //OR
        boolean w=true;
        boolean x=true;
        boolean y=false;
        boolean z=false;
        System.out.println(" true :" + (w||x));
        System.out.println(" true :" + (w||y));
        System.out.println("false :" + (y||z));

        boolean w2=true;
        boolean x2=true;
        boolean y2=false;
        boolean z2=false;
        System.out.println("true :" + (w2||y2||z2));
        System.out.println("true :" + (w2||y2||x2));
        System.out.println("false  :" + (y2||z2||false));

//AND
        boolean w1=true;
        boolean x1=true;
        boolean y1=false;
        boolean z1=false;
        System.out.println(" true :" + (w1 && x1));
        System.out.println(" false :" + (w1 &&y1));
        System.out.println(" false  :" + (y1 && z1));

        boolean watchInstock= true;
        int watchcost=200;
        int budget=180;
        int discount=20;
        boolean sale=false;
        System.out.println(" false :" + (watchInstock && (watchcost<=budget)));
        System.out.println(" true:" + (watchInstock && ((watchcost-discount)<=budget)));
        System.out.println(" false :" + (watchInstock && ((watchcost<=budget)||(sale && ((watchcost-discount)<=budget)))));




    }
}
