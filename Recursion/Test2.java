class Student 
{
    int RollNo ;
    String Name;
    static String college = "Graphic Era Hill University";
    Student(int RollNo, String Name)
    {
        this.RollNo = RollNo;
        this.Name = Name;
    }
    void display()
    {
        System.out.println("Roll Number: " + this.RollNo);
        System.out.println("Name: " + this.Name);
        System.out.println("College: " + college);
    }
}
class Test2
{
    public static void main (String [] args) {
        Student s = new Student (1971040 ,"kartikey negi");
        s.display();
    }
}
