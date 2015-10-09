package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.metrics.WchpMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class WchpParser {
    public static WchpMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        WchpMetrics wm = new WchpMetrics();
        String sline[] = str.split("\n");
        String key = null;
        String value = null;
        for(String l : sline) {
            if(l == null || l.equals("") || l.trim().equals("")) continue;
            if(l.contains("/")) {
                key = l.trim();
            } else {
                value = l.trim();
                wm.setData(key, value);
            }
        }
        return wm;
    }
}
