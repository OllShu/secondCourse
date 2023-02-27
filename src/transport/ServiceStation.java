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
    public void makeTechnicalInspection () {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.passDiagnostics();
        }
    }
    public void checkAddToQueue (Transport transport) {
        if(transport.isNotBus()) {
            queue.add(transport);
            System.out.println("Авто " + transport.getBrand() + " " + transport.getModel()+" добавлено в очередь");
        } else System.out.println("Авто " + transport.getBrand() + " " + transport.getModel()+
                " в очередь не добавлено. Автобусы не проходят проверку перед заездом.");
        }
    }


