package pers.hw7.zk.monitor.zookeeper;

import pers.hw7.zk.monitor.utils.constants.FourLetterWords;
import pers.hw7.zk.monitor.utils.driver.SocketGet;
import pers.hw7.zk.monitor.utils.conf.SocketConf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hp on 15-2-26.
 */
public class ZkFourLetter {

    private SocketConf skconf = new SocketConf();
    private SocketGet skg;
    public Map<String, String> cmdData = new HashMap<String, String>();

    public ZkFourLetter(String ip, int port) {
        skconf.ip = ip;
        skconf.port = port;
    }

    public void start() throws Exception {
        //initialize
        skg = new SocketGet();

        List<String> cmds = FourLetterWords.cmds;
        for(String cmd : cmds) {
            skg.connect(skconf.ip, skconf.port);
            String key = cmd;
            String value = skg.cmdGet(cmd);
            if (key != null && value != null) {
                cmdData.put(key, value);
            }
            skg.disconnect();
        }

    }

    public void start(String cmd) throws Exception {
        skg = new SocketGet();
        skg.connect(skconf.ip, skconf.port);
        String key = cmd;
        String value = skg.cmdGet(cmd);
        if (key != null && value != null) {
            cmdData.put(key, value);
        }
        skg.disconnect();
    }

    public void close() throws Exception {
        skg.disconnect();
    }
}
