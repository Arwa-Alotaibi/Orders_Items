
public class TestOrders {
    
    public static void main(String[]args){

        //Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.
        Item item1 = new Item();
        item1.name="mocha";
        item1.price=15.0;

        //
        Item item2 = new Item();
        item2.name="latte";
        item2.price=16.0;
        //
        Item item3 = new Item();
        item3.name="drip coffee";
        item3.price=18.0;
        //
        Item item4 = new Item();
        item4.name="capuccino";
        item4.price=18.0;

    //Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.

    Order order1= new Order();
    order1.name="Cindhuri";
    //Cindhuri’s order is now ready. Update her status
    order1.ready=true;



    Order order2= new Order();
    order2.name="Jimmy";
    //Add item1 to order2's item list and increment the order's total.
    order2.items.add(item1);
    order2.total+=item1.price;
   //Jimmy’s order is now ready. Update his status.
    order2.ready=true;




    Order order3= new Order();
    order3.name="Noah";
    //order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
    order3.items.add(item4);
    order3.total+=item4.price;


    Order order4= new Order();
    order4.name="Sam"; 
    //order4 added a latte. Update accordingly.
    order4.items.add(item2);
    order4.total+=item2.price;
    //sam ordered more drinks - 2 lattes. Update their order as well.
    order4.items.add(item3);
    order4.items.add(item3);
    order4.total+=(item3.price*2);









    //Print the order1 variable to the console to see what happens.
    System.out.println("Order1:   "+order1);
    System.out.printf("Name :%s\n  ",order1.name);
    System.out.printf("total:%s\n  ",order1.total);
    System.out.printf("Ready :%s\n  ",order1.ready);

//Predict what will happen if you print order1.total
System.out.println("the total of order1 is : "+"$"+order1.total);



System.out.println("Order2:   "+order2);
    System.out.printf("Name :%s\n  ",order2.name);
    System.out.printf("total:%s\n  ",order2.total);
    System.out.printf("Ready :%s\n  ",order2.ready);

//Predict what will happen if you print order1.total
System.out.println("the total of order2 is : "+"$"+order2.total);




System.out.println("Order2:   "+order2);
    System.out.printf("Name :%s\n  ",order2.name);
    System.out.printf("total:%s\n  ",order2.total);
    System.out.printf("Ready :%s\n  ",order2.ready);

//Predict what will happen if you print order1.total
System.out.println("the total of order2 is : "+"$"+order2.total);


System.out.println("Order4:   "+order4);
    System.out.printf("Name :%s\n  ",order4.name);
    System.out.printf("total:%s\n  ",order4.total);
    System.out.printf("Ready :%s\n  ",order4.ready);

//Predict what will happen if you print order1.total
System.out.println("the total of order4 is : "+"$"+order4.total);




    }
}

