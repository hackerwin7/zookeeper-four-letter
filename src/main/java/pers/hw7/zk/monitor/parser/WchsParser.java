package pers.hw7.zk.monitor.parser;

import pers.hw7.zk.monitor.utils.constants.WchsConstants;
import pers.hw7.zk.monitor.utils.metrics.WchsMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class WchsParser {
    public static WchsMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        WchsMetrics wm = new WchsMetrics();
        long conns = Long.valueOf(str.substring(0, str.indexOf(WchsConstants.connections)).trim());
        long paths = Long.valueOf(str.substring(str.indexOf(WchsConstants.watching) + WchsConstants.watching.length(), str.indexOf(WchsConstants.paths)).trim());
        String ss[] = str.split(":");
        long watches = Long.valueOf(ss[1].trim());
        wm.watchConns = conns;
        wm.watchPaths = paths;
        wm.watches = watches;
        return wm;
    }
}
