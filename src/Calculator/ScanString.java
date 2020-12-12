package Calculator;

import java.util.*;

public class ScanString {
    private void  SString(){
        System.out.println("Введите пример: ");// можно убрать
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = s.replace(" ", "");
        char[] strToArray = t.toCharArray();
        int oneCh = strToArray[0];
        if (strToArray[0] == 'I' || strToArray[0] == 'V' || strToArray[0] == 'X') {
            ConversionOfRomanNumbers conversion_of_roman_numbers = new ConversionOfRomanNumbers();
            System.out.println(conversion_of_roman_numbers.start(strToArray));
        } else if (oneCh > 47 && oneCh < 58) {
            ConversionOfNumbers con = new ConversionOfNumbers();
            System.out.println(con.start(t));
        } else {
            InvalidInputException ii = new InvalidInputException();
            ii.IIException();
        }
    }

    protected void start (){
        ScanString start1 = new ScanString();
        start1.SString();
    }
}
