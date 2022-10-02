package Quicksort;

import java.util.ArrayList;
import java.util.Arrays;

public class Quicksort {

    static ArrayList<Double> finalSortedArr = new ArrayList<>();

    public static ArrayList<Double> quickSort(double[] arr){

        int pivot = arr.length/2; //The point at which the sorting begins. It checks numbers less or greather than the value at this index.
        double[] newArr = arr;
        double storageVal = 0;
        boolean keepGoing = false;

        for(int i = 0; i < newArr.length; i++){
            //If a given number below the pivot number is bigger than the pivot number, then that number is chucked at the end of the array and all the numbers after where it was is shifted down one pivot.
            if(newArr[pivot] < newArr[i] && pivot > i){
                storageVal = newArr[i];
                for(int j = i; j < newArr.length-1; j++){
                    newArr[j] = newArr[j+1];
                }
                newArr[newArr.length-1] = storageVal;
                pivot--;
                i--;
                keepGoing = true;
            }

            //If a given number above the pivot number is smaller than the pivot number, then that number is chucked to the start of the array and all the numbers that were before it in the array are shifted up one pivot.
            else if(newArr[pivot] > newArr[i] && pivot < i){

                storageVal = newArr[i];

                for(int j = i; j >= 1; j--){
                    newArr[j] = newArr[j-1];
                }
                newArr[0] = storageVal;
                pivot++;
                keepGoing = true;
            }

            //Problems can occur when there are just three elements or more elements and the first two conditiomns are not met. This basically means all non-sorted sequences will be broken down into either 1 or 2 long arrays.
            else if(newArr.length >= 3){
                keepGoing = true;
            }

        }

        //This makes sure that the array is broken down into either 1 or two long subArrays which can then be compiled into the final sorted list.
        if(keepGoing == true){
            double[] subArr = Arrays.copyOfRange(arr, 0, pivot+1);
            quickSort(subArr);
            subArr = Arrays.copyOfRange(newArr, pivot + 1, newArr.length);
            quickSort(subArr);
        }
        //If the array didn't meet any of the criteria above, then it is ready to be added to the final sorted arrayList.
        else{
            for(int i = 0; i < newArr.length; i++){
                finalSortedArr.add(newArr[i]);
            }
        }

        return finalSortedArr;

    }

}

