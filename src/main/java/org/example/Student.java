package org.example;
import java.util.Scanner;

public class Student{
    String StudentName;
    char GradeLevel;
    float GPA;
    Student(String name,char gr,float gp){
        StudentName=name;
        GradeLevel=gr;
        GPA=gp;
    }
    public void Update(float gpa){
        GPA=gpa;
        System.out.println("The updated Gpa is-----"+GPA);
    }
    public String NameandGPA(){
        String res="";
        res+=StudentName+" "+"has a "+GPA+ "GPA";
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Student Name");
        String name=sc.next();
        System.out.println("Enter the Grade level");
        char gr = sc.next().charAt(0);
        System.out.println("Enter your GPA");
        float gp=sc.nextFloat();
        Student calculation = new Student(name, gr, gp);
        int choose=0;
        while(choose!=4){
            System.out.println("Do you need to update your GPA"+"\n"+"1.Yes"+"\n"+"2.No"+"\n"+"3.View Student Name and GPA"+"\n"+"4.Exit");
            choose=sc.nextInt();
            if(choose==1){
                System.out.println("Enter the GPA to be Upated");
                float updated=sc.nextFloat();
                calculation.Update(updated);
            }
            else if(choose==2){
                System.out.println("Its Okay");
            }
            else if(choose==3){
                String result=calculation.NameandGPA();
                System.out.println(result);
            }
        }
    }
}
