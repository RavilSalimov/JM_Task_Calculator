package Calculator;

public class ConversionOfNumbers {
    protected int start(String a) {
        int i = 0;
        String[] s = a.split("[^0-9]");
        int sOne = Integer.parseInt(s[0]);
        int sTwo = 0;
        try {
            sTwo = Integer.parseInt(s[1]);
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
            System.exit(0);
        }
        if ((sOne < 1 || sOne > 10) || (sTwo < 1 || sTwo > 10)) {
            InvalidInputException ii = new InvalidInputException();
            ii.IIException();
        } else {
            String[] c = a.split("[^+/*-]");
            for (String value : c) {
                if (value.hashCode() > 0) {
                    int t = value.hashCode();
                    Operations operations = new Operations();
                    return operations.start(t, sOne, sTwo);
                }
            }
        }
        return i;
    }
}
