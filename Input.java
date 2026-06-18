public class Input {
    public static void main(String[] args) {
        System.out.println("What is your name");
        String name = In.nextLine();
        for (int i = 3; i > 0; i--) { // Otherwise can use for (int i = 0; i < 3; i++)
            System.out.println(name);
        }
    }
}