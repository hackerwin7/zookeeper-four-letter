package pers.hw7.zk.monitor.utils.metrics;

import pers.hw7.zk.monitor.utils.constants.EnviConstants;

/**
 * Created by hp on 15-2-3.
 */
public class EnviMetrics {

    public String zookeeper_version;
    public String host_name;
    public String java_version;
    public String java_vendor;
    public String java_home;
    public String java_class_path;
    public String java_library_path;
    public String java_io_tmpdir;
    public String java_compiler;
    public String os_name;
    public String os_arch;
    public String os_version;
    public String user_name;
    public String user_home;
    public String user_dir;

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        key = key.trim();
        value = value.trim();
        if(key.equals(EnviConstants.zookeeper_version)) {
            zookeeper_version = value;
        } else if (key.equals(EnviConstants.host_name)) {
            host_name = value;
        } else if (key.equals(EnviConstants.java_version)) {
            java_version = value;
        } else if (key.equals(EnviConstants.java_vendor)) {
            java_vendor = value;
        } else if (key.equals(EnviConstants.java_home)) {
            java_home = value;
        } else if (key.equals(EnviConstants.java_class_path)) {
            java_class_path = value;
        } else if (key.equals(EnviConstants.java_library_path)) {
            java_library_path = value;
        } else if (key.equals(EnviConstants.java_io_tmpdir)) {
            java_io_tmpdir = value;
        } else if (key.equals(EnviConstants.java_compiler)) {
            java_compiler = value;
        } else if (key.equals(EnviConstants.os_name)) {
            os_name = value;
        } else if (key.equals(EnviConstants.os_arch)) {
            os_arch = value;
        } else if (key.equals(EnviConstants.os_version)) {
            os_version = value;
        } else if (key.equals(EnviConstants.user_name)) {
            user_name = value;
        } else if (key.equals(EnviConstants.user_home)) {
            user_home = value;
        } else if (key.equals(EnviConstants.user_dir)) {
            user_dir = value;
        } else {
            //nothing
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnviConstants.zookeeper_version + " : " + zookeeper_version + "\n");
        sb.append(EnviConstants.host_name + " : " + host_name + "\n");
        sb.append(EnviConstants.java_version + " : " + java_version + "\n");
        sb.append(EnviConstants.java_vendor + " : " + java_vendor + "\n");
        sb.append(EnviConstants.java_home + " : " + java_home + "\n");
        sb.append(EnviConstants.java_class_path + " : " + java_class_path + "\n");
        sb.append(EnviConstants.java_library_path + " : " + java_library_path + "\n");
        sb.append(EnviConstants.java_io_tmpdir + " : " + java_io_tmpdir + "\n");
        sb.append(EnviConstants.java_compiler + " : " + java_compiler + "\n");
        sb.append(EnviConstants.os_name + " : " + os_name + "\n");
        sb.append(EnviConstants.os_arch + " : " + os_arch + "\n");
        sb.append(EnviConstants.os_version + " : " + os_version + "\n");
        sb.append(EnviConstants.user_name + " : " + user_name + "\n");
        sb.append(EnviConstants.user_home + " : " + user_home + "\n");
        sb.append(EnviConstants.user_dir + " : " + user_dir + "\n");

        return sb.toString();
    }

}
