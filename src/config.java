import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class config {
    public static Map<String, Integer> ipMap = new ConcurrentHashMap<>();
    static {
        ipMap.put("192.168.1.1", 3);
        ipMap.put("192.168.1.2", 2);
        ipMap.put("192.168.1.3", 1);
        ipMap.put("192.168.1.4", 5);
        ipMap.put("192.168.1.5", 5);
        ipMap.put("192.168.1.6", 5);
        ipMap.put("192.168.1.7", 5);
        ipMap.put("192.168.1.8", 5);
        ipMap.put("192.168.1.9", 5);
        ipMap.put("192.168.1.10", 5);
    }
}

