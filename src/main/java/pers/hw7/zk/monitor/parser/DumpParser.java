package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.metrics.DumpMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class DumpParser {

    public static DumpMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        DumpMetrics dm = new DumpMetrics();
        String sline[] = str.split("\n");
        String key = null;
        String value = null;
        for(String l : sline) {
            if(l.contains(":")) {
                String ds[] = l.split(":");
                if(ds.length >= 1) {
                    key = ds[0].trim();
                }
            } else {
                value = l.trim();
                dm.setData(key, value);
            }
        }
        return dm;
    }

}
