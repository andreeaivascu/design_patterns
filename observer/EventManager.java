import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {



    private HashMap listeners=new HashMap<String,String>();
    public void subscribe( String eventType, String listener)
    {
        listeners.put(eventType,listener);
    }
    
    public void unsubscribe(String eventType, String listener)
    {
        listeners.remove(eventType,listener);
    }


    public void notify(String eventType, String data)
    {
    ArrayList<EventListener> users= (ArrayList<EventListener>) listeners.get(eventType);
        for (EventListener listener:users)
        {
            listener.update(data);

        }
    }
}
