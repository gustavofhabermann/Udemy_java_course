import entites.Client;

public class App {
    public static void main(String[] args) throws Exception {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test"; //with new String("Test")
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(s1 == s2);// False
    }
}
