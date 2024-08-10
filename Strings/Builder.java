package Strings;

public class Builder {
    public static void main(String[] args) {
        // StringBuffer is used in Multithreading environments where synchronization is
        // required
        // StringBuilder is used in SingleThreaded environments
        // All Methods are in StringBuilder is same as StringBuffer

        StringBuilder sb = new StringBuilder("hello world");
        System.out.println(sb);

        sb.setCharAt(0, 'm'); // Solves immutability problems
        sb.append(" Rakshita");
        sb.append(5000);
        sb.append('U');

        sb.insert(0, 'h');
        sb.deleteCharAt(1);
        System.out.println(sb);
    }
}
