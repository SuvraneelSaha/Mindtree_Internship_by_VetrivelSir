package Day2;

public class O13 {
    public static void main(String[] args) {
        String name = "Joshvi";
        String email = "Niggachan@gmail.com";
        System.out.println(name.contains("os"));
        // it is present or not in the string or not
        System.out.println(name.contentEquals("OS"));

        System.out.println(name.equalsIgnoreCase("JOS"));
        // entire sequence will be considered
        System.out.println(email.endsWith("@gmail.com"));

        

    }
}
