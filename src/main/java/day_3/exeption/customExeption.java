package day_3.exeption;

public class customExeption extends  Exception{
    public customExeption(String message) {
        super("my custom exception:" + message);
    }
}
