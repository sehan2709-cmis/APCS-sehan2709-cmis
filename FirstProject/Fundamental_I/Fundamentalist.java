package Fundamental_I;

import java.util.Scanner;
import java.util.Random;

public class Fundamentalist
{
    public static void main(String args[]){
        dataTypes();
        int a = add(3, 4);
        int m = mul(3, 4);
        System.out.println(a);
        System.out.println(m);
        int s = sub(4, 3);
        int d = div(4,2);
        System.out.println();
        System.out.println(s);
        System.out.println(d);

        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("I will do a subtraction. Give me a number");
        n1 = sc.nextInt();
        System.out.println("Give me another number");
        n2 = sc.nextInt();
        int work = n1 - n2;
        System.out.println();
        System.out.println(n1 + " - " + n2 + " = " + work);

        System.out.println();
        System.out.println();

        int n3;
        int n4;
        System.out.println("I will do a division. Give me a number");
        n3 = sc.nextInt();
        System.out.println("Give me another number");
        n4 = sc.nextInt();
        int workk = (n3/n4);
        System.out.println();
        System.out.println(n3 + " / " + n4 + " = " + workk);

        System.out.println();
        System.out.println();

        int n5;
        int n6;
        System.out.println("Tell me two numbers that you want to be compare.");
        n5 = sc.nextInt();
        n6 = sc.nextInt();
        System.out.println();
        compare(n5, n6);

        System.out.println();
        System.out.println();

        int n7;
        System.out.println("Tell me the number that you want to see it is odd or even or 0!!!!\n - If you give me an even number, you will get 1. \n - If you give me an odd number, you will get -1.\n - If you give me a zero, you will get zero.");
        n7 = sc.nextInt();
        int wokr = evenOddZero(n7);
        System.out.println();
        System.out.println(wokr);

        System.out.println();
        System.out.println();
    }

    public static void dataTypes(){
        byte a = -128;
        byte b = 127;
        short c = -32768;
        short d = 32767;
        int e = -2147483648;
        int f = 2147483647;
        long g = -9223372036854775808L;
        long h = 9223372036854775807L;
        float i = 0.1f;
        float j = -0.1f;
        double k = 123.123123;
        double l = -123.123123;
        boolean m = true;
        char n = '\u0000';
        char o = '\uffff';
        String Description_Byte = "Byte data type is an 8-bit signed two's complement integer. \n Minimum value is -128 (-2^7) and maximum value is 127 (inclusive)(2^7 -1). \n It is able to be used in teaching kids to count 1 to 10! \nIt is able to be used in counting your fingers \n It is able to be used in count your towes";
        String Description_Short = "Short data type is a 16-bit signed two's complement integer. \n Minimum value is -32,768 (-2^15) and maximum value is 32,767 (inclusive) (2^15 -1). \n It is able to be used in school counting whole student in school. \n It is able to be used in normal people trying to buy cell phone in Thailand (because it usually doesn't go up higher than 30,000 Baht. \n It is able to be used in counting student's essay word.";
        String Description_Int = "Int data type is a 32-bit signed two's complement integer. \n Minimum value is - 2,147,483,648 (-2^31) and maximum value is 2,147,483,647(inclusive) (2^31 -1). \n it is able to use in calculating water that is being used in swimming pool, and also in how much hour you have played games in student's life. Lastly, it is able to use to see how many people have graduated in CMIS.";
        String Description_Long = "Long data type is a 64-bit signed two's complement integer. \n Minimum value is -9,223,372,036,854,775,808(-2^63) and maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1). \n It is use to count how much does the world richest man actually have. \n It is able to be use to count to total population in earth. \n It is able to use in calculating how long did dinosaur have lived before.";
        String Description_Float = "Float data type is a single-precision 32-bit IEEE 754 floating point. \n Float is mainly used to save memory in large arrays of floating point numbers. Default value is 0.0f. \n Float is able to be used in Alegbra. \n Float is able to be used in Algebra II. \n Float is able to used in Geometry especially in real word situation.";
        String Description_Double = "double data type is a double-precision 64-bit IEEE 754 floating point. \n This data type is generally used as the default data type for decimal values, generally the default choice. \n Double data type should never be used for precise values such as currency.";
        String Description_Boolean = "boolean data type represents one bit of information. \n There are only two possible values: true and false. \n This data type is used for simple flags that track true/false conditions. \n Default value is false. \n It is able to use in every single thing in life. \n It is able to be use to chosse or think that something is right or wrong.";
        String Description_Char = "char data type is a single 16-bit Unicode character. \n Minimum value is '\u0000' (or 0). \n Maximum value is '\uffff' (or 65,535 inclusive). \n Char data type is used to store any character. \n this is also to be use in our life such as memorizing things at it is. Such as looking a little white box look thing is an eraser.";
        //Code the problem here.
    }

    public static int add(int a, int b){
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b){
        int result = a - b;
        return result;}

    public static int mul(int a, int b){
        int result = a * b;
        return result;}

    public static int div(int a, int b){
        int result = a / b;
        return result;}

    public static double addi(double a, double b){
        double result = a + b;
        return result;}

    public static double subt(double a, double b){
        double result = a - b;
        return result;}

    public static double mult(double a, double b){
        double result = a * b;
        return result;}

    public static double divs(double a, double b){
        double result = a / b;
        return result;}

    public static void compare(int a, int b){
        if (a > b){
            System.out.println("The value of a is " + a + " and it is less than b whose value is " + b + ".");}
        else if (a < b){
            System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");}
        else {
            System.out.println("The value of a is " + a + " and it is equal to b whose value is " + b + ".");}}

    public static int evenOddZero(int a){
        if (a == 0)
        {return 0;}
        else if (a % 2 == 0)
        {return 1;}
        else
        {return -1;}}
        
    public static void suqareTable(){
        int i = 1;
        int in = i;
        for (in = i; in <= 10; in++);
        {
            int s = in * in;
            int r = (int)(Math.random()*((s - in)+1)+in);
            System.out.format("%d\t%d\t%d\t", in, s, r);
        }
        }
}


