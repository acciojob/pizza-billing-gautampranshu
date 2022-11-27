package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isTakeaway;

    private boolean isCheeseadded;

    private boolean isToppingadded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true)
        {
            bill = "Base Price Of The Pizza: 300" + "\n";
            price = 300;
        }
        else
        {
            bill = "Base Price Of The Pizza: 400" + "\n";
            price = 400;
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(isCheeseadded == false)
       {
           //System.out.println("Extra Cheese Added: 80");
           price = price + 80;
       }
       isCheeseadded = true;// your code goes here
    }

    public void addExtraToppings(){
        if(isToppingadded == false)
            {
                if(isVeg == true)
                {
                    //System.out.println("Extra Toppings Added: 70");
                    price = price + 70;
                }
                else
                {
                    //System.out.println("Extra Toppings Added: 120");
                    price = price + 120;// your code goes here
                }
            }
        isToppingadded = true;
    }

    public void addTakeaway(){
        if(isTakeaway == false) {
            //System.out.println("Paperbag Added: 20");
            price = price + 20;
        }
        isTakeaway = true;// your code goes here
    }

    public String getBill(){
        if(isCheeseadded = true) bill = bill + "Extra Cheese Added: 80" + "\n" ;
        if(isToppingadded == true)
        {
            if(isVeg == true) bill = bill + "Extra Toppings Added: 70" + "\n";
            else bill = bill + "Extra Toppings Added: 120" + "\n";
        }
        if(isTakeaway == true) bill = bill + "Paperbag Added: 20" + "\n";
        bill = bill + "Total Price: " + price + "\n";

        return this.bill + "\n";
    }
}
