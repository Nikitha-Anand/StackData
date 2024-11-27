import java.util.Scanner;

public class StackData {
    public static Integer[] StackData = new Integer[10];
    public static Integer StackPointer = 0; //Points to next available space in the stack

    public static void PrintStack(){
        for (int i = 0; i < StackPointer; i++) {
            System.out.println(StackData[i]);
        }
        System.out.println("\nStack Pointer: " + StackPointer);
    }

    public static Boolean Push(Integer Numb){
        if(StackPointer <= 9){
            StackData[StackPointer] = Numb;
            StackPointer = StackPointer + 1;
            return true;
        }else{
            return false;
        }
    }

    public static Integer Pop(){
        if(StackPointer == 0){
            return -1;
        }else{
            StackPointer = StackPointer - 1;
            return StackData[StackPointer];
        }
    }

    public static void main(String[] args){
        //Scanner class is imported from java.util
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter a number to add to the Stack: ");
            Integer Numb = keyboard.nextInt();

            Boolean add = Push(Numb);
            if(add){
                System.out.println("The Number "+ Numb + " added to the Stack successfully\n");
            }else{
                System.out.println("Stack is Full; Number not added\n");
            }
        }
    }
}
