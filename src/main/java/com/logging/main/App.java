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

public class App {
    public static void main(String[] args) {
        try{
            int x =10/0;
        }
        catch (ArithmeticException e)
        {

        }
    }
}
