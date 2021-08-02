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
            int x =10/5;

            //ORDERING : TRACE - DEBUG - INFO- WARN - ERROR
            LOGGER.trace("result : {} ",x);
            LOGGER.debug("result : {} ",x);
            LOGGER.info("result : {} ",x);
            LOGGER.warn("result : {} ",x);
            LOGGER.error("result : {} ",x);




        }
        catch (ArithmeticException e)
        {
        LOGGER.error("error while executing {}",e.toString(),e);
        }
    }
}
