import java.util.Scanner;
public class Shopping {
     

    public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 //initialize variables
double total = 0; // grand total of items and their amounts
double itemNum = 0;// corresponding item number
int itemAmount = 0;// quantity of item
double itemPrice =0; //price of selected itemNum



//offer user product menu
System.out.printf("The following items are available to purchase: %n"
        + "Item 1: $101.00%nItem 2: $119.25%nItem 3: $160.75%nItem 4: $203.00"
        + "%nItem 5: $109.12%n " );
System.out.printf("/////////////////%n%n");

//prompt user for item they want to buy
        System.out.println("Enter what item you want to purchase as 1, 2, 3, etc. OR "
        + "enter 00 to quit.");
         itemNum = input.nextDouble();
        while (itemNum != 00){
            if (itemNum == 1){
                itemPrice = 101.00;
            }
            else {
                if (itemNum ==2){
                    itemPrice = 119.25;
                }
                else {
                    if (itemNum ==3){
                        itemPrice = 160.75;
                    }
                    else {
                        if (itemNum ==4) {
                            itemPrice = 203.00;
                        }
                        else {
                            if(itemNum ==4){
                        itemPrice = 109.12;
                    }
                        else {
                                if (itemNum == 5){
                                itemPrice = 109.12;
                                }    
        }
              while (itemNum  <= 5){
        System.out.println("Enter how many of the item you want to purchase OR "
        + "enter 00 to quit.");
        itemAmount = input.nextInt();
        while (itemAmount != 00){
       {
        total = itemNum * itemAmount;
        }
        }
        }
                        }
                    }
                }
            }
        }
        if (itemNum == 00){
            System.out.printf("Your total for your items is: $%.2f%n", total);
    }
}
}