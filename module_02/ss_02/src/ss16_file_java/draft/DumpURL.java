package ss16_file_java.draft;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DumpURL {
    public static void main(String[] args) {

        String line;
        try{
            URL url = new URL(" https://www.google.com.vn/?hl=vi");
            URLConnection connection = url.openConnection();
            InputStream stream = connection.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(stream);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
