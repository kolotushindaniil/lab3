import java.util.Objects;
public abstract class AllHeroes implements babyinterface{
    public AllHeroes(){
    }
    public String getName(){
       return "";
    }
    public void setName(String name){
    }
    @Override
    public String toString (){
        return "Hello, " + null;
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroes heroes = (Heroes) o;
        return Objects.equals(null, heroes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash((Object) null);
    }

}