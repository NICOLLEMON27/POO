/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_1;


public class Exercise_1 {
    
    public static void main(String[] args) {
         
        System.out.println(" Run factorial");
        Exercise_1 ex =new Exercise_1();
       // System.out.println(ex.factorial(5));
        System.out.println(ex.factorial_r(5)); 
    }
    public int factorial_r(int n){
        if(n==1|| n==0){
            return 1;
        }else{
        return factorial_r(n-1)*n;
        }
    } 
    
    
    public int factorial(int n){
        int aux=1;
        for (int a=1;a<=n;a++){
            aux =aux*a;
        }
        return aux;
    }
  
}
