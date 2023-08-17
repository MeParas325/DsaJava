class Student{
    String name;
    long rollNo;
    Student(String name, long rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    Student(Student s)
    {
        System.out.println("Copy constructor  !! ");
        name = s.name;
        rollNo = s.rollNo;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kartikey Negi", 1971040);
        Student s2 = new Student(s1);
        System.out.println("Name  : " + s2.name);
        System.out.println("Roll Number : " + s2.rollNo);
    }

}