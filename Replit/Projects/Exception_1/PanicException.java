package Projects.Exception_1;

public class PanicException extends RuntimeException{
    private static final String message ="Don't Panic :D";

    public PanicException(){
        super();
        System.out.println(message);
    }
}