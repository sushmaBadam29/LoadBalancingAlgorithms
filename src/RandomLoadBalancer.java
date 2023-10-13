import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class RandomLoadBalancer implements LoadBalance{
    @Override
    public String getServer(String clientIp) {
        Set<String> servers = config.ipMap.keySet();
        List<String> serverList = new ArrayList<>();
        serverList.addAll(servers);
        int randomIndex = new Random().nextInt(serverList.size());
        String target = serverList.get(randomIndex);

        return target;
    }
}
