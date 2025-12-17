package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        String message = "Hello World! ";
        StringBuilder hugeContent = new StringBuilder();
        for (int i = 0; i < 7000000; i++) { // Adjust the count if needed for exact size
            hugeContent.append(message);
        }
        final String veryLargeString = hugeContent.toString();

        System.out.println(veryLargeString.substring(0, 13) + "...");
     // LocalTime currentTime = new LocalTime();
	//	  System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
