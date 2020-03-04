
import java.util.Arrays;
import java.util.Random;
import java.util.*;


public class Assi2 {
    
      static int recSearch(int arr[], int l, int r, int x) 
     { 
          if (r < l) 
             return -1; 
          if (arr[l] == x) 
             return l; 
          if (arr[r] == x) 
             return r; 
          return recSearch(arr, l+1, r-1, x); 
     }
      
     void RandomGen(int arr[]){
    
    for(int i=0;i<10;i++){
      int randomInteger = (int)(100.0*Math.random());
      arr[i]=randomInteger;
      
      
    }
     }
    public static void main(String[] args){
        
        long startt = System.nanoTime();
        int[] randarr = new int[10];
        Assi2 rand = new Assi2();
        rand.RandomGen(randarr);
        System.out.println("Random Array:");
        System.out.println(Arrays.toString(randarr));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int a = sc.nextInt();
        
        
        
        int search=recSearch(randarr,0,randarr.length-1,a);
        
        if(search>0){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }
       long endt = System.nanoTime();
       
       System.out.println("Time Taken:");
       System.out.println(endt-startt);
        
       
    }
}
