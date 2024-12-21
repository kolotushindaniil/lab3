public class Heroes extends AllHeroes implements Place {
    String name;
    private PlaceEnum place;

    public Heroes() {
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void say(String s) {
        System.out.printf(s+"\n",getName());
    }
    @Override
    public void setPlace(PlaceEnum p) {
        this.place = p;
    }
    @Override
    public PlaceEnum getPlace() {
        return place;
    }
}