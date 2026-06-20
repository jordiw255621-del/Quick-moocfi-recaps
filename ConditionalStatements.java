public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Give me an integer");
        int Integer = In.nextInt();
        if (Integer > 120) {
            System.out.println("Speeding ticket!");
        } else {
            System.out.println("Normal Speed");
        }
        System.out.println("Give me another integer");
        int Integer2 = In.nextInt();
        if (Integer2 == 1984) {
            System.out.println("Orwell");
        } else {
            System.out.println("You wrote " + Integer2);
        }
        System.out.println("Give me a year");
        int Year = In.nextInt();
        if (Year < 2015) {
            System.out.println("Ancient History!");
        } else {
            System.out.println("Thats a modern year");
        }
    }
}
