public class Order{
    public String getOrderDetails(String restaurantName, String foodItems, int quantity){
       return "\nRestaurant Name: " +restaurantName + "\nFood Item: " +foodItems + "\nQuantity: " +quantity; 
      
      }
   public static void main(String [] args){
    Order order=new Order();
    System.out.println(order.getOrderDetails("Spice Garden", "Panner Butter Masala", 2));
    System.out.println("---------------------------------------");
    System.out.println(order.getOrderDetails("Spice Garden", "Chicken Biryani", 1));
    System.out.println("--------------------------------------");
    

    }
}