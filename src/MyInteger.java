public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0)
            return true;
        return false;
    }

    public boolean isOdd() {
        if (this.value % 2 != 0)
            return false;
        return true;
    }

    public boolean isPrime() {
        if (this.value < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(this.value);
        for (int i = 2; i <= squareRoot; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value) {
        if (this.value == value)
            return true;
        return false;
    }

    public boolean equalsMyInteger(MyInteger myInteger) {
        if (this.value == myInteger.value)
            return true;
        return false;
    }

    public static int[] parseInt(char[] c) {
        int[] number = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            number[i] = (int) c[i] - '0';
        }

        return number;
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}