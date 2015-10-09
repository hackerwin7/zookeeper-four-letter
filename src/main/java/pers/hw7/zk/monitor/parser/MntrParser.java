package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.constants.FourLetterSplit;
import pers.hw7.zk.monitor.utils.metrics.MntrMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class MntrParser {
    public static MntrMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        MntrMetrics mm = new MntrMetrics();
        String sline[] = str.split("\n");
        for(String l : sline) {
            if(l == null || l.equals("") || l.trim().equals("")) continue;
            String kv[] = l.split(FourLetterSplit.mntr);
            if(kv.length == 2) {
                String key = kv[0];
                String value = kv[1];
                mm.setData(key, value);
            }
        }
        return mm;
    }
}
