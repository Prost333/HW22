public interface EventProducer {
    void  event(String messenge);
    void  addObserver(Observer observer);

}
