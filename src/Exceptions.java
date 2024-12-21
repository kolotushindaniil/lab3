public class Exceptions {
    public static class Notenoughmoneyexeption extends Exception{
        public Notenoughmoneyexeption(String massage){
            super(massage); // из род класса вызывает из экспетион
        }
    }
}
// исключения обрабатывают ошибки    ;позволяют непрерывать программу