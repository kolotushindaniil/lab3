public class Main {
    public static void main(String[] args) throws Exceptions.NoNamePersonException, Exceptions.PlaceException {
       try {
           Person Skuperfild = new Person();
           Skuperfild.setName("Скуперфильд");
           Person rocks = new Person();
           rocks.setName("Мелкие камешки и комья сухой земли");
           Person hat = new Person();
           hat.setName("Цилиндр");
           Person this1 = new Person();
           this1.setName("Это");
           Person nothing = new Person();
           nothing.setName("Ничего");
           Person mist = new Person();
           mist.setName("Туман");
           Person him = new Person();
           him.setName("ему");
           Person ctoto = new Person();
           ctoto.setName("что-то");
           Person potato = new Person();
           potato.setName(" картофель");
           Person anybody = new Person();
           anybody.setName("никто");
           Person he = new Person();
           he.setName("он");
           Events story = new Events(Skuperfild, rocks, hat, this1, nothing, mist, him, ctoto, potato, anybody,he);
           class Scuperfild{
               final String name;
               boolean iscane;
               boolean iscylinder;
               boolean isclothes;

               public Scuperfild (String name) {
                   this.name = name;
               }

               public void putcane(){
                   System.out.println("трость на месте");
                   this.iscane=true;
               }
               public void putcylinder(){
                   System.out.println("цилиндр надет");
                   this.iscylinder=true;
               }
               public void putclothes(){
                   System.out.println("одежда надета");
                   this.isclothes=true;
               }
           }
           Scuperfild scup = new Scuperfild("Скуперфильд");
           scup.putcane();
           scup.putcylinder();
           scup.putclothes();

           if (scup.iscane && scup.isclothes && scup.iscylinder){
               System.out.println("Отправляемся");
               story.go();
           }
           else {
               System.out.println("Скуперфильд еще не готов");
           }
       }catch (Exceptions.NoNamePersonException exception){
           System.out.println(exception.getMessage());
       }


    }
}