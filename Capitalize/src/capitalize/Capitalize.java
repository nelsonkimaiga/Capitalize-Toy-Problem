/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalize;
import java.util.Scanner;
/**
 *
 * @author Nelson
 */
public class Capitalize {

    /**
     * @param args the command line arguments
     */
   public static String capital(String str){
    String[] newStr = str.split(" ");
    StringBuffer strbuff = new StringBuffer();

    for(int i = 0; i < newStr.length; i++){
      strbuff.append(Character.toUpperCase(newStr[i].charAt(0)))
      .append(newStr[i].substring(1)).append(" ");
    }

    return strbuff.toString().trim();
  }   
    
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner s = new Scanner(System.in);
    System.out.println("enter string: ");
    System.out.println(capital(s.nextLine()));
    }
    
}

