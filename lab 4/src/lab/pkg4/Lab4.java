package lab.pkg4;


public class Lab4 {
    private String coursename ;
    private int coursecode ;
    private int rollno ;
    private Lab4 (String coursename, int coursecode , int rollno ) {
        this.coursename = coursename ;
        this.coursecode = coursecode ;
        this.rollno = rollno;
    }
    public String getName (){
        return coursename ;
    }
    public void setName (String coursename) {
        this.coursename = coursename ;
    }
    public int getCode (){
        return coursecode;
        
    }
    
    public void setCode ( int coursecode){
        this.coursecode = coursecode;
    }
    public int getroll () {
        return rollno;
    }
    public void setroll (int rollno){
        this.rollno = rollno;
    }
    

    public static void main(String[] args) {
        System.out.println("Previous Class Preview");
        Lab4 obj = new Lab4 ("Software Design Architecture",204,145);
        System.out.println("Previous course:"+obj.getName()+"\n");
        System.out.println("CourseCode:"+obj.getCode()+"\n");
        System.out.println("Roll Number:"+obj.getroll()+"\n");
        System.out.println("Congrats You are promoted to new class"+"\n");
        obj.setName("Software Construction and Development");
        obj.setCode(456);
        obj.setroll(145);
        System.out.println("Course Name:" +obj.getName()+"\n");
        System.out.println("Cousre Code:" +obj.getCode()+"\n");
        System.out.println("Roll No:"+obj.getroll()+"\n");
    }
    
}
