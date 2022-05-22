package com.company.Main;

class T1{
    public static String generateException(){
        String str = null;
        return str;
    }
}

class NullPointerException {
    public static void main(String[] args) {
        try{
            String sentence = T1.generateException();
            sentence.toString();
        }
        catch (java.lang.NullPointerException e){
            e.printStackTrace();
            e.toString();
        }
    }
}
