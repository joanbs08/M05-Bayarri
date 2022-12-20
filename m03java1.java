import java.util.Scanner;
import java.util.Random;

class m03java1 {
    public static void main(String[] args) {
        int num = 0;
        int intent = 0;
        int intent10 = 10;
        int intent5 = 5;
        int randomNum = (int) (Math.random() * 101);
        Scanner myObj = new Scanner(System.in);
        // System.out.println(randomNum);

        for (intent = 1; intent5 > intent; intent++) {

            randomNum = (int) (Math.random() * 101);

            System.out.println(randomNum);
            System.out.println("Introdueix un número del 1 al 100");
            num = myObj.nextInt();

            if (num < randomNum) {
                System.out.println(
                        "El número random és mes gran que l'introduït, et queden " + (10 - intent) + " intents");

            } else if (num > randomNum) {
                System.out.println(
                        "El número random és mes petit que l'introduït, et queden " + (10 - intent) + " intents");

            } else if (num == randomNum) {
                System.out.println(
                        "El número random és mes petit que l'introduït, et queden " + (10 - intent) + " intents");

                // System.out.println("Has acertat el número");
            } else if (intent == intent10) {
                System.out.println("S'han acabat els intents");

            }
        }
        while (intent5 < intent10 && num != randomNum) {

            System.out.println(randomNum);
            System.out.println("Introdueix un número del 1 al 100");
            num = myObj.nextInt();

            if (num < randomNum) {
                System.out.println(
                        "Ya casi el numero introducido es mas pequeño le quedan " + (10 - intent) + " intentos");
                intent++;
            } else if (num > randomNum) {
                System.out.println(
                        "Ya casi el numero introducido es mas grande le quedan " + (10 - intent) + " intentos");
                intent++;
            } else if (num == randomNum) {
                System.out.println("Acertou muito bem");

                // System.out.println("Has acertat el número");
            } else if (intent == intent10) {
                System.out.println("S'han acabat els intents");

            }

        }
    }
}
