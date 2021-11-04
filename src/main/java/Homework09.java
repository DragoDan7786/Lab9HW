/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {
    
    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors?
    
    */
    
    private static int NumDivisors(int num) {
    int divNum = 0;
    int sqrt = (int) Math.sqrt(num);
 
    for(int i = 1; i<= sqrt; i++){
        if(num % i == 0){
            divNum = divNum + 2;
        }
    }
    //Catches perfect squares
    if (sqrt * sqrt == num) {
        divNum--;
    }
    return divNum;
}
    
    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        while(NumDivisors(num) < 100){
            num +=i;
            i++;
        }
        
        System.out.println(num);
    }
}
