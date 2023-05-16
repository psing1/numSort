import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> List = new ArrayList<>();
    double Item;


      System.out.println("WELCOME TO LIST PROGRAM!\nHow many items do you want to add?: ");
      int temp = sc.nextInt();


      for (int x = 0; x < temp; x++){
        System.out.println("Enter item: ");
        double item = sc.nextDouble();
        List.add(item);
      }

      Sort list = new Sort(List,0.0);

      List = list.sort(List);
      System.out.println(List);

while (true){
      System.out.println("\nEnter item name to check if it is in list: ");
      double temp2 = sc.nextDouble();
    
      if (list.searchItem(List,temp2,0,List.size()-1)== true){
        System.out.println(temp2 + " is in the list.\n");
      }
      else {
        System.out.println(temp2+ " is not in the list.");
      }
    }  
    
  }
}