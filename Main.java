/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter Your Sentence: ");
    String str = myObj.nextLine();  
    System.out.println("Enter Letter: ");
      String separator = myObj.nextLine();
      int sepPos = str.indexOf(separator);
      if (sepPos == -1) {
         System.out.println("");
      }
      System.out.println("Result: "+str.substring(sepPos + separator.length()));

  }
}
