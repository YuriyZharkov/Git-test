

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Юра on 04.08.2016.
 */
public class MyClass2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://80rush.adr.com.ua");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            char [] buf = new char [100];
            StringBuilder sb = new StringBuilder();
            int r;

            do{
                if ((r=br.read(buf))>0){
                    sb.append(new String(buf, 0, r));
                }
            }
            while(r > 0);
            System.out.println(sb.toString());
        }finally{
            httpURLConnection.disconnect();
        }

    }
}
