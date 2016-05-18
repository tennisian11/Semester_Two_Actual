import java.util.*;
class Program01 {                                //Question #2
        public static void main(String[] args) {
  String fName = "Ian";            //Question #3
  String lName = "McCarty";        
  String fullName = fName + "  " + lName;
  System.out.println("Hello " + fullName);
  Scanner input = new Scanner(System.in);
  System.out.println("Rate your happiness on a scale of 1-10 (10 being the happiest): "); 
  int hRating;
  hRating = input.nextInt();      //Question #7
  if (hRating>=5) {
          System.out.println(fName + " appears to have the feel goods");
  } else {
   System.out.println(fName + " appears to have the feel goods hurt");        //Question #8

  }
 }
}

