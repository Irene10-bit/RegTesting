package org.example;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMainMethod() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setIn(new ByteArrayInputStream("Irene\n85\n".getBytes()));
            System.setOut(new PrintStream(output));

            Main.main(new String[]{});

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        System.out.println("ACTUAL PROGRAM OUTPUT:");
        System.out.println(output.toString());
    }

}
