package com.logging.main;

/*public class App {
    public static void main(String[] args) {
        try
        {
            int x =  10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
output
* Error occured
java.lang.ArithmeticException: / by zero
	at com.logging.main.App.main(App.java:7)
*/

//in real world practice they don't use the terminal stack strace for error they use log file which will contain all the error log data


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



public class App {
    private static final Logger LOGGER= LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        try{
            int x =10/0;
        LOGGER.info("result : {} ",x);

        }
        catch (ArithmeticException e)
        {
        LOGGER.error("error while executing {}",e.toString(),e);
        }
    }
}
