public class Foo{
    public static void main(String args[]){
        HiLo d = new HiLo();
        d.shake();
        d.printDice();
        System.out.println("Total = " +d.getTotal());
        if(d.getTotal() >= 6){
            System.out.println("High");
        }
        else{
            System.out.println("Low");
        }
        
    }
}