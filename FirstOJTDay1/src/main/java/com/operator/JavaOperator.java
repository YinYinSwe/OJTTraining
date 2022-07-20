package com.operator;

public class JavaOperator {

    public static void main(String[] args) {

        int februaryDays=29;
        String result;
        //ternary operator
        result=(februaryDays==28)?"No leap Year":"Leap Year";
        System.out.println(result);
        
        String str="Programming";
        boolean program;
        //checks if str is an instance of
        //the String class
        program=str instanceof String;
        System.out.println("name is an instance of String:"+program);
        
    }

}
