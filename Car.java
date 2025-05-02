public class Car{
    public void displayDetails(String showroomName ,String modelName ,int price){
      System.out.println("showroom Name: " +showroomName);
      System.out.println("car Model: " +modelName);
      System.out.println("car Price: " +price);
      }
   public static void main(String [] args){
     Car car=new Car();
     car.displayDetails("Etile Motors","Telsa Model S",80000);  
     car.displayDetails("Etile Motors","BMW X5",75000);

    }
}