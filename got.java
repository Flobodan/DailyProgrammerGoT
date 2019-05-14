import java.util.Scanner;


class got{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int UserInput = in.nextInt();
        int OldUserInput;
        while (UserInput != 1){       
            //Check ob die Zahl durch 3 teilbar ist
            if (UserInput%3 == 0){
                OldUserInput = UserInput;
                UserInput = UserInput/3;
                System.out.println(OldUserInput + " 0");
            //wenn nicht dann ob die zahl +1 durch 3 teilbar ist
            }else if((UserInput + 1) % 3==0){
                OldUserInput = UserInput;
                UserInput = (UserInput + 1)/3;
                System.out.println(OldUserInput + " +1");
            //wenn nicht dann ob die zahl -1 durch 3 teilbar ist
            }else if ((UserInput - 1) % 3==0){
                OldUserInput = UserInput;
                UserInput = (UserInput - 1)/3;
                System.out.println(OldUserInput + " -1");
            }
        }
        
    }
}