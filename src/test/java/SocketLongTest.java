import pers.hw7.zk.monitor.utils.constants.FourLetterWords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by hp on 15-2-27.
 */
public class SocketLongTest {
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("192.168.144.110", 2181);
        sock.setKeepAlive(true);
        //write
        OutputStream out = sock.getOutputStream();
        OutputStreamWriter outer = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(outer);
        for(String cmd : FourLetterWords.cmds) {
            bw.write(cmd);
            bw.flush();
        }
        //read
        InputStream in = sock.getInputStream();
        InputStreamReader iner = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(iner);
        for(String cmd : FourLetterWords.cmds) {
            String sline = "";
            StringBuffer sb = new StringBuffer();
            while ((sline = br.readLine()) != null) {
                sb.append(sline + "\n");
            }
            if(!sb.toString().equals(""))
                System.out.println(sb.toString());
        }
        sock.close();
    }
}
