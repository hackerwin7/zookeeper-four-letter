package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.constants.ConfConstants;

/**
 * Created by hp on 15-2-3.
 */
public class ConfMetrics {

    public int clientPort;
    public String dataDir;
    public String dataLogDir;
    public int tickTime;
    public int maxClientCnxns;
    public int minSessionTimeout;
    public int maxSessionTimeout;
    public int serverId;
    public int initLimit;
    public int syncLimit;
    public int electionAlg;
    public int electionPort;
    public int quorumPort;
    public int peerType;

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        key = key.trim();
        value = value.trim();
        if(key.equals(ConfConstants.clientPort)) {
            clientPort = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.dataDir)) {
            dataDir = value;
        } else if (key.equals(ConfConstants.dataLogDir)) {
            dataLogDir = value;
        } else if (key.equals(ConfConstants.tickTime)) {
            tickTime = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.maxClientCnxns)) {
            maxClientCnxns = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.minSessionTimeout)) {
            minSessionTimeout = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.maxSessionTimeout)) {
            maxSessionTimeout = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.serverId)) {
            serverId = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.initLimit)) {
            initLimit = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.syncLimit)) {
            syncLimit = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.electionAlg)) {
            electionAlg = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.electionPort)) {
            electionPort = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.quorumPort)) {
            quorumPort = Integer.valueOf(value);
        } else if (key.equals(ConfConstants.peerType)) {
            peerType = Integer.valueOf(value);
        } else {
            //nothing
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfConstants.clientPort + ":" + clientPort + "\n");
        sb.append(ConfConstants.dataDir + ":" + dataDir + "\n");
        sb.append(ConfConstants.dataLogDir + ":" + dataLogDir + "\n");
        sb.append(ConfConstants.tickTime + ":" + tickTime + "\n");
        sb.append(ConfConstants.maxClientCnxns + ":" + maxClientCnxns + "\n");
        sb.append(ConfConstants.minSessionTimeout + ":" + minSessionTimeout + "\n");
        sb.append(ConfConstants.maxSessionTimeout + ":" + maxSessionTimeout + "\n");
        sb.append(ConfConstants.serverId + ":" + serverId + "\n");
        sb.append(ConfConstants.initLimit + ":" +initLimit + "\n");
        sb.append(ConfConstants.syncLimit + ":" + syncLimit + "\n");
        sb.append(ConfConstants.electionAlg + ":" + electionAlg + "\n");
        sb.append(ConfConstants.electionPort + ":" + electionPort + "\n");
        sb.append(ConfConstants.quorumPort + ":" + quorumPort + "\n");
        sb.append(ConfConstants.peerType + ":" + peerType + "\n");

        return sb.toString();
    }

}
