public class Travel{
    public String getBookingDetails(String agency, String destination, String travellers){
       return "\nAgency: " +agency + "\nDestination: " +destination + "\nTravellers: " +travellers; 
      
      }
   public static void main(String [] args){
   Travel travel=new Travel();
    System.out.println(travel.getBookingDetails("Wanderlust Travels", "Paris", "2"));
    System.out.println("---------------------------------------");
    System.out.println(travel.getBookingDetails("Wanderlust Travels", "Tokyo", "3"));
    System.out.println("--------------------------------------");
    

    }
}