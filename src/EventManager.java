public interface EventManager
{
        public void subscribe(Object nuevo);
        public void unsubscribe(Object saliente);
        public void notifySubscribers(String nombre);
}
