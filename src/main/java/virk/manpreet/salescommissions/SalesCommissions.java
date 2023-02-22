/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.salescommissions;

/**
 *
 * @author sukhm
 */
public class SalesCommissions {
public static void main(String[] args) {
    int [] Salary ={0,0,2,1,5,8,3,4,3,2,1};
    System.out.println("Salarys per Bracket");
    for(int counter = 2; counter < Salary.length;counter++){
       if (counter ==10){
           System.out.printf("%d+:",1000);
                      

       }
       else {
           System.out.printf("%02d-%02d:", counter * 100, counter * 100+99,counter * 1000);
       }
       for (int stars = 0; stars < Salary[counter]; stars++){
           System.out.print("*");
       }
       System.out.println();
    }
        }
}
