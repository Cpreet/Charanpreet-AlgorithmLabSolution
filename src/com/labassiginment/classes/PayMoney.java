package com.labassiginment.classes;

import java.util.Scanner;

/**
 * PayMoney
 */
public class PayMoney {

  int[] transactionsArray;
  int[] targetsArray;
  
  int targetAchievedIndicator(int target, int[] transactionsArray) {
    int accum = 0;
    for (int i = 0; i < transactionsArray.length; i++){
      accum += transactionsArray[i];
      if( target <= accum ) {
        return i;
      }
    }
    return -1;
  }

  public int run() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the size of transaction array: ");
    int transactionSize = input.nextInt();
    transactionsArray = new int[transactionSize];
    System.out.println("Enter the values of Array: ");
    for (int i = 0; i < transactionSize; i++) {
      transactionsArray[i] = input.nextInt();
    }
    
    System.out.println("Enter the number of targets to be achieved: ");
    int targetSize = input.nextInt();
    targetsArray = new int[targetSize];
    for (int i = 0; i < targetSize; i++) {
      System.out.println("Enter the value of target");
      targetsArray[i] = input.nextInt();
      int idx = targetAchievedIndicator(targetsArray[i], transactionsArray);
      if (idx > -1) {
        System.out.println("Target achieved after " + (idx+1) + " transactions \n");
      }
      else {
        System.out.println("Given target is not achieved \n");
      }
    }

    input.close();
    return 0;
  }
}