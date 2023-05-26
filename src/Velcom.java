public class Velcom implements  Observer{

private  static String defaultMesseng= " Велком рассылает СМС";
    @Override
    public void attention(String param) {
        System.out.println(defaultMesseng+param);

    }

    @Override
    public void achtung(String a) {

    }
}
