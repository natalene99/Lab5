import java.util.ArrayList;

class Main {
  public static void main(String[] args) 
  {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
Student student2 = new Student();
student2.setName("Nick Natale");
student2.setGPA(4.3);
student2.setMajor("MIS");

   student1.print();
   student2.print();

ArrayList<Double> gpas = new ArrayList<Double>();
gpas.add(student1.gpa);
gpas.add(student2.gpa);

double sumGPA = 0;
for(int i=0; i< gpas.size(); i++)
{
  sumGPA += gpas.get(i);
}

System.out.println("The average GPA is " + sumGPA/gpas.size());
  }
}