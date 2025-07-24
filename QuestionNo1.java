//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
//I/P => NONE
//O/P => Harry's age in 2024 is ___

public class QuestionNo1
{
    public static void main(String[]args)
    {
        int birthyear = 2000;
        int currentyear = 2024;
        int age = currentyear - birthyear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}
