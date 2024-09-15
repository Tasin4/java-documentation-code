// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
public class Assignment7 {
  public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Do you love java?: ");
        ch = input.next().charAt(0);
      if(ch=='y' || ch=='Y'){ //n please input y/Y or n/N for your output
     System.out.println("You are a java lover");
        
    }
    
     else if 
         (ch=='n' ||  ch=='N'){ 
    System.out.println("you are  not a java lover");
    }else{
         System.err.println("for output press y/Y,n/N");
     }
}
}
    
