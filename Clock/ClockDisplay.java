public class ClockDisplay {
    public static void main(String [] args){

        //Create some clocks and print their times
        Clock c1 = new Clock(23,59);
        System.out.println("Current Time: "+ c1);

        while(true) {
            //Tick the clock and print its time
            c1.tick();
            System.out.println("Current Time: "+ c1);
            wait(100);   // slow down the looping
        }
    }

    /* stop execution for milliseconds amount of time */
    private static void wait(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        }
        catch (Exception e) { }
    }  // end of wait()

}