package pers.hw7.zk.monitor.utils.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 15-2-2.
 */
public class WchcMetrics {

    public static Map<String, ArrayList<String>> mapSessionWatchPath = new HashMap<String, ArrayList<String>>();

    public void setData(String key, String value) {
        if (key == null || value == null || key.equals("") || value.equals("")) return;
        if (mapSessionWatchPath.containsKey(key)) {
            ArrayList<String> valueList = mapSessionWatchPath.get(key);
            if (valueList == null) {
                valueList = new ArrayList<String>();
            }
            valueList.add(value);
            mapSessionWatchPath.put(key, valueList);
        } else {
            ArrayList<String> valueList = new ArrayList<String>();
            valueList.add(value);
            mapSessionWatchPath.put(key, valueList);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ArrayList<String>> entry : mapSessionWatchPath.entrySet()) {
            String key = entry.getKey();
            sb.append(key + ":");
            ArrayList<String> value = entry.getValue();
            int i = 0;
            for(String v : value) {
                if(i == 0) sb.append(v);
                else sb.append(", " + v);
                i++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
