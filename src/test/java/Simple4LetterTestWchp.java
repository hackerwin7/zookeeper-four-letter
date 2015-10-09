import pers.hw7.zk.monitor.utils.metrics.WchpMetrics;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by hp on 15-2-2.
 */
public class Simple4LetterTestWchp {

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
            WchpMetrics wchp = new WchpMetrics();
            String ans = socketCmd("192.168.144.111",2181,"wchp");
            System.out.println(ans);
            BufferedReader br = getBufferedReader(ans);
            String line = null;
            String key = null;
            String value = null;
            while ((line = br.readLine()) != null) {
                if(line.contains("/")) { //is key
                    key = line.trim();
                } else {
                    value = line.trim();
                    wchp.setData(key, value);
                }
            }
            System.out.println(wchp.toString());
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
