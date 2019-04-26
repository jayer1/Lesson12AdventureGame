package decorator;

import java.util.Scanner;



public class Main {
    
    private Scanner keyboard;

    public static void main(String[] args) {
        
        new Main();
        
        //Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        //System.out.println("Name: " + basicCharacter.getName());
        //System.out.println("Might: " + basicCharacter.getMight());
    }
    
     public Main() {
        keyboard = new Scanner(System.in);
        
         System.out.println("What is your name, heroic one?");
         Character basicCharacter = new BasicCharacter(keyboard.nextLine());
         System.out.println("Welcome " + basicCharacter.getName());
         System.out.println("Your might is " + basicCharacter.getMight());
        
         
        int mainMenuChoice = 0;
        
        System.out.println("\n You enter the treaasure chamber, there are 4 chests:");
        do{
        printTreasureMenu();
        mainMenuChoice = keyboard.nextInt();
        
        
        switch (mainMenuChoice) {
                case 1:
                    System.out.println("You have found a Grenade in the gold chest!");
                    basicCharacter = new Grenade(basicCharacter);
                    break;
                case 2:
                    System.out.println("You have found a Laser in the silver chest!");
                    basicCharacter = new Laser(basicCharacter);
                    break;
                case 3:
                    System.out.println("You have found a Spear in the blue chest!");
                    basicCharacter = new Spear(basicCharacter);
                    break;
                case 4:
                    System.out.println("You have found a Sword in the black chest!");
                    basicCharacter = new Sword(basicCharacter);
                    break;
                    
                    
            }
        
                System.out.println("You have become " + basicCharacter.getName());
                System.out.println("Your might is now " + basicCharacter.getMight());
                
        }while (mainMenuChoice !=5);
        
                System.out.println("Goodbye " + basicCharacter.getName());
                System.out.println("Your might had become " + basicCharacter.getMight());
     }

    private void printTreasureMenu() {
        System.out.println("1. Open the gold chest");
        System.out.println("2. Open the silver chest");
        System.out.println("3. Open the blue chest");
        System.out.println("4. Open the black chest");
        System.out.println("5. DONE");
        System.out.print(">> ");
    }
}
