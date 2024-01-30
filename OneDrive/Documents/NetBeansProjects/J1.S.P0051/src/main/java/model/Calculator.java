/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Calculator {
    public String BMICalculator(int weight,int height)
    {   height= height/100;
        float BMI=weight/(height*height);
        if (BMI<19) return "Under-standard";
                else   if (BMI<25) return "Standard";
                else   if (BMI<30) return "OverWeight";
                else   if (BMI<40) return "Fat";
                else return "Very Fat";
    }
    public float Calculator(float a,char b,float c)
    {    float x=0;
         if (b=='+') 
         {
             return a+c;
         }
        switch (b) {
            case '-':
                return a-c;
            case '*':
                return a*c;
            case '/':
                return a/c;
            case '^':
                x=a;
                for (int i=2;i<=c;i++)
                {   
                    a*=x;
                }
                return a;
            default:
                return a;
        }
    }
    
}
