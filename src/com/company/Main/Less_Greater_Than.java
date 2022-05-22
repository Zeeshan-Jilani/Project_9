package com.company.Main;

public class Less_Greater_Than {
    public static void Method(int a) throws LessThan1Exception,GreaterThan1Exception,Equals0Exception{
        if(a<0){
            throw new LessThan1Exception("number < 0");
        }
        else if (a>1){
            throw new GreaterThan1Exception("number > 1");
        }
        else if(a==0){
            throw new Equals0Exception("number = 0");
        }
    }
    public static  void main(String[]args) throws GreaterThan1Exception, LessThan1Exception, Equals0Exception {
        try {
            Method(-6);
        }
        catch (GreaterThan1Exception | Equals0Exception |LessThan1Exception e ){
            System.out.println(e);
        }

    }

}
