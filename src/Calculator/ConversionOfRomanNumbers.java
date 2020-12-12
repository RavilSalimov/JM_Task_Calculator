package Calculator;

public class ConversionOfRomanNumbers {
    protected String start(char[] strToArray) {
        Operations operations = new Operations();
        int i1 = 0;
        int i2 = 0;
        int znak = 0;
        int res = 0;
        for (int j = 0; j < strToArray.length; j++) {
            char t = strToArray[j];
            if (t == 'X') {
                i2 = i2 + 10;
            } else if (t == 'V') {
                i2 = i2 + 5;
            } else if (t == 'I') {
                if ((j + 1) < strToArray.length && strToArray[j + 1] == 'X') {
                    i2 = i2 - 1;
                } else if ((j + 1) < strToArray.length && strToArray[j + 1] == 'V') {
                    i2 = i2 - 1;
                } else {
                    i2 = i2 + 1;
                }
            } else if (t=='*' || t=='+' || t=='-' || t=='/') {
                znak = Character.hashCode(t);
                i1 = i2;
                i2 = 0;
            } else {
                InvalidInputException ii = new InvalidInputException();
                ii.IIException();
            }
        }
        if ((i1 < 1 || i1 > 10) || (i2 < 1 || i2 > 10)) {
            InvalidInputException ii = new InvalidInputException();
            ii.IIException();
        } else {
            res = operations.start(znak, i1, i2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            if (res >= 100) {
                stringBuffer.append("C");
                res -= 100;
            } else if (res >= 90) {
                stringBuffer.append("XC");
                res -= 90;
            } else if (res >= 50) {
                stringBuffer.append("L");
                res -= 50;
            } else if (res >= 40) {
                stringBuffer.append("XL");
                res = res - 40;
            } else if (res >= 10) {
                stringBuffer.append("X");
                res = res - 10;
            } else if (res >= 9) {
                stringBuffer.append("IX");
                res = res - 9;
            } else if (res >= 5) {
                stringBuffer.append("V");
                res = res - 5;
            } else if (res >= 4) {
                stringBuffer.append("IV");
                res = res - 4;
            } else if (res >= 1) {
                stringBuffer.append("I");
                res = res - 1;
            } else if (res==0)
                break;
        }
        return String.valueOf(stringBuffer);
    }
}
