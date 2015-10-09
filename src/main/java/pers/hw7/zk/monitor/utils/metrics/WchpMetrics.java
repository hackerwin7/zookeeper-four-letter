package pers.hw7.zk.monitor.utils.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 15-2-2.
 */
public class WchpMetrics {

    public static Map<String, ArrayList<String>> mapWathPathSession = new HashMap<String, ArrayList<String>>();

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        if(mapWathPathSession.containsKey(key)) {
            ArrayList<String> valueList = mapWathPathSession.get(key);
            if(valueList == null) {
                valueList = new ArrayList<String>();
            }
            valueList.add(value);
            mapWathPathSession.put(key, valueList);
        } else {
            ArrayList<String> valueList = new ArrayList<String>();
            valueList.add(value);
            mapWathPathSession.put(key, valueList);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, ArrayList<String>> entry : mapWathPathSession.entrySet()) {
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
