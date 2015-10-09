package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.constants.DumpConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 15-2-3.
 */
public class DumpMetrics {

    public String sessionTrackerDump;
    public String ephemeralNodesDump;
    public Map<String, ArrayList<String>> mapDump = new HashMap<String, ArrayList<String>>();

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        key = key.trim();
        value = value.trim();
        if(key.equals(DumpConstants.SessionTracker_dump)) {
            sessionTrackerDump = value;
        } else if (key.equals(DumpConstants.ephemeral_nodes_dump)) {
            ephemeralNodesDump = value;
        } else {//add to map
            ArrayList<String> valueList = null;
            if(mapDump.containsKey(key)) {//key is session Id
                valueList = mapDump.get(key);
            } else {
                valueList = new ArrayList<String>();
            }
            valueList.add(value);
            mapDump.put(key,valueList);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DumpConstants.SessionTracker_dump + " : " + sessionTrackerDump + "\n");
        sb.append(DumpConstants.ephemeral_nodes_dump + " : " + ephemeralNodesDump + "\n");
        sb.append(DumpConstants.Sessions_with_Ephemerals + " : " + "\n");
        for(Map.Entry<String, ArrayList<String>> entry : mapDump.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> values = entry.getValue();
            sb.append(key + " : ");
            int i = 0;
            for(String v : values) {
                if(i == 0) {
                    sb.append(v);
                } else {
                    sb.append(", " + v);
                }
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
