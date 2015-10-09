package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.metrics.WchcMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class WchcParser {
    public static WchcMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        WchcMetrics wm = new WchcMetrics();
        String sline[] = str.split("\n");
        String key = null;
        String value = null;
        for(String l : sline) {
            if(l == null || l.equals("") || l.trim().equals("")) continue;
            String data = l.trim();
            if(!data.contains("/")) {
                key = data;
            } else {
                value = data;
                wm.setData(key, value);
            }
        }
        return wm;
    }
}
