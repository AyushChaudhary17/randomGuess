import java.util.Scanner;
public class random {
    public static void main(String[] args){
        int user;
        Scanner sc=new Scanner(System.in);
        double random0=0;
        int random=0;
        while(true){
            random0=Math.random()*10;
            random=(int)random0;
            System.out.println("Enter the value here");
            user=sc.nextInt();
            if(user==random){
                System.out.println("Congratulations you have won\n");
                break;
            }else if(user==-1){
                System.out.println("Thanks for play, here is the answer "+ (random));
                break;
            }
        }
        sc.close();
     
     
    }
}
