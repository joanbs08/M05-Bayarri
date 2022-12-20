import java.util.Scanner;
import java.util.Random;

class m03java {
    public static void main(String[] args) {
        int num = 0;
        int intent = 0;
        int intent10 = 10;
        int randomNum = (int) (Math.random() * 101);
        Scanner myObj = new Scanner(System.in);
        // System.out.println(randomNum);

        while (num != randomNum && intent <= intent10) {

            randomNum = (int) (Math.random() * 101);

            System.out.println(randomNum);
            System.out.println("Introdueix un número del 1 al 100");
            num = myObj.nextInt();

            if (num < randomNum && intent <= intent10) {
                System.out.println(
                        "El número random és mes gran que l'introduït, et queden " + (10 - intent) + " intents");
                intent++;
            } else if (num > randomNum) {
                System.out.println("El número random és mes petit que l'introduït");
                intent++;
            } else if (num == randomNum) {
                randomNum = (int) (Math.random() * 101);
                // System.out.println("Has acertat el número");
            } else if (intent <= intent10) {
                System.out.println("S'han acabat els intents");
            }

        }

    }
}
