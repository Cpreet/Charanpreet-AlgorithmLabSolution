package com.labassiginment.services;

public class MergeSort {
  public int[] intSort(int[] arr, int l, int r) 
  {
    if (l < r) {
      int m = l + (r-l)/2;
      
      intSort(arr, l, m);
      intSort(arr, m + 1, r);

      int l_len = m - l + 1;
      int r_len = r - m;
      int[] L = new int[l_len];
      int[] R = new int[r_len];
      
      for(int i = 0; i < l_len; i++)
        L[i] = arr[l + i];
      for(int i = 0; i < r_len; i++)
        R[i] = arr[m + 1 + i];

      int i = 0, j = 0;
      int k = l;

      while (i < l_len && j < r_len) {
        if (L[i] < R[j]) {
          arr[k] = L[i];
          i++;
        } else {
          arr[k] = R[j];
          j++;
        }
        k++;
      }

      while (i < l_len) {
        arr[k] = L[i];
        i++;
        k++;
      } 

      while (j < r_len) {
        arr[k] = R[j];
        j++;
        k++;
      }
    }

    return arr;
  }
}
