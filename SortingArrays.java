import java.util.*;
import java.io.*;

public class SortingArrays{

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int[] arr = {5, 9 , 6, 1, 3, 8};
      System.out.print("Original array --> ");
      print(arr);
      selectionSort(arr);
      bubbleSort(arr);
      insertionSort(arr);
   }
   
   
   //Sorting algorithms
   //printArray function
   public static void print(int[] a){
      for(int j = 0; j < a.length; j++)
            System.out.print(a[j] + " " );
      System.out.println();    
   }
   
   
   //SELECTION SORT --- SORT LEAST TO MAX
   public static void selectionSort(int[] a){
      for(int i = 0; i < a.length - 1; i++){
         //find the min
         int min = a[i];
         int minIndex = findMinIndex(min, i, a);
         swap(a, i, minIndex);      
         //print array
         print(a);
      }
   }
   
   private static void swap(int[]a, int i, int minIndex){
      int temp = a[i];
      a[i] = a[minIndex];
      a[minIndex] = temp;
   }
   
   private static int findMinIndex(int min, int index, int[] a){
      int newIndex = index;
      for(int i = index; i < a.length; i++){
         if(min > a[i]){
            newIndex = i;
            min = a[i];
         }
      }
      return newIndex;
   }
   
   
   //BUBBLE SORT  -- 2 elements swap at a time
   public static void bubbleSort(int[] a){
      for(int outer = 0; outer < a.length - 1; outer++){
         for(int i = 0; i < a.length -1; i++){
            //check the two elements
            if(a[i+1] < a[i])
               swap(a, i+1, i);
         }
         print(a);
      }
   }
   
   //INSERTION SORT -- sort as you move down the array
   //           swap until reached the element's correct position
   public static void insertionSort(int[] a){
      for(int i = 1; i < a.length; i++){
         int index = i; //starting index
         for(int j = i-1; j >= 0; j--){
            if(a[j] > a[index])
               swap(a, j, index);
            //update index
            index--;
         }
         print(a);
      }
   }
   
   
} 
