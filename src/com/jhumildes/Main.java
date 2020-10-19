package com.jhumildes;

public class Main {

    //function to reverse the string
    public static void reverse(StringBuffer str)
    {
        //create a stack of capacity
        //equal to length of string
        int n = str.length();
        Stack obj = new Stack(n);

        //Push all characters od string to stack
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        //pop all characters of string and put them back to str
        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }

    }
    public static void main(String[] args) {

      //create a new strin
        StringBuffer s = new StringBuffer(" GeeksQuiz");

        //call reverse method
        reverse(s);

        //print the reversed string
        System.out.println("Reversed String is  " + s);

    }
}
