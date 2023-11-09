// PocketMain.java
// Eldin Pita
// CSCI 1302
// Project 2
// 03/05/2020


import java.util.Scanner;

public class PocketMain {

    public static void main(String args[]) throws NoSuchCoin
    {
        Pocket pocket = new Pocket();
        boolean exit =false;

        while(!exit)
        {
           /*
           *    1.Add a coin (must specify type)
                2.Remove a coin (must specify type)
                3.Display a coin count
                4.Display a total value in the pocket
                5.An ability to exit the program
           */
            System.out.println("Choose one operation:\n"
                    + "1.Add a coin (must specify type)\n"
                    + "2.Remove a coin (must specify type)\n"
                    + "3.Display a coin count\n"
                    + "4.Display a total value in the pocket\n"
                    + "5.exit the program");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter type of coin\n"
                            + "1.Dime\n"
                            + "2.Nickle\n"
                            + "3.Penny\n"
                            + "4.Quarter");
                    int selection =sc.nextInt();
                    switch(selection){
                        case 1:pocket.addCoin( new Dime());
                            System.out.println("dime added to pocket successfully");
                            break;
                        case 2:pocket.addCoin(new Nickle());
                            System.out.println("Nickle added to pocket successfully");
                            break;
                        case 3:pocket.addCoin(new Penny());
                            System.out.println("Penny added to pocket successfully");
                            break;
                        case 4:pocket.addCoin(new Quarter());
                            System.out.println("Quarter added to pocket successfully");
                            break;
                        default:throw new NoSuchCoin();
                    }

                    break;
                case 2:
                    System.out.println("Enter type of coin\n"
                            + "1.Dime\n"
                            + "2.Nickle\n"
                            + "3.Penny\n"
                            + "4.Quarter");
                    selection =sc.nextInt();
                    switch(selection){
                        case 1:pocket.removeCoin(Coin.DIME);
                            System.out.println("Dime removed from pocket successfully");
                            break;
                        case 2:pocket.removeCoin(Coin.NICKLE);
                            System.out.println("Nickle removed from pocket successfully");
                            break;
                        case 3:pocket.removeCoin(Coin.PENNY);
                            System.out.println("Penny removed from pocket successfully");
                            break;
                        case 4:pocket.removeCoin(Coin.QUARTER);
                            System.out.println("Quarter removed from pocket successfully");
                            break;
                        default:throw new NoSuchCoin();
                    }
                    break;
                case 3:
                    System.out.println("Enter type of coin\n"
                            + "1.Dime\n"
                            + "2.Nickle\n"
                            + "3.Penny\n"
                            + "4.Quarter");
                    selection =sc.nextInt();
                    switch(selection){
                        case 1:System.out.println("Dimes:"+pocket.countCoins(Coin.DIME));
                            break;
                        case 2:System.out.println("Nickles:"+pocket.countCoins(Coin.NICKLE));
                            break;
                        case 3:System.out.println("Pennys:"+pocket.countCoins(Coin.PENNY));
                            break;
                        case 4:System.out.println("Quarters:"+pocket.countCoins(Coin.QUARTER));
                            break;
                        default:throw new NoSuchCoin();
                    }
                    break;
                case 4:
                    System.out.println("Total value of the Pocket:"+pocket.totalValue());
                    break;
                case 5:
                    exit=true;
                    break;
                default : System.out.println("Invalid input exiting program");
                    exit=true;

            }

        }
    }

}