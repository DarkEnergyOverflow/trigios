import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Trignometric function and degrees: ");
        String option=input.nextLine();

        String[] l1=option.split(",| ");
        String rnum=l1[1];
        String func=l1[0];
        int num=Integer.parseInt(rnum);

        switch(func){
            case "sin":
            sin(num);
            break;

            case "cos":
            cos(num);
            break;

            case "tan":
            tan(num);
            break;

            case "cot":
            cot(num);
            break;

            case "sec":
            sec(num);
            break;

            case "cosec":
            cosec(num);
            break;

            default:
            System.out.println("Invalid input");
        }

        
    }
    public static void tan(int a)
    {
        switch(a){
            case 0:
            System.out.printf("\ntan %d = 0",a);
            break;
            case 30:
            System.out.printf("\ntan %d = 1/\u221A3",a);
            break;
            case 45:
            System.out.printf("\ntan %d = 1",a);
            break;
            case 60:
            System.out.printf("\ntan %d = \u221A3",a);
            break;
            case 90:
            System.out.printf("\ntan %d = infinite",a);
            break;
        }
    }
    public static void cot(int a)
    {
        switch(a){
            case 0:
            System.out.printf("\ncot %d = infinite",a);
            break;
            case 30:
            System.out.printf("\ncot %d = \u221A3",a);
            break;
            case 45:
            System.out.printf("\ncot %d = 1",a);
            break;
            case 60:
            System.out.printf("\ncot %d = 1/\u221A3",a);
            break;
            case 90:
            System.out.printf("\ncot %d = 0",a);
            break;
        }
    }
    public static void sin(int a)
    {
        switch(a){
            case 0:
            System.out.printf("\nsin %d = 1",a);
            break;
            case 30:
            System.out.printf("\nsin %d = 1/2",a);
            break;
            case 45:
            System.out.printf("\nsin %d = 1/\u221A2",a);
            break;
            case 60:
            System.out.printf("\nsin %d = \u221A3/2",a);
            break;
            case 90:
            System.out.printf("\nsin %d = 0",a);
            break;
        }
    }
    public static void cos(int a)
    {
        switch(a){
            case 0:
            System.out.printf("\ncos %d = 1",a);
            break;
            case 30:
            System.out.printf("\ncos %d = \u221A3/2",a);
            break;
            case 45:
            System.out.printf("\ncos %d = 1/\u221A2",a);
            break;
            case 60:
            System.out.printf("\ncos %d = 1/2",a);
            break;
            case 90:
            System.out.printf("\ncos %d = 0",a);
            break;
        }
    }
    public static void sec(int a)
    {
        switch(a){
            case 0:
            System.out.printf("\nsec %d = 1",a);
            break;
            case 30:
            System.out.printf("\nsec %d = 2/\u221A3",a);
            break;
            case 45:
            System.out.printf("\nsec %d = \u221A2",a);
            break;
            case 60:
            System.out.printf("\nsec %d = 2",a);
            break;
            case 90:
            System.out.printf("\nsec %d = infinite",a);
            break;
        }
    }
        public static void cosec(int a)
    {
        switch(a){
            case 0:
            System.out.printf("\ncosec %d = infinite",a);
            break;
            case 30:
            System.out.printf("\ncosec %d = 2",a);
            break;
            case 45:
            System.out.printf("\ncosec %d = \u221A2",a);
            break;
            case 60:
            System.out.printf("\ncosec %d = 2/\u221A3",a);
            break;
            case 90:
            System.out.printf("\ncosec %d = infinite",a);
            break;
        }
    }


}