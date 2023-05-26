import java.util.ArrayList;
import java.util.List;

public class MTS implements  Observer{

    private  static String defaultMesseng= "Вас оповещает МТС";


    @Override
    public void attention(String param) {
        System.out.println(defaultMesseng+param);

    }

    @Override
    public void achtung(String a) {

    }
}
