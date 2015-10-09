import pers.hw7.zk.monitor.utils.metrics.SrvrMetrics;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by hp on 15-2-3.
 */
public class Simple4LetterTestSrvr {

    private static int cnt = 1;

    private static void delay(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i <= cnt - 1) {
            SrvrMetrics srvr = new SrvrMetrics();
            String ans = socketCmd("192.168.144.111",2181,"srvr");
            System.out.println(ans);
            String lines[] = ans.split("\n");
            for(String line : lines) {
                String ldata = line.trim();
                String ds[] = ldata.split(":");
                if(ds.length >= 2) {
                    String key = ds[0].trim();
                    String value = ds[1].trim();
                    if(ds.length > 2) {
                        for(int j = 2 ; j <= ds.length - 1; j++) {
                            value += ds[j].trim();
                        }
                    }
                    srvr.setData(key,value);
                }
            }
            System.out.println(srvr.toString());
            i++;
        }
        System.out.println("num : " + i);
    }


    private static String socketCmd(String ip, int port, String cmd) throws Exception {
        Socket socket = new Socket(ip, port);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        out.write(cmd.getBytes());
        out.flush();
        //socket.shutdownOutput();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read = 0;
        while ((read = in.read()) != -1) {
            baos.write(read);
        }
        String data = new String(baos.toByteArray());
        socket.close();
        return data;
    }

    private static InputStream getInputStream(String str) throws Exception {
        if(str != null && !str.trim().equals("")) {
            ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
            return bais;
        } else {
            return null;
        }
    }

    private static BufferedReader getBufferedReader(String str) throws Exception {
        InputStream in = getInputStream(str);
        if(str != null && !str.trim().equals("") && in != null) {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            return br;
        } else {
            return null;
        }
    }

}
