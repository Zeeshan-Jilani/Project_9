package com.company.Main;

class T2{
    public static void genException(){
        int num[] = {4,8,16,32,64,128};
        int den[] = {2,0,4,8};

        for (int i = 0; i < num.length; i++){
            try{
                System.out.println(num[i] + " / " + den[i] + " is " + num[i]/den[i]);
            }
            catch (ArithmeticException e){
                System.out.println("Cannot divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Element Not Found!");
                System.out.println("Error!! Program Terminated");
            }
            finally {
            System.out.println("-----------------Process completed Successfully----------------");
            }
         }
    }
}

public class UseFinally {
    public static void main(String[] args) {
        T2.genException();
    }
}
