package pers.hw7.zk.monitor.zookeeper;

import pers.hw7.zk.monitor.deployer.Controller;

/**
 * Created by hp on 15-2-27.
 */
public class FourLetterCommands {

    public static void main(String[] args) throws Exception{
        if(args.length == 3) {
            Controller cont = new Controller(args[0], Integer.valueOf(args[1]));
            cont.start(args[2]);
        }
    }

}
