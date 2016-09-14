

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class MyClass {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("prog.kiev.ua", 80);
        try{
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("GET /HTTP/1.1");
            pw.println("Host: 80rush.adr.com.ua");
            pw.println("");
            pw.flush();

            InputStream s = socket.getInputStream();
            byte [] buf = new byte [1000];
            int r;

            do{
                if((r=s.read(buf))>0){
                    System.out.println(new String(buf, 0, r));
                }
            }
            while(r>0);
        }finally{
            socket.close();
        }
    }
}
