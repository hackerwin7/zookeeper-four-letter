package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.constants.RuokConstants;

/**
 * Created by hp on 15-2-3.
 */
public class RuokMetrics {

    public String retInfo;


    public boolean isOk() {
        if(retInfo == null) return false;
        if(retInfo.equals(RuokConstants.imok)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.valueOf(isOk());
    }

}
