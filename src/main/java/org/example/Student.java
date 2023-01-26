package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Student{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
   private String studentName;
    private char gradeLevel;
    private float gPA;
    Student(String name,char gr,float gp){
        studentName=name;
        gradeLevel=gr;
        gPA=gp;
    }
    public void update(float gpa){
        gPA=gpa;
        LOGGER.log(Level.INFO,"The updated Gpa is-----"+gPA);
    }
    public String nameAndgPA(){
        String res="";
        res+=studentName+" "+"has a "+gPA+" GPA";
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LOGGER.log(Level.INFO,"Please Enter the Student Name");
        String name=sc.next();
        LOGGER.log(Level.INFO,"Enter the Grade level");
        char gr = sc.next().charAt(0);
        LOGGER.log(Level.INFO,"Enter your GPA");
        float gp=sc.nextFloat();
        Student calculation = new Student(name, gr, gp);
        int choose=0;
        while(choose!=4){
            LOGGER.log(Level.INFO,"Do you need to update your GPA"+"\n"+"1.Yes"+"\n"+"2.No"+"\n"+"3.View Student Name and GPA"+"\n"+"4.Exit");
            choose=sc.nextInt();
            if(choose==1){
                LOGGER.log(Level.INFO,"Enter the GPA to be Upated");
                float updated=sc.nextFloat();
                calculation.update(updated);
            }
            else if(choose==2){
                LOGGER.log(Level.INFO,"Its Okay");
            }
            else if(choose==3){
                String result=calculation.nameAndgPA();
                LOGGER.log(Level.INFO,result);
            }
        }
    }
}
