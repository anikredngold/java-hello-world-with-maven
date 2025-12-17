package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {

String message = "Hello World! ";
        // Repeat the message enough times to bloat the file.
        // A 100MB uncompressed file is the target for compression testing.
        // This loop will generate a very large string literal during compilation.
        StringBuilder hugeContent = new StringBuilder();
        for (int i = 0; i < 7000000; i++) { // Adjust the count if needed for exact size
            hugeContent.append(message);
        }
        final String veryLargeString = hugeContent.toString();

        System.out.println(veryLargeString.substring(0, 13) + "...");
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
