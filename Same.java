public class Same {
    public static void main(String[] args) {
        System.out.println("Write a string");
        String string1 = In.nextLine();
        System.out.println("Write another string");
        String string2 = In.nextLine();
        if (string1.equals(string2)) {
            System.out.println("same");
        } else {
            System.out.println("Not the same");
        }
    }
}
