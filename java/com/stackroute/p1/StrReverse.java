package com.stackroute.p1;

import java.util.Scanner;

public class StrReverse {
    public String reverse(String str){



        String[] strArr=str.split("");
        String rev=new String();
        for(int i=strArr.length-1;i>=0;i--)
        {
            rev=rev+strArr[i];
        }
        return rev;
    }

}
