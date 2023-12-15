package org.example;

public class VariableAndDataTypes {
   private int age = 26;
   private String fullName = "Saif Maknojia";
   private float weight = 83.4F;
   private boolean isMarried = false;

    public void primitiveTypeVariable(){
        System.out.println(age);
        System.out.println(fullName);
        System.out.println(weight);
        System.out.println(isMarried);
    }

    public void swapVariable(){

        int a = 5;
        int b = 11;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
