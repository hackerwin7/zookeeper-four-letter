package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.constants.StatConstants;
import pers.hw7.zk.monitor.utils.metrics.StatMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class StatParser {

    public static StatMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        StatMetrics sm = new StatMetrics();
        String sline[] = str.split("\n");
        String key = null;
        String value = null;
        for(String l : sline) {
            if(l == null || l.equals("") || l.trim().equals("")) continue;
            String kv[] = l.split(":");
            if(StatConstants.keyCons.contains(kv[0])) {
                key = kv[0];
                if(kv.length >= 2) {
                    value = kv[1].trim();
                    if(kv.length > 2) {
                        for(int i = 2; i <= kv.length - 1; i++) {
                            value += ":" + kv[i];
                        }
                    }
                    sm.setData(key, value);
                }
            } else {
                value = l.trim();
                sm.setData(key, value);
            }
        }
        return sm;
    }
}
