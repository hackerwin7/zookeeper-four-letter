package pers.hw7.zk.monitor.utils.assist;

/**
 * Created by hp on 15-2-2.
 */
public class Client {

    public String totalInfo;
    public String clientInfo;
    public long queued;
    public long received;
    public long sent;

    public static final String queuedCons = "queued";
    public static final String recvedCons = "recved";
    public static final String sentCons = "sent";

    public String toString() {
        return totalInfo;
    }

    public static Client toClient(String str) {
        if(str == null || !str.contains("/")) return null;
        Client client = new Client();
        client.totalInfo = str;
        client.clientInfo = str.substring(0, str.indexOf("("));
        String rear = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        String s1[] = rear.split(",");
        for(String s1s : s1) {
            String s2[] = s1s.split("=");
            if(s2[0].equals(queuedCons)) {
                client.queued = Long.valueOf(s2[1].trim());
            } else if (s2[0].equals(recvedCons)) {
                client.received = Long.valueOf(s2[1].trim());
            } else if (s2[0].equals(sentCons)) {
                client.sent = Long.valueOf(s2[1].trim());
            } else {
                //nothing
            }
        }
        return client;
    }
}
