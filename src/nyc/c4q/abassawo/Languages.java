package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/7/15.
 */
import java.util.Scanner;
public class Languages {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String greeting;
        System.out.println("Teach me a greeting in your language");
        greeting = input.nextLine();

        if (greeting.equals("hola")) {

            System.out.println(greeting + " , como estas?");
        } else if (greeting.equals("bonjour")) {
            System.out.println(greeting + " comment allez vous?");
        } else {
            System.out.println("Hey what's up?!");
        }

    }

}
