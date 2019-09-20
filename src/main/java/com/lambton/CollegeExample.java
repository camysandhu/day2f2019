package com.lambton;

public class CollegeExample
{

    public static void main(String[] args)
    {
        // int a,b;
       // Airthmetic airthmetic= new Airthmetic();


      /*System.out.println("ADD :  " + airthmetic.add(21,12) );
        System.out.println("SUB :  " + airthmetic.sub(21,12) );
        System.out.println("MUlti " + airthmetic.multiply(21,12) );
        System.out.println("DIVIDE :  " + airthmetic.divide(21,12) );*/

        Student s1 = new Student();
        s1.setFirstName("Camy");
        s1.setLastName("Sandhu");

        s1.setMarks1(40);
        s1.setMarks2(40);
        s1.setMarks3(50);
        s1.setMarks4(50);
        s1.setMarks5(50);
        System.out.println(s1.getFullName());
        s1.generateResult();;

    }










}
