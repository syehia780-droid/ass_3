import java.util.Scanner;

public  class Student {
    public int id;
    public String name ;
    public double grade;
     public static double maxGrade=0;

public void display()
    {
        String gradeStatus="Fail";
        if(grade>=90)
            gradeStatus="Excellent";
        else if (grade>=75)
            gradeStatus="Very Good";
        else if (grade>=60)
            gradeStatus="Pass";


        System.out.println(name+" "+id+" "+grade+" "+gradeStatus);
    }
    public double averageGrade(int numStudent)
    {
        double sum=0;
        sum+=grade;
        return sum/numStudent;
    }
    public double highestgrade(Student student[])
    {

        for(int i=0;i<student.length;i++)
        {
            if(maxGrade<student[i].grade)
            {
                maxGrade=student[i].grade;
            }
        }
        return maxGrade;
    }
    public static void SearchStudent(Student student[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println(" please entre id ");
        if(in.hasNextInt())
        {
            int idStudent=in.nextInt();
            for(int i=0;i<student.length;i++)
            {
                if(idStudent==student[i].id) {
                    System.out.println(" the student is found");
                    return;
                }
                else
                {
                    System.out.println(" the student is not  found");
                    return;
                }

            }
        }
        else
        {
            System.out.println(" invalid input .");
            in.next();
        }


    }



}
