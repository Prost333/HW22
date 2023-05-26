public class Life implements  Observer{

    private static String  defaultMesseng ="Вас оповещает Life звонками ";


    @Override
    public void attention(String param) {
        System.out.println(defaultMesseng+param);

    }

    @Override
    public void achtung(String a) {

    }
}
