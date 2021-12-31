package com.labassiginment.classes;

import java.util.Scanner;

import com.labassiginment.services.MergeSort;

public class CurrencyDenominations {
  public void run() {
    Scanner input = new Scanner(System.in);

    System.out.println("Input the number of denominations: ");
    int NumDens = input.nextInt();
    int[] denArray = new int[NumDens];
    System.out.println("Enter the currency denominations: ");
    for(int i = 0; i < NumDens; i++) {
      denArray[i] = input.nextInt();
    }
    
    System.out.println("Enter the amount you have to pay: ");
    int amount = input.nextInt();
    
    int[] tokenArray = calculateMinTokens(amount, denArray);
    System.out.println("Your tokens will be: ");
    for(int i = 0; i < tokenArray.length; i++) {
      System.out.println(denArray[denArray.length - 1 - i] + ":" + tokenArray[i]); 
    }
    input.close();
  }

  int[] calculateMinTokens(int amount, int[] denArray) {
    MergeSort mrgSrt = new MergeSort();
    denArray = mrgSrt.intSort(denArray, 0, denArray.length - 1);

    int[] tokenArr = new int[denArray.length];
    
    for (int i = 0; i < denArray.length; i++) {
      tokenArr[i] = (int) amount / denArray[denArray.length - 1 - i];
      amount = amount % denArray[denArray.length - 1 - i];  
    }
    if (amount > 0) {
     // TODO: Make the program in coinChange algorithm 
    }
    return tokenArr; 
  }
}
