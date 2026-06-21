public class Password {
    public static void main(String[] args) {
        System.out.println("Password?");
        String password = In.nextLine();
        if (password.equals("Wattlebird")) {
            System.out.println("Off with you");
        } else if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
