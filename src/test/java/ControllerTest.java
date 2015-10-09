import pers.hw7.zk.monitor.deployer.Controller;
import pers.hw7.zk.monitor.utils.metrics.MntrMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class ControllerTest {
    public static void main(String[] args) throws Exception {
        Controller cont = new Controller("192.168.144.110", 2181);
        MntrMetrics metrics = cont.getMNTR();
        System.out.println(metrics.toString());

    }
}
