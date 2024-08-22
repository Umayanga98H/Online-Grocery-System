import java.util.Scanner;
public class customer {

    //define variables
    String cusName;
    String idNumber;
    String address;
    String emailAddress;
    int contactNumber;
    public static float cost1;
    public static float cost2;
    public static float cost3;
    public static float cost4;
    public static float cost5;
    public static float cost6;
    public static float total_cost;
    public static float discounts;

    //print user details that user entered to system
    public void printdetails(){
        System.out.println("Customer Name :"+cusName+"\nId Number     :"+idNumber+"\nPostal Address:"+address+"\nEmail Address :"+emailAddress+"\nContact Number:0"+contactNumber);
    }

    public static void main(String[] args) {

        System.out.println("____________________________________________________________________________________________________");
        System.out.println(" \t \t \t \t \t \t \t \tWelcome to Fresh Cart \t \t ");
        System.out.println("____________________________________________________________________________________________________");

        //get user inputs
        Scanner sc = new Scanner(System.in);
        //create new object in customer class
        customer newCustomer= new customer();

        //check the customer account before enter the store
        System.out.println("Do you already have an account(yes-1,no-2):");
        int yes_no=sc.nextInt();
        sc.nextLine();

        //when customer already have an account
        if(yes_no==1) {
            System.out.println("****Now you can select your goods****");
        }
        //when doesn't have an account
        else if(yes_no==2){
            //get user inputs to create user account
            System.out.println("Please enter Your first name & last name:");
            newCustomer.cusName = sc.nextLine();
            System.out.println("Please input Id Number:");
            newCustomer.idNumber = sc.nextLine();
            System.out.println("Please input Postal Address with postal code:");
            newCustomer.address = sc.nextLine();
            System.out.println("Please input Email address:");
            newCustomer.emailAddress = sc.nextLine();
            System.out.println("Please input Contact Number:");
            newCustomer.contactNumber = sc.nextInt();
            System.out.println("\n****Account is successfully created****");

            //send details to print
            newCustomer.printdetails();
            System.out.println("\n*****Select your goods now*****");
        }
        //when customer enter wrong answer
        else {System.out.println("Please enter the correct answer!!!!!");
            System.exit(0);
        }

        //print product categories
        System.out.println("1.Vegetables \t 2.Fruits \t 3.Seafood and meat \t 4.Dry food \t 5.Stationary items \t 6.Electric items");

        //get category from user
        System.out.println("Enter the product category number:  ");
        int x = sc.nextInt();

        //vegetable category
        if (x == 1) {
            System.out.println("Number\t      Available\t     Unit price");
            System.out.println("0001.Carrot    \t 25kg    \t 1g = Rs.2.00");
            System.out.println("0002.Potato    \t 25kg    \t 1g = Rs.3.00");
            System.out.println("0003.Onion     \t 25kg    \t 1g = Rs.2.00");
            System.out.println("0004.Cabbage   \t 25kg    \t 1g = Rs.8.00");
            System.out.println("0005.Tomato    \t 25kg    \t 1g = Rs.2.00");

            //when selecting vegetables
            System.out.println("Enter the vegetable number : ");
            int veg_num = sc.nextInt();
            System.out.println("Enter the amount you want(g): ");
            int veg_amount = sc.nextInt();
            System.out.println("Enter the unit price:");
            float unit_price = sc.nextFloat();

            //calculate the cost for vegetable category
            cost1 = unit_price * veg_amount;
            System.out.println("Vegetable cost:" + String.format("%.2f",cost1));

            //fruit category
        } else if (x == 2) {
            System.out.println("Number\t      Available\t     Unit price");
            System.out.println("0006.Orange    \t 20kg    \t 1g = Rs.3.00");
            System.out.println("0007.Grapes    \t 25kg    \t 1g = Rs.5.00");
            System.out.println("0008.Apple     \t 25kg    \t 1g = Rs.9.00");
            System.out.println("0009.Pineapple \t 25kg    \t 1g = Rs.7.00");
            System.out.println("0010.Cherries  \t 25kg    \t 1g = Rs.3.00");

            System.out.println("Enter the fruit number : ");
            int fruit_num = sc.nextInt();
            System.out.println("Enter the amount you want(g): ");
            int fruit_amount = sc.nextInt();
            System.out.println("Enter the unit price:");
            float unit_price = sc.nextFloat();

            //calculate the cost for fruit category
            cost2 = unit_price * fruit_amount;
            System.out.println("Fruit cost:" + String.format("%.2f",cost2));

            //Seafood and meat category
        } else if (x == 3) {
            System.out.println("Number\t      Available\t     Unit price");
            System.out.println("0011.Chicken   \t 25kg    \t 1kg = Rs.430.00");
            System.out.println("0012.Pork      \t 25kg    \t 1kg = Rs.880.00");
            System.out.println("0013.Salmon    \t 25kg    \t 1kg = Rs.445.00");
            System.out.println("0014.Prawns    \t 25kg    \t 1kg = Rs.995.00");
            System.out.println("0015.Crabs     \t 25kg    \t 1kg = Rs.440.00");

            System.out.println("Enter the sea food & meat number : ");
            int seafood_and_meat_num = sc.nextInt();
            System.out.println("Enter the amount you want(Kg): ");
            int seafood_and_meat_amount = sc.nextInt();
            System.out.println("Enter the unit price:");
            float unit_price = sc.nextFloat();

            //calculate the cost for seafood and meat category
            cost3 = unit_price * seafood_and_meat_amount;
            System.out.println("sea food cost:" + String.format("%.2f",cost3));

            //dry food category
        } else if (x == 4) {
            System.out.println("Number\t      Available\t     Unit price");
            System.out.println("0016.Brown rice  \t 25kg    \t 1kg = Rs.240.00");
            System.out.println("0017.Barley      \t 25kg    \t 1kg = Rs.220.00");
            System.out.println("0018.Oats        \t 25kg    \t 1kg = Rs.315.00");
            System.out.println("0019.Dahl        \t 25kg    \t 1kg = Rs.180.00");
            System.out.println("0020.Chickpeas   \t 25kg    \t 1kg = Rs.150.00");

            System.out.println("Enter the Dry food number : ");
            int dry_food_num = sc.nextInt();
            System.out.println("Enter the amount you want(Kg): ");
            int dry_food_amount = sc.nextInt();
            System.out.println("Enter the unit price:");
            float unit_price = sc.nextFloat();

            //calculate the cost for dry food category
            cost4 = unit_price * dry_food_amount;
            System.out.println("dry food cost:" + String.format("%.2f",cost4));

            //Stationary items category
        } else if (x == 5) {
            System.out.println("Number\t            Available\t   Unit price");
            System.out.println("0021.Atlas CR        \t100   \t 1 = Rs.120.00");
            System.out.println("0022.Atlas blue pen  \t500   \t 1 = Rs. 20.00");
            System.out.println("0023.Atlas eraser    \t100   \t 1 = Rs. 10.00");
            System.out.println("0024.Atlas glue      \t50    \t 1 = Rs. 50.00");
            System.out.println("0025.Atlas gel pen   \t400   \t 1 = Rs. 10.00");

            System.out.println("Enter the Stationary number : ");
            int stationary_num = sc.nextInt();
            System.out.println("Enter the amount you want: ");
            int stationary_amount = sc.nextInt();
            System.out.println("Enter the unit price:");
            float unit_price = sc.nextFloat();

            //calculate the cost for stationary items category
            cost5 = unit_price * stationary_amount;
            System.out.println("stationary cost:" + String.format("%.2f",cost5));

            //Electronic items category
        } else if (x == 6) {
            System.out.println("Number\t            Available\t    Unit price");
            System.out.println("0026.Rice cooker     \t02   \t 1 = Rs.14500.00");
            System.out.println("0027.Microwave oven  \t05   \t 1 = Rs.29000.00");
            System.out.println("0028.Cooktop         \t02   \t 1 = Rs.10000.00");
            System.out.println("0029.Dishwasher      \t05   \t 1 = Rs.12000.00");
            System.out.println("0030.Water heater    \t10   \t 1 = Rs. 4500.00");

            System.out.println("Enter the electric_item number : ");
            int electric_num = sc.nextInt();
            System.out.println("Enter the amount you want: ");
            int electric_amount = sc.nextInt();
            System.out.println("Enter the unit price:");
            float unit_price = sc.nextFloat();

            //calculate the cost for electronic items category
            cost6 = unit_price * electric_amount;
            System.out.println("electric cost:" + String.format("%.2f",cost6));

        } else {
            //when user enter the wrong answer
            System.out.println("no such category,Please enter a correct category number!!!!");
            System.exit(0);
        }

        System.out.println("Do you want to by goods from another category?(yes-1,no-2)");
        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("1.Vegetables \t 2.Fruits \t 3.Seafood and meat \t 4.Dry food \t 5.Stationary items\t 6.Electric items");

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the product category number:  ");
            int y = sc1.nextInt();

            if (y == 1) {
                System.out.println("Number\t      Available\t     Unit price");
                System.out.println("0001.Carrot    \t 25kg    \t 1g = Rs.2.00");
                System.out.println("0002.Potato    \t 25kg    \t 1g = Rs.3.00");
                System.out.println("0003.Onion     \t 25kg    \t 1g = Rs.2.00");
                System.out.println("0004.Cabbage   \t 25kg    \t 1g = Rs.8.00");
                System.out.println("0005.Tomato    \t 25kg    \t 1g = Rs.2.00");

                System.out.println("Enter the vegetable number : ");
                int veg_num = sc.nextInt();
                System.out.println("Enter the amount you want(g): ");
                int veg_amount = sc.nextInt();
                System.out.println("Enter the unit price:");
                float unit_price = sc.nextFloat();
                cost1 = unit_price * veg_amount;
                System.out.println("Vegetable cost:" + String.format("%.2f", cost1));
            } else if (y == 2) {
                System.out.println("Number\t      Available\t     Unit price");
                System.out.println("0006.Orange    \t 20kg    \t 1g = Rs.3.00");
                System.out.println("0007.Grapes    \t 25kg    \t 1g = Rs.5.00");
                System.out.println("0008.Apple     \t 25kg    \t 1g = Rs.9.00");
                System.out.println("0009.Pineapple \t 25kg    \t 1g = Rs.7.00");
                System.out.println("0010.Cherries  \t 25kg    \t 1g = Rs.3.00");

                System.out.println("Enter the fruit number : ");
                int fruit_num = sc.nextInt();
                System.out.println("Enter the amount you want(g): ");
                int fruit_amount = sc.nextInt();
                System.out.println("Enter the unit price:");
                float unit_price = sc.nextFloat();
                cost2 = unit_price * fruit_amount;
                System.out.println("Fruit cost:" + String.format("%.2f", cost2));

            } else if (y == 3) {
                System.out.println("Number\t      Available\t     Unit price");
                System.out.println("0011.Chicken   \t 25kg    \t 1kg = Rs.430.00");
                System.out.println("0012.Pork      \t 25kg    \t 1kg = Rs.880.00");
                System.out.println("0013.Salmon    \t 25kg    \t 1kg = Rs.445.00");
                System.out.println("0014.Prawns    \t 25kg    \t 1kg = Rs.995.00");
                System.out.println("0015.Crabs     \t 25kg    \t 1kg = Rs.440.00");

                System.out.println("Enter the sea food & meat number : ");
                int seafood_and_meat_num = sc.nextInt();
                System.out.println("Enter the amount you want(Kg): ");
                int seafood_and_meat_amount = sc.nextInt();
                System.out.println("Enter the unit price:");
                float unit_price = sc.nextFloat();
                cost3 = unit_price * seafood_and_meat_amount;
                System.out.println("sea food cost:" + String.format("%.2f", cost3));

            } else if (y == 4) {
                System.out.println("Number\t      Available\t     Unit price");
                System.out.println("0016.Brown rice  \t 25kg    \t 1kg = Rs.240.00");
                System.out.println("0017.Barley      \t 25kg    \t 1kg = Rs.220.00");
                System.out.println("0018.Oats        \t 25kg    \t 1kg = Rs.315.00");
                System.out.println("0019.Dahl        \t 25kg    \t 1kg = Rs.180.00");
                System.out.println("0020.Chickpeas   \t 25kg    \t 1kg = Rs.150.00");

                System.out.println("Enter the Dry food number : ");
                int dry_food_num = sc.nextInt();
                System.out.println("Enter the amount you want(Kg): ");
                int dry_food_amount = sc.nextInt();
                System.out.println("Enter the unit price:");
                float unit_price = sc.nextFloat();
                cost4 = unit_price * dry_food_amount;
                System.out.println("dry food cost:" + String.format("%.2f", cost4));

            } else if (y == 5) {
                System.out.println("Number\t            Available\t   Unit price");
                System.out.println("0021.Atlas CR        \t100   \t 1 = Rs.120.00");
                System.out.println("0022.Atlas blue pen  \t500   \t 1 = Rs. 20.00");
                System.out.println("0023.Atlas eraser    \t100   \t 1 = Rs. 10.00");
                System.out.println("0024.Atlas glue      \t50    \t 1 = Rs. 50.00");
                System.out.println("0025.Atlas gel pen   \t400   \t 1 = Rs. 10.00");

                System.out.println("Enter the Stationary number : ");
                int stationary_num = sc.nextInt();
                System.out.println("Enter the amount you want: ");
                int stationary_amount = sc.nextInt();
                System.out.println("Enter the unit price:");
                float unit_price = sc.nextFloat();
                cost5 = unit_price * stationary_amount;
                System.out.println("stationary cost:" + String.format("%.2f", cost5));

            } else if (y == 6) {
                System.out.println("Number\t            Available\t    Unit price");
                System.out.println("0026.Rice cooker     \t02   \t 1 = Rs.14500.00");
                System.out.println("0027.Microwave oven  \t05   \t 1 = Rs.29000.00");
                System.out.println("0028.Cooktop         \t02   \t 1 = Rs.10000.00");
                System.out.println("0029.Dishwasher      \t05   \t 1 = Rs.12000.00");
                System.out.println("0030.Water heater    \t10   \t 1 = Rs. 4500.00");

                System.out.println("Enter the electric_item number : ");
                int electric_num = sc.nextInt();
                System.out.println("Enter the amount you want: ");
                int electric_amount = sc.nextInt();
                System.out.println("Enter the unit price:");
                float unit_price = sc.nextFloat();
                cost6 = unit_price * electric_amount;
                System.out.println("electric cost:" + String.format("%.2f", cost6));

            } else {
                System.out.println("no such category,Please enter a correct category number!!!!");
                System.exit(0);
            }
            total_cost = cost1 + cost2 + cost3 + cost4 + cost5 + cost6;
            System.out.println("Total cost before discounts=" + String.format("%.2f", total_cost));

            //giving discounts for bills 1000 upwards
            if (total_cost >= 2000) {
                System.out.println("You have 5% discount on your total bill");
                discounts = (float) 0.05 * total_cost;

            } else {
                System.out.println("You don't have any discounts");
                discounts = 0;
            }
            total_cost = total_cost - discounts;
            System.out.println("Total cost after discounts=" + String.format("%.2f", total_cost));

        }else if(answer==2) {

            //calculate total cost for all categories
            total_cost = cost1 + cost2 + cost3 + cost4 + cost5 + cost6;
            System.out.println("Total cost before discounts=" + String.format("%.2f",total_cost));

            //giving discounts for bills 1000 upwards
            if (total_cost >= 2000) {
                System.out.println("You have 5% discount on your total bill");
                discounts = (float) 0.05 * total_cost;

            } else {
                System.out.println("You don't have any discounts");
                discounts = 0;
            }
            total_cost = total_cost - discounts;
            System.out.println("Total cost after discounts=" + String.format("%.2f",total_cost));
        }else{
            System.out.println("Please enter a correct number!!!!");
            System.exit(0);}

        //add delivery cost depend on user location
        System.out.println("Please enter your delivery city:");
        String city = sc.next();
        String s1 = "colombo";
        String s2 = "Colombo";
        if (s1.compareTo(city) == 0 || s2.compareTo(city) == 0) {
            System.out.println("Free delivery in colombo");
            float total_bill=total_cost;
            System.out.println("Final bill=" + String.format("%.2f",total_bill));
        } else {
            System.out.println("Delivery charge of Rs.250.00 will be added to your bill");
            float total_bill = total_cost+(float)250;
            System.out.println("Final bill=" + String.format("%.2f",total_bill));
        }

        //user can select payment method
        System.out.println("Please enter your payment method (**Credit/Debit card-1 , **Cash on delivery-2)");
        int answer1 = sc.nextInt();
        sc.nextLine();
        if (answer1 == 1) {
            System.out.println("Your total bill has deducted from your card");
        } else if (answer1 == 2) {
            System.out.println("You can pay after the delivery");
        } else {
            System.out.println("Please enter a correct number!!!!");
            System.exit(0);
        }
        System.out.println("Are your delivery address and the contact number same as you mentioned in the account? (yes-1, no-2)");
        int answer2 = sc.nextInt();
        sc.nextLine();

        if (answer2 == 1) {
            System.out.println("You can continue");
        } else if (answer2==2) {
            System.out.println("Please enter the new delivery address");
            String address = sc.nextLine();
            System.out.println("Please enter the new contact number");
            int contactNUm = sc.nextInt();}
        else{
            System.out.println("Please enter a correct number!!!!");
            System.exit(0);
        }

        System.out.println("Please enter the Delivery date(dd/mm/y)");
        String date = sc.next();

        System.out.println("Your parcel will be on your doorstep on the due date...Thank you for shopping with us and stay safe!!");
    }
}