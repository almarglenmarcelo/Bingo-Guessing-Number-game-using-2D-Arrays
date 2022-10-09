import java.util.ArrayList;
import java.util.Scanner;

public class Main {


//    static ArrayList<String> numberpool = new ArrayList<>();
//
//
//
    public static void main(String[] args) {

        String[][] card = new String[5][5];

        System.out.println("****WELCOME TO BINGO****");
        for(int row = 0; row < card.length ; row++) {

            for(int col = 0; col < card.length; col++) {

                card[row][col] = randomizeNumber();

//                numberpool.add(card[row][col]);

                if(row == 2 && col == 2)
                    card[row][col] = "FR";


                System.out.print(String.format("[%s] ", card[row][col]));

                if(col == 4)
                    System.out.println("");
            }

        }

        System.out.println("Creating Pattern ...");
        createPattern(card);


       /* System.out.println("Pool of randomized number: ");
        System.out.println(numberpool);

        Scanner scanner = new Scanner(System.in);

        int luckyNumber = pickNumber();
        System.out.println(luckyNumber);

        System.out.println("Choose lucky number!");
        int number = scanner.nextInt();


        if(number != luckyNumber)
            System.out.println("Try again later!");
        else
            System.out.println("You guessed the LUCKY NUMBER!");*/


           /* System.out.println("Enter row that you want to select");
        int row = scanner.nextInt() - 1;

        System.out.println("Enter the column that you want to select");
        int col = scanner.nextInt() - 1;

        System.out.println("This is the element that you selected!: ");
        System.out.println(card[row][col]);

        System.out.println("New Value: ");
        scanner.nextLine();
        String newVal = scanner.nextLine();

        if(newVal.length() == 1)
            newVal = "0" + newVal;

        card[row][col] = newVal;

        print2dArrays(card);*/

    }
    public static String randomizeNumber() {

        int random = (int) ((Math.random() * 75) + 1);
        String number = Integer.toString(random);

        if(number.length() == 1)
            number = "0" + number;

        return number;

    }
    public static void print2dArrays(String[][] array){

        for(int row = 0; row < array.length; row++){

            for(int col = 0 ; col < array.length; col++) {

                System.out.print(String.format("[%s] ", array[row][col]));

                if(col == 4)
                    System.out.println("");

            }
        }

    }

 /*   public static int pickNumber() {

        int luckyNum = (int) (Math.random() * numberpool.size());

        int theNum =  Integer.parseInt(numberpool.get(luckyNum));

        return theNum;
    }*/


    public static void createPattern(String[][] array) {

        for(int row = 0; row < array.length ; row++) {
            int randomizedCol = (int) (Math.random() * 5);

            for(int col = 0; col < array.length; col++) {

                array[row][randomizedCol] = "XX";

                if(row == 2 && col ==2)
                    array[row][col] = "FR";

                System.out.print(String.format("[%s] ", array[row][col]));

                if(col == 4)
                    System.out.println("");
            }

        }

    }

}
