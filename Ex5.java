//5)Reverse the left and right numbers like input 9, output 4 3 2 1 5 9 8 7 6
										//input 13 , output 6 5 4 3 2 1 7 13 12 11 10 9 8

import java.util.*;
class Ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

int middle = n/2;
      for (int i = 1; i <= n; i++ )
       {
        if(i <= middle)
        {
          System.out.print((middle-i+1)+" ");  
        }
        else
        {
           if(i == middle + 1)  
           {
              System.out.print(i+" ");  
           }
           else
           {
              System.out.print((n - i+ middle + 2) +" "); 
           }
        }
       }

    }
}

/* ============== OUTPUT ==============
Enter a Number: 
9
4 3 2 1 5 9 8 7 6 

*/