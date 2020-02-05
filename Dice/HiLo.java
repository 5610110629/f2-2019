public class HiLo{
    private Dice d1;
    private Dice d2;
    public HiLo(){
        d1 = new Dice();
        d2 = new Dice();
    }

    public void shake(){
        d1.roll();
        d2.roll();
    }

    public int getTotal(){
        int total = 0;
        total = d1.getFace() + d2.getFace();    
        return total;
    }

    public void printDice(){
        System.out.println("Face Dice 1 = " +d1.getFace()); 
        System.out.println("Face Dice 2 = " +d2.getFace());
    }

    

}