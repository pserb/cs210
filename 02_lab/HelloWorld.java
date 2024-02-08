// pserb lab02
// cs210 S2024

public class HelloWorld {
    public static void main(String[] args) {
        int N = 1;
        if (args.length != 0) N = Integer.parseInt(args[0]); 
        for (int i = 0; i < N; i++) {
            System.out.println("Hello World!");
        }
        System.out.println("- Paul Serbanescu");
    }
}
