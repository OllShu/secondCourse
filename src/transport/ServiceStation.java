package transport;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }
    public void addToQueue (Transport transport) {
        if(transport.isNotBus()) queue.add(transport);
    }
    public void makeTechnicalInspection (Transport transport) {
        if (!queue.isEmpty()) {
            transport = queue.poll();
            transport.passDiagnostics();
        }
    }

}
