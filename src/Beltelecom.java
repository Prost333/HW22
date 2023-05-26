public class Beltelecom implements Observer {
    private static String  defaultMesseng ="Белтелеком звонит на городской ";


    @Override
    public void attention(String param) {
        System.out.println(defaultMesseng+param);

    }

    @Override
    public void achtung(String a) {

    }
}
