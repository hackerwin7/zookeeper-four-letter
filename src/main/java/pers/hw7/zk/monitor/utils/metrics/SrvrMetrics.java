package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.constants.SrvrConstants;
import pers.hw7.zk.monitor.utils.constants.StatConstants;

/**
 * Created by hp on 15-2-3.
 */
public class SrvrMetrics {

    public String version;
    public long minLatency;
    public long maxLatency;
    public long avgLatency;
    public long received;
    public long sent;
    public long connections;
    public long outstanding;
    public String zxid;
    public String mode;
    public long nodeCount;

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        value = value.trim();
        key = key.trim();
        if(key.equals(SrvrConstants.Zookeeper_version)) {
            version = value;
        } else if (key.equals(StatConstants.Latency)) {
            String ss[] = value.split("/");
            minLatency = Long.valueOf(ss[0].trim());
            avgLatency = Long.valueOf(ss[1].trim());
            maxLatency = Long.valueOf(ss[2].trim());
        } else if (key.equals(StatConstants.Received)) {
            received = Long.valueOf(value);
        } else if (key.equals(StatConstants.Sent)) {
            sent = Long.valueOf(value);
        } else if (key.equals(StatConstants.Connections)) {
            connections = Long.valueOf(value);
        } else if (key.equals(StatConstants.Outstanding)) {
            outstanding = Long.valueOf(value);
        } else if (key.equals(StatConstants.Zxid)) {
            zxid = value;
        } else if (key.equals(StatConstants.Mode)) {
            mode = value;
        } else if (key.equals(StatConstants.Node_count)) {
            nodeCount = Long.valueOf(value);
        } else {
            //nothing
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatConstants.Zookeeper_version + " : " + version + "\n");
        sb.append(StatConstants.Latency + " : " + minLatency + "#" + avgLatency + "#" + maxLatency + "\n");
        sb.append(StatConstants.Received + " : " + received + "\n");
        sb.append(StatConstants.Sent + " : " + sent + "\n");
        sb.append(StatConstants.Connections + " : " + connections + "\n");
        sb.append(StatConstants.Outstanding + " : " + outstanding + "\n");
        sb.append(StatConstants.Zxid + " : " + zxid + "\n");
        sb.append(StatConstants.Mode + " : " + mode + "\n");
        sb.append(StatConstants.Node_count + " : " + nodeCount + "\n");

        return sb.toString();
    }

}
