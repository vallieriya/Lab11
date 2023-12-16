package Lab11;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    int[] intArray;
    int n;
    public Arr(int n){
        this.n = n;
        intArray = new int[n];
    }
    public void setArr(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < n;i++){
            intArray[i]= sc.nextInt();
        }
    }
    public void getArr(){
        System.out.println("arr:");
        for(int i = 0;i < n;i++){
            System.out.println("i["+i+"]" +" : "+intArray[i]);
        }
    }
    public int[] arrSort(){
        for(int i = 0;i < n - 1;i++){
            for (int j = 0 ; j < n - 1 - i;j++){
                if(intArray[j] > intArray[j+1]){
                    int buf = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = buf;
                }
            }
        }
        return (intArray);
    }
    public static void main(String[] args){
        Arr arr = new Arr(10);
        arr.setArr();
        arr.getArr();
        arr.arrSort();
        arr.getArr();
    }
}
