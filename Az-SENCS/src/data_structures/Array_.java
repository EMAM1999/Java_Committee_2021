/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;
import java.util.Arrays;

/**

 @author EMAM
 */
public class Array_ {

      public static void main(String[] args) {
myArray:    {
                  myArray a = new myArray(5);
                  System.out.println(a);
                  a.insert(5);
                  a.insert(2);
                  System.out.println(a);
                  a.set(0, 3);
                  System.out.println(a);
            }
search:     {
                  int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                  int[] nums2 = { 5, 7, 4, 6, 1, 8, 9, 2, 3, 0 };
                  System.out.println(Arrays.binarySearch(nums, 9));
                  System.out.println(Arrays.binarySearch(nums2, 9));
            }
copy:       {
                  int[] nums = { 5, 7, 4, 6, 1, 8, 9, 2, 3, 0 };
                  int[] nums2 = Arrays.copyOfRange(nums, 2, 4);
                  for ( int ele: nums2 ) {
                        System.out.print(ele + " ");
                  }
                  System.out.println("");
            }
sort:       {
                  int[] nums = { 5, 7, 4, 6, 1, 8, 9, 2, 3, 0 };
                  Arrays.sort(nums, 0, nums.length);
                  for ( int ele: nums ) {
                        System.out.print(ele + " ");
                  }
                  System.out.println("");
            }

sortWithComparing:
            {
                  String[] names = { "ahmed", "Mohamed", "ziad", "Ali", "Nour" };
                  Arrays.sort(names, (a, b) -> {
                        return a.compareToIgnoreCase(b);
                  });
                  for ( String ele: names ) {
                        System.out.print(ele + " ");
                  }
                  System.out.println("");
            }
      }
}

class myArray {

      int size;
      int[] array;
      int pointer = 0;

      public myArray(int _size) {
            this.size = _size;
            array = new int[this.size];
      }

      public int get(int index) {
            return array[index];
      }

      public boolean set(int index, int value) {
            if ( index >= 0 && index < size ) {
                  array[index] = value;
                  return true;
            }
            return false;
      }

      public boolean insert(int value) {
            if ( pointer < size ) {
                  array[pointer++] = value;
                  return true;
            }
            return false;
      }

      public int search(int value) {
            for ( int i = 0; i < size; i++ ) {
                  if ( value == get(i) ) {
                        return i;
                  }
            }
            return -1;
      }

      @Override
      public String toString() {
            String s = "";
            for ( int i = 0; i < pointer; i++ ) {
                  s += array[i] + " ";
            }
            return s;
      }
}
