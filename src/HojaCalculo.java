import java.util.ArrayList;
import java.util.List;

public class HojaCalculo extends Archivo implements EventManager
{

    private List<EventListener> listeners;

    public HojaCalculo(int id, String nombre)
    {
        super(id, nombre);
        listeners = new ArrayList<>();
    }

    public void modifyData(String nombre)
    {
        notifySubscribers("Se editan datos en " + nombre);
    }

    public void deleteData()
    {
        notifySubscribers("Se borran datos en "+getNombre());
    }

    @Override
    public void subscribe(Object nuevo)
    {
           listeners.add((EventListener)nuevo);
    }

    @Override
    public void unsubscribe(Object saliente) {
        listeners.remove((EventListener) saliente);
    }

    @Override
    public void notifySubscribers(String nombre) {
        for(EventListener archivo : listeners)
        {
            archivo.update(nombre);
        }
    }
}
