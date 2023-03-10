public class Main {
    public static void main(String[] args) {
        SafeScanner sc = new SafeScanner(System.in);
        int answer = sc.getInt();
        sc.closeScanner();
        System.out.println(answer);
    }
}