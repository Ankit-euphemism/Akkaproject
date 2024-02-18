package com.ANkit.Ob;

import java.util.*;
class PasswordLengthException extends RuntimeException{
    public String getMessage(){
        return "The password Length is not correct";
    }
}
class Check{
    void checkpasswordlength(String pass) throws PasswordLengthException{
        if(pass.length ()<8){
            try {
                throw new PasswordLengthException ();
            }
            catch (RuntimeException e){
                System.out.println (e.getMessage ());
            }
        }
        else {
            System.out.println ("The password is correct and value is:-"+pass);
        }
    }
}
public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the password:-");
        String pa=sc.nextLine ();
       Check ch=new Check();
       ch.checkpasswordlength (pa);
    }
}
