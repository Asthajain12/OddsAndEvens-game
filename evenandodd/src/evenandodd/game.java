
package evenandodd;
import java.util.*;

public class game {
    String choice,name;
    String even="even";
    String odd="odd";
    int computer,finger,sum;
    public void evenodd(){
        System.out.println("lets play a game called \"odds ans even\"");
        Scanner scan=new Scanner(System.in);
        System.out.print("what is your name?");
         name =scan.nextLine();
        System.out.println("hi "+name+",which do you choose? odd or even");
       choice = scan.next();
    }
    public void choice(){
        if(choice.equalsIgnoreCase(even)){
            System.out.println(name+" has picked even! the computer will be odd!");
        }
         // if(choice.equalsIgnoreCase(even)){
           // System.out.println(name+" has picked even! the computer will be odd");
       // }
       else{
            System.out.println(name+" has picked odd! the computer will be even!");
        }
}
       public void begining(){
           Scanner scan=new Scanner(System.in);
           System.out.print("how many\"fingers\"do you put out?");
           finger=scan.nextInt();
           Random rand = new Random();
            computer=rand.nextInt(6);
           System.out.println("the computer plays number "+computer+" \"fingers\"");
           System.out.println("------------------------------");
       }   
       public void result(){
          sum = computer+finger;
           System.out.println(computer+"+"+finger+"="+sum);
           if(sum%2==0){
               System.out.println(sum+" .... is even!");
                   if(choice.equalsIgnoreCase(even)){
                   System.out.println("that means"+name+" win");
                   }
                   else{
                   System.out.println("computer betrays you try again");
                  }
            }
           else{
               System.out.println(sum+" .... is odd!");
                  if(choice.equalsIgnoreCase(odd)){
                   System.out.println(name+"you ara a winner");
               } 
                  else{
                   System.out.println("computer betrays you");
               }
                   
           }
       }
    
}

