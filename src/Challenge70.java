 class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

//     @Override
//     public String toString() {
//         return "Student{" +
//                 "age=" + age +
//                 ", name='" + name + '\'' +
//                 '}';
//     }

     public String toString(){
        return "My name is: " + name + ", My age: "+age;
     }

     static void main(String[] args) {
        Student student1 = new Student(23, "Mahbub");
         System.out.println(student1.toString());

    }
}
