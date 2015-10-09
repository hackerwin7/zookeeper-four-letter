package pers.hw7.zk.monitor.utils.metrics;

/**
 * Created by hp on 15-2-2.
 */
public class WchsMetrics {

    public long watchConns;
    public long watchPaths;
    public long watches;

    public String toString() {
        return watchConns + "," + watchPaths + "," + watches;
    }

}
