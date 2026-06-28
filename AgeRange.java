public class AgeRange {
    public static void main(String[] args) {
        System.out.println("How old are you");
        int age = In.nextInt();
        if (age > 120) {
            System.out.println("Age cannot be over 120");
        } else if (age == 0) {
            System.out.println("Age cannot be 0");
        } else if (age < 0) {
            System.out.println("age cannot be negative");
        } else {
            System.out.println("Ok");
        }
    }
}
