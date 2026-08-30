package week4;

public class CourseEnrollment {
    static class Course{
       private String coursecode;
       private String title;
       private int capacity;
        private  int enrolledcount;
        Course(String title,int capacity,String coursecode){
            if(title==null || title.isBlank()|| coursecode==null || coursecode.isBlank()){
                throw new IllegalArgumentException("title and coursecode cant be null");
            }
            if(capacity<=0){
              throw new IllegalArgumentException("capacity cant be negative");  
            }
            this.title=title;
            this.coursecode=coursecode;
            this.capacity=capacity;
            this.enrolledcount=0;
        }

         public boolean enroll(){
            if(enrolledcount>=capacity){
                return false;
            } 
            enrolledcount++;
            return true;
        }

        public boolean withdraw(){
            if(enrolledcount<=0){
                return false;
            }
            enrolledcount--;
            return true;
        }

        public boolean isFull()
        {
        return enrolledcount==capacity;
        }

         public int getAvailableseats()
        {
            return capacity-enrolledcount;
        }
        @Override
        public String toString()
        {
            return "Course code:"+coursecode+",Title:"+title+",Capacity:"+capacity+",Enrollment count:"+enrolledcount;
        }

    public static void main (String args[]){
      Course c1=new Course("Java Programming", 5,"CS101");
      Course c2=new Course("DSA Learning",10,"CS202");
      System.out.println("Enroll:"+c1.enroll());
      System.out.println("Enroll:"+c2.enroll());
      System.out.println("Available seats:"+c1.getAvailableseats());
      System.out.println("Available seats:"+c2.getAvailableseats());
      System.out.println("Full:"+c1.isFull());
      System.out.println("Withdrawl:"+c1.withdraw());
      System.out.println("Withdrawl:"+c2.withdraw());
        }

    }
}
