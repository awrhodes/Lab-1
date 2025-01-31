//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Alex Rhodes
 */

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    // initialize array
    int[] array = {5, 9, 3, 12, 7, 3, 11, 5};

    // print array in order
    int counter = 0;
    int size = array.length;
    System.out.println("Array in order: ");
    while (counter < size) {
      System.out.print(array[counter] + " ");
      counter++;
    }

    // print array in reverse order
    size = array.length - 1;
    System.out.println("\nArray in reverese order: ");
    for (int i = 0; i <= size; i++) {
      System.out.print(array[size-i] + " ");
    }

    // print first and last values of array
    System.out.println("\nFirst Value: " + array[0] + " Last Value: " + array[size]);

    // calling methods added to Lab1
    int a = 1;
    int b = 2;
    System.out.println("Calling first max method: ");
    System.out.println(lab.max(a, b));

    System.out.println("Calling first min method: ");
    System.out.println(lab.min(a, b));

    System.out.println("Calling sum method: ");
    System.out.println(lab.sum(array));

    System.out.println("Calling average method: ");
    System.out.println(lab.average(array));

    System.out.println("Calling second max method: ");
    System.out.println(lab.max(array));

    System.out.println("Calling second min method: ");
    System.out.println(lab.min(array));

  }
}     

// Add all of the methods here
class Lab1 {

  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    int max;
    if (a > b) {
      max = a;
    } else {
      max = b; 
    } 
    return max;
  }

  public int min(int a, int b) {
    int min;
    if (a < b) {
      min = a;
    } else {
      min = b;
    }
    return min;
  }

  public int sum(int[] nums) {
    int sum = 0;
    for (int value: nums) {
      sum += value;
    }
    return sum;
  }

  public int average(int[] nums) {
    int counter = 0;
    int sum = 0;
    int average = 0;
    for (int value: nums) {
      counter++;
      sum += value;
    }
    average = sum / counter;
    return average;
  }

  public int max(int[] nums) {
    int biggest = nums[0];
    for (int value: nums) {
      if (value > biggest) {
        biggest = value;
      }
    }
    return biggest;
  }

  public int min(int[] nums) {
    int smallest = nums[0];
    for (int value: nums) {
      if (value < smallest) {
        smallest = value;
      }
    }
    return smallest;
  }

}