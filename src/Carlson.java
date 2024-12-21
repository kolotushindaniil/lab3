public class Carlson extends AllHeroes{
    public void lookedatthebaby(){
        System.out.printf("%sпосмотрел на малыша \n", getName());
    }
    public void helpedwithextraordinaryzeal(){
        System.out.printf("%sпомогал с необычайным усердием \n", getName());
    }
    public void rejoicedovereverycoin(){
        System.out.printf("%sликовал по поводу каждой монеты \n", getName());
    }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
