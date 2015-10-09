package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.constants.FourLetterSplit;
import pers.hw7.zk.monitor.utils.metrics.SrvrMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class SrvrParser {

    public static SrvrMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        SrvrMetrics sm = new SrvrMetrics();
        String sline[] = str.split("\n");
        for(String l : sline) {
            if(l == null || l.equals("") || l.trim().equals("")) continue;
            String kv[] = l.split(FourLetterSplit.srvr);
            if(kv.length == 2) {
                String key = kv[0];
                String value = kv[1];
                sm.setData(key, value);
            }
        }
        return sm;
    }

}
