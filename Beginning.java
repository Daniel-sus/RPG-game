import java.util.Scanner;

public class Beginning {
    public static void createBeginning() {
        Scanner scan = new Scanner(System.in);
        boolean isCharacterDone = false;
        boolean isItemChoosen = false;
        int mana = 0;
        int stamina = 0;
        int hp = 0;
        while (!isCharacterDone) {
            int amountOfPoints = 15;
            System.out.println("You have 15 points to give between all attributes Stamina, Mana, HP");
            System.out.println("Choose how many points you want to give to Stamina");
            stamina = scan.nextInt();
            if (stamina <= 13 && stamina > 0) {
                amountOfPoints -= stamina;
                System.out
                        .println("Okay, your Stamina is " + stamina
                                + ", now choose how many points you want to give to Mana");
                System.out.println("Points left: " + amountOfPoints);
                mana = scan.nextInt();
                if (mana <= amountOfPoints - 1 && mana > 0) {
                    amountOfPoints -= mana;
                    System.out
                            .println("Okay, your Mana is " + mana
                                    + ", the rest of the points will be given to HP");
                    System.out.println("Points left: " + amountOfPoints);
                    hp = amountOfPoints;
                    amountOfPoints -= hp;
                    System.out.println("Your HP is: " + hp);
                    System.out.println("Points left: " + amountOfPoints);
                    isCharacterDone = true;
                } else {
                    System.out.println("ERROR Choose another number");
                }
            } else {
                System.out.println("ERROR Choose another number");
            }
        }
        // if (isCharacterDone) {
        System.out.println("Your character stats are:");
        System.out.println("Stamina " + stamina);
        System.out.println("Mana " + mana);
        System.out.println("HP " + hp);
        Character cr = new Character(stamina, mana, hp, "main");
        // }
        // Character[] arr = new Character[6];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = new Character(i, i + 1, i + 2);
        // }
        // for (int i = 0; i < arr.length; i++) {
        // arr[i].getStats();
        // }
        System.out.println();
        System.out.println("Choose your item");
        Item[] itemsArray = Main.createItems();
        for (int i = 0; i < itemsArray.length; i++) {
            System.out.println();
            System.out.println("Item " + (i + 1));
            System.out.println();
            itemsArray[i].getInfo();
        }
        while (!isItemChoosen) {
            System.out.println();
            System.out.println("Enter which one you want 1 2 3 ?");
            int choosenItem = scan.nextInt();
            if (choosenItem >= 1 && choosenItem <= 3) {
                System.out.println("You have chosen item " + choosenItem);
                System.out.println("Item " + choosenItem + " was added to your character");
                System.out.println();
                cr.addItem(itemsArray[choosenItem - 1]);
                cr.addItem(itemsArray[0]);
                cr.getStats();
                isItemChoosen = true;
            } else {
                System.out.println("The number you entered is not 1 or 2 or 3, enter your number again");
            }
        }
        Character[] levelsArray = Main.createLevels();
        System.out.println();
        System.out.println("LEVELS HAVE BEEN CREATED");
        System.out.println();
        for (int i = 0; i < levelsArray.length; i++) {
            levelsArray[i].getStats();
        }
        scan.close();
    }

}
