import java.util.*;
public class Fianl{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Boss: You're fired. What's your name?");
    String name = scanner.nextLine(); 
    System.out.println("Your name:"+name);
    int money=0;
    int zen=0;
    for(int i =0;i<200;i++ ){
      if(zen>100){
        break;}
      System.out.printf("You have "+money + "$ and "+ zen +" Zen points.%n " 
                          + "%nWhat would you like to do?%n%n" 
                          + "Meditate 0$, +1 Zen -> Press 1%n" 
                          + "Help Someone -10$, +5 Zen -> Press 2%n" 
                          + "Work at Company +$50, -30 Zen -> Press 3%n"
                          + "Purchase Temple -$50, +15 Zen -> prees 4%n"
                          + "Sweep in front of yard +10$, +10 Zen -> prees 5"); 
      
      Scanner number = new Scanner(System.in); 
      System.out.println(" What Press?"); 
      int choice = number.nextInt(); 
      if (choice<=5 && choice >0){
        if (choice==1){
          
          zen=zen+1; 
        } 
        else if (choice==2){ 
          money=money-10; 
          zen=zen+5; 
        } 
        else if (choice==3){ 
          money=money+50; 
          zen=zen-30; 
        }
        else if (choice==4){
          money=money-50;
          zen=zen+15;
        }
        else if (choice==5){
          money=money+10;
          zen=zen+10;
        }  
      } 
    }
    
    if(zen>100){
      System.out.println("You Win!");}
    else{
      System.out.println("You Lose");}
  }
}
