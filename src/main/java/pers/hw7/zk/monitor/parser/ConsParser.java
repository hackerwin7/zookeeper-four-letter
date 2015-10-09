package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.metrics.ConsMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class ConsParser {

    public static ConsMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        ConsMetrics cm = new ConsMetrics();
        String sline[] = str.split("\n");
        for(String l : sline) {
            cm.addData(l.trim());
        }
        return cm;
    }

}
