import java.util.ArrayList;
import java.util.List;

public class Police implements EventProducer {
    private static Police mvd;
    List<Observer> observers = new ArrayList<>();

    public Police() {
    }

    public static Police getinstance() {
        if (mvd == null) {
            mvd = new Police();
        }
        return mvd;
    }

    @Override
    public void event(String messenge) {
        for (Observer o:observers){
            o.attention(messenge);
        }

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
