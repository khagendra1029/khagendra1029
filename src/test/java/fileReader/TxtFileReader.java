package fileReader;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TxtFileReader {

    public String readFromTxtFile() throws IOException {

        String filePath = "CustomerInformation.txt";


        ClassLoader loader = getClass().getClassLoader();
        File file = new File(loader.getResource(filePath).getFile());
        ArrayList<String>list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        InputStream in = new FileInputStream(file);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = bReader.readLine()) != null) {
            list.add(line);

             //sb.append(line + System.lineSeparator());
        }
        bReader.close();
        in.close();
       for(int i = 0; i<list.size()-1; i++){
           builder.append(list.get(i+1)+"\n");
       }
       return builder.toString();
    }
}











