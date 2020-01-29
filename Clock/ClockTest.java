public class ClockTest {
    public static void main(String [] args){

    //Create some clocks and print their times
    Clock c1 = new Clock(14,22);
    //System.out.println("T1: "+ c1);

    //Tick the clock twice and print its time
    /*c1.tick();
    c1.tick();
    System.out.println("T4: "+ c1);*/

    /*c1 = new Clock(1,5);
    c1.setHours(22);
    c1.setMinutes(30);*/

    while(true) {
        //clock.minIncrement();
    
        //Tick the clock twice and print its time
        c1.tick();
    
        System.out.println("T9: "+ c1);       
        //System.out.println("T10: " + c1.getHours() + ":" +c1.getMinutes());
        wait(100);   // slow down the looping
    }


    //System.out.println("T9: "+ c1);       
    //System.out.println("T10: " + c1.getHours() + ":" +c1.getMinutes());

}
private static void wait(int milliseconds)
    /* stop execution for milliseconds    amount of time */
    {
        try {
        Thread.sleep(milliseconds);
        } 
        catch (Exception e) { }
    }  // end of wait()

}