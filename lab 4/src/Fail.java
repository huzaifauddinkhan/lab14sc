/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author se21f-145
 */public final class Fail {
    final String coursename;
    final int coursecode;
    final int rollno;
    public Fail(String coursename,int coursecode,int rollno){
        this.coursename=coursename;
        this.coursecode=coursecode;
        this.rollno=rollno;
    }
    public String getName(){
        return coursename;
    }
    public int getCode(){
        return coursecode;
    }
    public int getroll(){
        return rollno;
        
    }
public static void main(String[] args) {
    Fail obj = new Fail("Software Requirment Eng",202,145);
    System.out.println("\nFailed in 3rd semester\n");
    System.out.println("Course:"+obj.getName()+"\n");
    System.out.println("CourseCode:"+obj.getCode()+"\n");
    System.out.println("Roll no:"+obj.getroll()+"\n");
    system.out.println("huzaifa")
}
}

