### zookeeper-four-letter-words monitor

#### getting started
download the source and compile
```
mvn package
```
execute the jar package, for example
```
java -cp zookeeper-four-letter-1.0.jar pers.hw7.zk.monitor.zookeeper.FourLetterCommands 192.168.144.110 2181 mntr
```
* 192.168.144.110 :            your zookeeper server ip
* 2181 :                                your zookeeper server port
* mntr :                                zookeeper commands (such as conf,cons,wchc ...... )


#### API
add the jar to your classpath </br>
API example:
```
import pers.hw7.zk.monitor.deployer.Controller;
import pers.hw7.zk.monitor.utils.metrics.MntrMetrics;

public class ControllerTest {
    public static void main(String[] args) throws Exception {
        Controller cont = new Controller("192.168.144.110", 2181);
        MntrMetrics metrics = cont.getMNTR();
        System.out.println(metrics.toString());

    }
}

```

#### data format
all API return the metrics such as ConfMetrics , MntrMetrics

example MntrMetrics:
```
    public String version;
    public long avgLatency;
    public long maxLatency;
    public long minLatency;
    public long packetsReceived;
    public long packetsSent;
    public long numAliveConnections;
    public long outstandingRequests;
    public String serverState;
    public long znodeCount;
    public long watchCount;
    public long ephemeralsCount;
    public long approximateDataSize;
    public long openFileDescriptorCount;
    public long followers;
    public long syncedFollowers;
    public long pendingSyncs;
```

you can look for more details in pers.hw7.zk.monitor.utils.metrics package