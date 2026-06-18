public class StoryWithInput {
    public static void main(String[] args) {
        System.out.println(
                "I will tell you a story, but I need some information first." + "\nWhat is the main character called?");
        String Name = In.nextLine();
        System.out.println("What is their job?");
        String Job = In.nextLine();
        System.out.println("Here is the story:" + "\nOnce upon a time there was " + Name + ", who was a " + Job + "."
                + "\nOn the way to work, " + Name + " reflected on life."
                + "\nPerhaps Ada will not be a Data scientist forever.");
    }
}