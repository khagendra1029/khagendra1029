package fileReader;

import com.personal.experts.ExpertsApplication;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String args []) throws IOException {
        System.out.println(new TxtFileReader().readFromTxtFile());


    }
}
