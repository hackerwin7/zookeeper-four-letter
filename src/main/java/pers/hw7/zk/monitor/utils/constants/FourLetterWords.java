package pers.hw7.zk.monitor.utils.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-26.
 */
public class FourLetterWords {

    public static final String conf = "conf";
    public static final String cons = "cons";
    public static final String crst = "crst";
    public static final String dump = "dump";
    public static final String envi = "envi";
    public static final String ruok = "ruok";
    public static final String srst = "srst";
    public static final String srvr = "srvr";
    public static final String stat = "stat";
    public static final String wchs = "wchs";
    public static final String wchc = "wchc";
    public static final String wchp = "wchp";
    public static final String mntr = "mntr";

    public static List<String> cmds = new ArrayList<String>();

    static {
        cmds.add(conf);
        cmds.add(cons);
        //cmds.add(crst);
        cmds.add(dump);
        cmds.add(envi);
        cmds.add(ruok);
        //cmds.add(srst);
        cmds.add(srvr);
        cmds.add(stat);
        cmds.add(wchs);
        cmds.add(wchc);
        cmds.add(wchp);
        cmds.add(mntr);
    }

}
