public class Enrollment{
    public String getEnrollmentInfo(String platform, String course, String student){
       return "\nPlatform: " +platform + "\nCourse: " +course + "\nStudent: " +student; 
      
      }
   public static void main(String [] args){
   Enrollment enrollment=new Enrollment();
    System.out.println(enrollment.getEnrollmentInfo("Udemy", "Java Programming", "Alice"));
    System.out.println("---------------------------------------");
    System.out.println(enrollment.getEnrollmentInfo("Udemy", "Web Development", "Bob"));
    System.out.println("--------------------------------------");
    

    }
}