package pers.hw7.zk.monitor.utils.driver;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by hp on 15-2-26.
 */
public class SocketGet {

    private Socket socket;
    private OutputStream out;
    private InputStream in;

    public String singleSocketGet(String ip, int port, String cmd) throws Exception {
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

    public void connect(String ip, int port) throws Exception {
        socket = new Socket(ip, port);
        out = socket.getOutputStream();
        in = socket.getInputStream();
    }

    public String cmdGet(String cmd) throws Exception {
        if(socket == null || out == null || in == null) return null;
        out.write(cmd.getBytes());
        out.flush();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read = 0;
        while ((read = in.read()) != -1) {
            baos.write(read);
        }
        String retData = new String(baos.toByteArray());
        return retData;
    }

    public void disconnect() throws Exception {
        out.close();
        in.close();
        socket.close();
    }
}
