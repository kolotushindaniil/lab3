import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Events {
    private final Person carlson;
    private final Person baby;
    private final Person mother;
    private final Person father;
    private final Person betan;
    private final Person bosse;
    private final Person monneybox;

    public Events(Person carlson, Person baby, Person mother, Person father, Person betan, Person bosse, Person monneybox) {
        this.carlson = carlson;
        this.baby = baby;
        this.mother = mother;
        this.father = father;
        this.betan = betan;
        this.bosse = bosse;
        this.monneybox = monneybox;
    }

    public void go() throws Exceptions.PlaceException {
        baby.setPlace(PlaceEnum.ROOM);
        boolean room = true;
        carlson.looked();
        baby.stood();
        baby.desirearose();
        monneybox.setPlace(PlaceEnum.BOOKSHELF);
        boolean bookshelf = true;
        monneybox.stoodon();
        baby.ranoff();
        List<Money> list = new ArrayList<>();
        Money m1 = new Money(5, true);
        Money m2 = new Money(10, false);
        Money m3 = new Money(25, false);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        List<Candyes> paper = new ArrayList<>();
        Candyes c1 = new Candyes();
        c1.setName("lollipops");
        Candyes c2 = new Candyes();
        c2.setName("candied nuts");
        Candyes c3 = new Candyes();
        c3.setName("chocolate");
        paper.add(c1);
        paper.add(c2);
        paper.add(c3);
        for (int i = 0; i < 3; i++) {
            baby.startedtoget();
            if (list.get(i).makehappy() == true) {
                carlson.rejoiced();
            } else {
                carlson.madehappy();

            }
        }
        for (int i = 0; i < 3; i++) {
            baby.bought();
            paper.get(i).boughtwithallthemoney();
        }


    }
}

