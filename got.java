import java.util.Scanner;


class got{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int UserInput = in.nextInt();
        while (UserInput != 1){       
            //Check ob die Zahl durch 3 teilbar ist
            if (UserInput%3 == 0){
                System.out.println(UserInput + " 0");
                UserInput = UserInput/3;                
            //wenn nicht dann ob die zahl +1 durch 3 teilbar ist
            }else if((UserInput + 1) % 3==0){
                System.out.println(UserInput + " +1");
                UserInput = (UserInput + 1)/3;               
            //wenn nicht dann ob die zahl -1 durch 3 teilbar ist
            }else if ((UserInput - 1) % 3==0){
                System.out.println(UserInput + " -1");
                UserInput = (UserInput - 1)/3;
                
            }
        }
        in.close();
        
    }
}