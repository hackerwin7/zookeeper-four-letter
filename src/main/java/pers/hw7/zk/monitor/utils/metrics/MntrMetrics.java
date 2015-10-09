package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.constants.MntrConstants;

/**
 * Created by hp on 15-2-2.
 */
public class MntrMetrics {

    public String version;
    public long avgLatency;
    public long maxLatency;
    public long minLatency;
    public long packetsReceived;
    public long packetsSent;
    public long numAliveConnections;
    public long outstandingRequests;
    public String serverState;
    public long znodeCount;
    public long watchCount;
    public long ephemeralsCount;
    public long approximateDataSize;
    public long openFileDescriptorCount;
    public long followers;
    public long syncedFollowers;
    public long pendingSyncs;

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        if(key.equals(MntrConstants.zk_version)) {
            version = value;
        } else if (key.equals(MntrConstants.zk_avg_latency)) {
            avgLatency = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_max_latency)) {
            maxLatency = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_min_latency)) {
            minLatency = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_packets_received)) {
            packetsReceived = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_packets_sent)) {
            packetsSent = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_num_alive_connections)) {
            numAliveConnections = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_outstanding_requests)) {
            outstandingRequests = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_server_state)) {
            serverState = value;
        } else if (key.equals(MntrConstants.zk_znode_count)) {
            znodeCount = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_watch_count)) {
            watchCount = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_ephemerals_count)) {
            ephemeralsCount = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_approximate_data_size)) {
            approximateDataSize = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_open_file_descriptor_count)) {
            openFileDescriptorCount = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_followers)) {
            followers = Long.valueOf(value);
        } else if (key.equals(MntrConstants.zk_synced_followers)) {
            syncedFollowers = Long.valueOf(value);
        } else if(key.equals(MntrConstants.zk_pending_syncs)) {
            pendingSyncs = Long.valueOf(value);
        } else {
            //nothing
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("version:" + version + "\n");
        sb.append("avgLatency:" + avgLatency + "\n");
        sb.append("maxLatency:" + maxLatency + "\n");
        sb.append("minLatency:" + minLatency + "\n");
        sb.append("packetsReceived:" + packetsReceived + "\n");
        sb.append("packetsSent:" + packetsSent + "\n");
        sb.append("numAliveConnections:" + numAliveConnections + "\n");
        sb.append("outstandingRequests:" + outstandingRequests + "\n");
        sb.append("serverState:" + serverState + "\n");
        sb.append("znodeCount:" + znodeCount + "\n");
        sb.append("watchCount:" + watchCount + "\n");
        sb.append("ephemeralsCount:" + ephemeralsCount + "\n");
        sb.append("approximateDataSize:" + approximateDataSize + "\n");
        sb.append("openFileDescriptorCount:" + openFileDescriptorCount + "\n");
        sb.append("followers:" + followers + "\n");
        sb.append("syncedFollowers:" + syncedFollowers + "\n");
        sb.append("pendingSyncs:" + pendingSyncs + "\n");
        return sb.toString();
    }
}
