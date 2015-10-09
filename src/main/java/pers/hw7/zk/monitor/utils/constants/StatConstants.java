package pers.hw7.zk.monitor.utils.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-2.
 */
public class StatConstants {

    public static final String Zookeeper_version = "Zookeeper version";
    public static final String Clients = "Clients";
    public static final String Latency = "Latency min/avg/max";
    public static final String Received = "Received";
    public static final String Sent = "Sent";
    public static final String Connections = "Connections";
    public static final String Outstanding = "Outstanding";
    public static final String Zxid = "Zxid";
    public static final String Mode = "Mode";
    public static final String Node_count = "Node count";

    public static List<String> keyCons = new ArrayList<String>();

    static {
        keyCons.add(Zookeeper_version);
        keyCons.add(Clients);
        keyCons.add(Latency);
        keyCons.add(Received);
        keyCons.add(Sent);
        keyCons.add(Connections);
        keyCons.add(Outstanding);
        keyCons.add(Zxid);
        keyCons.add(Mode);
        keyCons.add(Node_count);
    }

}
