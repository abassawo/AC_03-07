package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/7/15.
 */
import java.util.Scanner;
public class madLibs {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String adj1, adj2, noun1, noun2;

        System.out.print("Give me an adjective ");
        adj1 = input.next();

        System.out.print("Give me another adjective ");
        adj2 = input.next();

        System.out.print("Give me a noun ");
        noun1 = input.next();

        System.out.print("Give me another noun ");
        noun2 = input.next();

        System.out.println("Back in the days on the boulevard of " + adj1 +
                " \n We used to kick routines and presence was " + "\n" +adj2 +
                "\n It was I, The Abstract\n" + "And me the " +  "\n " + noun1 +
                "\n I kicks the mad style so step off the " + noun2);

    }

}
