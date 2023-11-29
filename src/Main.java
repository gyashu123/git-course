import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    System.out.println("Enter username");
    Scanner myObj = new Scanner(System.in);
    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}