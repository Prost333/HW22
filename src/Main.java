import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mhs mhs = Mhs.getinstance();
        Observer vel = new Velcom();
        Observer mTS = new MTS();
        Observer bel = new Beltelecom();
        Observer life = new Life();
        mhs.addObserver(vel);
        mhs.addObserver(mTS);
        mhs.addObserver(bel);
        mhs.addObserver(life);
        mhs.event(" Уровень воды резко поднялся ");

        Police police=Police.getinstance();
        police.addObserver(vel);
        police.addObserver(mTS);
        police.addObserver(bel);
        police.addObserver(life);
        police.event(" Солевые атакуют ");

    }
}