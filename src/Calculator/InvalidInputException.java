package Calculator;

public class InvalidInputException extends Exception{
    public InvalidInputException() {
    }

    public void IIException(){
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("Некорректный ввод");
            System.exit(0);
        }
    }
}
