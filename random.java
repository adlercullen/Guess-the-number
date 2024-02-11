import java.util.Scanner;

class Random{
    public static void main(String args[]){
        Boolean condition=true;
        Scanner scanner=new Scanner(System.in);
        int t;


        while(condition){
            int rand=(int)(Math.random()*100+1);
            t=1;
            while(true){
                System.out.println("Mention Your guessed Number");
                int input=scanner.nextInt();
                
                if(input==rand){
                    System.out.println("Congratulations You have guessed the number");
                    System.out.printf("You have tried %d Times\n\n",t);
                    System.out.println("Would you like to try again y/n");
                    String again=scanner.next();

                    if(again.equals("y") || again.equals("Y")){
                        condition=true;
                        break;
                        
                    }
                    else if(again.equals("n") || again.equals("N")){
                        condition=false;
                        break;
                    }
                    else{
                        System.out.println("please mention either y or n");
                    }
                }
                else if(input>rand){
                    System.out.println("You guessed too high");
                    t++;
                }
                else if(input<rand){
                    System.out.println("You guessed too low");
                    t++;
                }
                else{
                    System.out.println("Mention a valid number between 1-100");
                }

            }
            if(!condition){
                break;
            }

        }
        scanner.close();
    }

}