package pers.hw7.zk.monitor.utils.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-3.
 */
public class DumpConstants {

    public static final String SessionTracker_dump = "SessionTracker dump";
    public static final String ephemeral_nodes_dump = "ephemeral nodes dump";
    public static final String Sessions_with_Ephemerals = "Sessions with Ephemerals";

    public static List<String> keyCons = new ArrayList<String>();

    static {
        keyCons.add(SessionTracker_dump);
        keyCons.add(ephemeral_nodes_dump);
        keyCons.add(Sessions_with_Ephemerals);
    }
}
