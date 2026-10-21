import java.util.Scanner;
public class numbers{
    Scanner cb = new Scanner(System.in);
    public numbers(){}
    public int check(String n){
        String temp = n;
        int thing = 1;
        Boolean pass = false;
        while(pass == false){
            try{
                thing = Integer.parseInt(temp);
                pass = true;
            }
            catch(NumberFormatException e){
                System.out.println("Enter a valid number");
                temp = cb.nextLine();
            }
        }
        return thing;
    }
}
