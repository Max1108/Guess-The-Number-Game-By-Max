import java.util.Scanner;
import java.util.Random;
class game{
    int num;
    int inputNumber;
    int noOfGuess;
    game(){
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }
    public int takeUserInput(){
        noOfGuess++;
        Scanner input = new Scanner(System.in);
            this.inputNumber = input.nextInt();
        
        return inputNumber;
    }
    public void isCorrect(){
        if(inputNumber==num){
            System.out.println("You Win...");
            System.out.println("You Attempts "+noOfGuess+" Chances");
        }
        else if(inputNumber<num){
            System.out.println("Too low...");
        }
        else if(inputNumber>num){
            System.out.println("Too High...");
        }
    }
}

public class Project2 {
    public static void main(String[] args) {
            System.out.println("Guess The Number Between 0-100:");
            game gm = new game();
            boolean b = false;
            while(!b){
            gm.takeUserInput();
            gm.isCorrect();
            if(gm.inputNumber==gm.num){
                break;
            }
        }
    }
}
