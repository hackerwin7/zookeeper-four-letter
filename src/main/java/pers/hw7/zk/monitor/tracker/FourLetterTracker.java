package pers.hw7.zk.monitor.tracker;

import pers.hw7.zk.monitor.zookeeper.ZkFourLetter;

import java.util.Map;

/**
 * Created by hp on 15-2-26.
 */
public class FourLetterTracker {
    private ZkFourLetter zkfl = null;
    private String ip = null;
    private int port;

    public void start() throws Exception {
        if(ip == null) throw new Exception("ip or port have not been initialized!");
        //tracker the info
        zkfl = new ZkFourLetter(ip, port);
        zkfl.start();
    }

    public void start(String cmd) throws Exception {
        if(ip == null) throw new Exception("ip or port have not been initialized!");
        //tracker the info
        zkfl = new ZkFourLetter(ip, port);
        zkfl.start(cmd);
    }

    public void close() throws Exception {
        if(zkfl != null) {
            zkfl.close();
            zkfl = null;
        }
    }

    public Map<String, String> getInfo() throws Exception {
        return zkfl.cmdData;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
