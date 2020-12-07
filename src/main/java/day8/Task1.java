package day8;

public class Task1 {
    public static void main(String[] args) {
        concatString();
        concatStringBuilder();
    }

    public static void concatString() {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i < 20000; i++) {
            str += i + " ";
        }
        str += 20000;
        System.out.println(str);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " мс - время выполнения concatString()");
    }

    public static void concatStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 20000; i++) {
            sb.append(i + " ");
        }
        sb.append(20000);
        System.out.println(sb.toString());
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " мс - время выполнения concatStringBuilder()");
    }
}
