package pers.hw7.zk.monitor.utils.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-2.
 */
public class MntrConstants {

    public static final String zk_version = "zk_version";
    public static final String zk_avg_latency = "zk_avg_latency";
    public static final String zk_max_latency = "zk_max_latency";
    public static final String zk_min_latency = "zk_min_latency";
    public static final String zk_packets_received = "zk_packets_received";
    public static final String zk_packets_sent = "zk_packets_sent";
    public static final String zk_num_alive_connections = "zk_num_alive_connections";
    public static final String zk_outstanding_requests = "zk_outstanding_requests";
    public static final String zk_server_state = "zk_server_state";
    public static final String zk_znode_count = "zk_znode_count";
    public static final String zk_watch_count = "zk_watch_count";
    public static final String zk_ephemerals_count = "zk_ephemerals_count";
    public static final String zk_approximate_data_size = "zk_approximate_data_size";
    public static final String zk_open_file_descriptor_count = "zk_open_file_descriptor_count";
    public static final String zk_max_file_descriptor_count = "zk_max_file_descriptor_count";
    public static final String zk_followers = "zk_followers";
    public static final String zk_synced_followers = "zk_synced_followers";
    public static final String zk_pending_syncs = "zk_pending_syncs";

    public static List<String> keyCons = new ArrayList<String>();

    static {
        keyCons.add(zk_version);
        keyCons.add(zk_avg_latency);
        keyCons.add(zk_max_latency);
        keyCons.add(zk_min_latency);
        keyCons.add(zk_packets_received);
        keyCons.add(zk_packets_sent);
        keyCons.add(zk_num_alive_connections);
        keyCons.add(zk_outstanding_requests);
        keyCons.add(zk_server_state);
        keyCons.add(zk_znode_count);
        keyCons.add(zk_watch_count);
        keyCons.add(zk_ephemerals_count);
        keyCons.add(zk_approximate_data_size);
        keyCons.add(zk_open_file_descriptor_count);
        keyCons.add(zk_max_file_descriptor_count);
        keyCons.add(zk_followers);
        keyCons.add(zk_synced_followers);
        keyCons.add(zk_pending_syncs);
    }

}
