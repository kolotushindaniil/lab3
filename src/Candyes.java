public class Candyes extends AllHeroes{
     public void boughtwithallthemoney(){
         System.out.printf("%s купил на все деньги\n", getName());
     }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}