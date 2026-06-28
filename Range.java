public class Range {
    public static void main(String[] args) {
        System.out.println("Is the number within the range 5-10?");
        int number = In.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("It is!");
        } else {
            System.out.println("It is not");
        }
    }
}
