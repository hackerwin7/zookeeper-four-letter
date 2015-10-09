package pers.hw7.zk.monitor.utils.assist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-3.
 */
public class Connection {

    public String totalInfo;

    public String address;
    public int port;
    public int index;

    public long queued;
    public long recved;
    public long sent;
    public String sid;
    public String lop;
    public long est;//timestamp?
    public long to;
    public String lcxid;
    public String lzxid;
    public long lresp;
    public long llat;
    public long minlat;
    public long avglat;
    public long maxlat;

    public static final String queuedCon = "queued";
    public static final String recvedCon = "recved";
    public static final String sentCon = "sent";
    public static final String sidCon = "sid";
    public static final String lopCon = "lop";
    public static final String estCon = "est";
    public static final String toCon = "to";
    public static final String lcxidCon = "lcxid";
    public static final String lzxidCon = "lzxid";
    public static final String lrespCon = "lresp";
    public static final String llatCon = "llat";
    public static final String minlatCon = "minlat";
    public static final String avglatCon = "avglat";
    public static final String maxlatCon = "maxlat";

    public static List<String> keyCons = new ArrayList<String>();

    static {
        keyCons.add(queuedCon);
        keyCons.add(recvedCon);
        keyCons.add(sentCon);
        keyCons.add(sidCon);
        keyCons.add(lopCon);
        keyCons.add(estCon);
        keyCons.add(toCon);
        keyCons.add(lcxidCon);
        keyCons.add(lzxidCon);
        keyCons.add(lrespCon);
        keyCons.add(llatCon);
        keyCons.add(minlatCon);
        keyCons.add(avglatCon);
        keyCons.add(maxlatCon);
    }

    public static Connection toConn(String str) {
        if(str == null || str.equals("") || !str.contains("/")) return null;
        Connection conn = new Connection();
        conn.totalInfo = str;
        String ss[] = str.split("\\(");
        if(ss.length == 2) {
            String s1 = ss[0].trim();
            String s2 = ss[1].trim();
            //deal s1
            conn.address = s1.substring(s1.indexOf("/") + 1, s1.indexOf(":"));
            conn.port = Integer.valueOf(s1.substring(s1.indexOf(":") + 1, s1.indexOf("[")));
            conn.index = Integer.valueOf(s1.substring(s1.indexOf("[") + 1, s1.indexOf("]")));
            //deal s2
            s2 = s2.substring(0, s2.indexOf(")"));
            String datas[] = s2.split(",");
            for(String data : datas) {
                String kv[] = data.split("=");
                if(kv.length == 2) {
                    String key = kv[0].trim();
                    String value = kv[1].trim();
                    conn.setData(key, value);
                }
            }
        } else {
            conn = null;
        }

        return conn;
    }

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        key = key.trim();
        value = value.trim();
        if(key.equals(queuedCon)) {
            queued = Long.valueOf(value);
        } else if (key.equals(recvedCon)) {
            recved = Long.valueOf(value);
        } else if (key.equals(sentCon)) {
            sent = Long.valueOf(value);
        } else if (key.equals(sidCon)) {
            sid = value;
        } else if (key.equals(lopCon)) {
            lop = value;
        } else if (key.equals(estCon)) {
            est = Long.valueOf(value);
        } else if (key.equals(toCon)) {
            to = Long.valueOf(value);
        } else if (key.equals(lcxidCon)) {
            lcxid = value;
        } else if (key.equals(lzxidCon)) {
            lzxid = value;
        } else if (key.equals(lrespCon)) {
            lresp = Long.valueOf(value);
        } else if (key.equals(llatCon)) {
            llat = Long.valueOf(value);
        } else if (key.equals(minlatCon)) {
            minlat = Long.valueOf(value);
        } else if (key.equals(avglatCon)) {
            avglat = Long.valueOf(value);
        } else if (key.equals(maxlatCon)) {
            maxlat = Long.valueOf(value);
        } else {
            //nothing
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("address" + ":" + address + "\n");
        sb.append("port" + ":" + port + "\n");
        sb.append("index" + ":" + index + "\n");
        sb.append(queuedCon + ":" + queued + "\n");
        sb.append(recvedCon + ":" + recved + "\n");
        sb.append(sentCon + ":" + sent + "\n");
        sb.append(sidCon + ":" + sid + "\n");
        sb.append(lopCon + ":" + lop + "\n");
        sb.append(estCon + ":" + est + "\n");
        sb.append(toCon + ":" + to + "\n");
        sb.append(lcxidCon + ":" + lcxid + "\n");
        sb.append(lzxidCon + ":" + lzxid + "\n");
        sb.append(lrespCon + ":" + lresp + "\n");
        sb.append(llatCon + ":" + llat + "\n");
        sb.append(minlatCon + ":" + minlat + "\n");
        sb.append(avglatCon + ":" + avglat + "\n");
        sb.append(maxlatCon + ":" + maxlat + "\n");

        return sb.toString();
    }
}
