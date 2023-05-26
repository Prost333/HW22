import java.util.ArrayList;
import java.util.List;

public class Mhs implements  EventProducer{
   private static Mhs mhs;
    private  List<Observer> obserdList=new ArrayList<>();

   private Mhs() {

    }
    public  static Mhs getinstance(){
        if (mhs == null){
            mhs=new Mhs();
        }
        return mhs;
    }

    @Override
    public void event(String messenge) {
           for (Observer o:obserdList) {
               o.attention(messenge);
       }


    }

    @Override
    public void addObserver(Observer observer) {
        obserdList.add(observer);
    }
}
