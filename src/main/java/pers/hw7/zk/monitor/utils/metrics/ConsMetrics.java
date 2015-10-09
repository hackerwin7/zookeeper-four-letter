package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.assist.Connection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-3.
 */
public class ConsMetrics {

    public List<Connection> connList = new ArrayList<Connection>();

    public void addData(String str) {
        if(str == null || str.equals("")) return;
        str = str.trim();
        Connection co = Connection.toConn(str);
        if(co != null) {
            connList.add(co);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Connection conn : connList) {
            sb.append(conn.toString() + "\n\n");
        }

        return sb.toString();
    }

}
