package pers.hw7.zk.monitor.utils.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-3.
 */
public class EnviConstants {

    public static final String zookeeper_version = "zookeeper.version";
    public static final String host_name = "host.name";
    public static final String java_version = "java.version";
    public static final String java_vendor = "java.vendor";
    public static final String java_home = "java.home";
    public static final String java_class_path = "java.class.path";
    public static final String java_library_path = "java.library.path";
    public static final String java_io_tmpdir = "java.io.tmpdir";
    public static final String java_compiler = "java.compiler";
    public static final String os_name = "os.name";
    public static final String os_arch = "os.arch";
    public static final String os_version = "os.version";
    public static final String user_name = "user.name";
    public static final String user_home = "user.home";
    public static final String user_dir = "user.dir";

    public static List<String> keyCons = new ArrayList<String>();

    static {
        keyCons.add(zookeeper_version);
        keyCons.add(host_name);
        keyCons.add(java_version);
        keyCons.add(java_vendor);
        keyCons.add(java_home);
        keyCons.add(java_class_path);
        keyCons.add(java_library_path);
        keyCons.add(java_io_tmpdir);
        keyCons.add(java_compiler);
        keyCons.add(os_name);
        keyCons.add(os_arch);
        keyCons.add(os_version);
        keyCons.add(user_name);
        keyCons.add(user_home);
        keyCons.add(user_dir);
    }

}
