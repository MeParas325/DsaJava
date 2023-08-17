class Student2 
{
    int rollNo, age;
    String name, course;
    Student2(int rollNo, int age, String name, String course)
    {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.course = course;
    }  
    void display() 
    {
        System.out.println("Roll Number : " + this.rollNo);
        System.out.println("Name : " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Course : " + this.course);
    } 
    public static void main(String[] args) {
        Student2 st = new Student2(123, 20, "kartikey negi", "BCA");
        st.display();
    }
}