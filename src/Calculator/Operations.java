package Calculator;

public class Operations {

    protected int start(int c, int a, int b){
        Operations operations = new Operations();
        if (c == 43){
            return operations.Addition(a,b);
        } else if (c == 45){
            return operations.Subtraction(a,b);
        }else if (c == 42){
            return operations.Multiplication(a,b);
        }else if (c == 47){
            return operations.Division(a,b);
        }else return 0;
    }
    private int Addition(int a, int b){
        return a + b;
    }

    private int Subtraction(int a, int b){
        return a - b;
    }

    private int Multiplication(int a, int b){
        return a * b;
    }

    private int Division(int a, int b){
        return a/b;
    }
}
