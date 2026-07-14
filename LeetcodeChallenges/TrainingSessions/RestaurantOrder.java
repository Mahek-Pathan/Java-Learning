//Restaurant ordering system
//interface menuItems
//method: getPrice()
//classes:Pizza,pasta,burger
//create class order: stores items in an arraylist, calculates total bill

import java.util.ArrayList;

interface menuItems{
    public int getPrice();
}
class Pizza implements menuItems{
    @Override
    public int getPrice()
    {
     return 299;
    }
}
class Burger implements menuItems{
    @Override
    public int getPrice()
    {
     return 99;
    }
}
class Pasta implements menuItems{
    @Override
    public int getPrice()
    {
     return 399;
    }
}
class Order{
    ArrayList<menuItems> items = new ArrayList<>();
    public void addItem(menuItems item){
        items.add(item);
    }
    public void CalculateBill(){
        if(items.isEmpty()){
            System.out.println("Empty list");
        }
        else{
            int total=0;
            for(menuItems item:items){
                
                total+=item.getPrice();
            }
            System.out.println("Total Bill: "+total);
            
        }
    }
}

public class RestaurantOrder {
    public static void main(String[] args) {
       Order o = new Order();
       o.addItem(new Pizza());
       o.addItem(new Pasta());
       o.addItem(new Burger());
       o.CalculateBill();


    }
    
}
