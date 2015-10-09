package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.metrics.CrstMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class CrstParser {

    public static CrstMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        CrstMetrics cm = new CrstMetrics();
        cm.retInfo = str;
        return cm;
    }

}
