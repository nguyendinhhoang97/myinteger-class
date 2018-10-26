public class Main {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(96);
        MyInteger myInteger1 = new MyInteger(24);
        String[] c = {"c", "o", "d", "e"};
        String s = "3456789";
        int value = 5;
        System.out.println("Số " + myInteger.getValue() + " là số chẵn: " + myInteger.isEven());
        System.out.println("Số " + myInteger.getValue() + " là số lẽ: " + myInteger.isOdd());
        System.out.println("Số " + myInteger.getValue() + " là số nguyên tố: " + myInteger.isPrime());
        System.out.println("Số " + myInteger.getValue() + " bằng số: " + value + " :" + myInteger.equals(value));
        System.out.println("Số " + myInteger.getValue() + " bằng số: "
                + myInteger1.getValue() + " :" + myInteger.equals(myInteger1));
        System.out.println("Đổi chuỗi " + s + " thành số nguyên: " + myInteger.);
    }
}