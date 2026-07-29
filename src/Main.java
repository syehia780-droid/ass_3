Scanner in1 = new Scanner(System.in);
String validation_name()
{
    if(in1.hasNext())
    {
        String name=in1.nextLine();
        return name;
    }
    else
    {
        System.out.println(" invalid input .");
        return null;
    }


}
int  validationIntNum( )
{
    if(in1.hasNextInt()) {
       int  num = in1.nextInt();
        return num;
    }
    else
    {
        System.out.println(" invalid input .");
        return -1;
    }


}
double  validationDoubleNum()
{
    if(in1.hasNextDouble()) {
       double num = in1.nextDouble();
        return num;
    }
    else
    {
        System.out.println(" invalid input .");
        return 0.0;
    }


}
byte  validationByteNum()
{
    if(in1.hasNextByte()){
        byte num=in1.nextByte();
        return num;
    }

    else
    {
        System.out.println(" invalid input .");
        return 0;
    }

}
Student[] students ;
void main() {

//    Scanner in2 = new Scanner(System.in);
//    Scanner in3 = new Scanner(System.in);
    byte numStudent=0 ;
    byte numService = 0;
    boolean nonExit = true;
    int n = 0;
    int m=0;
    for(int r=0;r<3;r++) {

        System.out.print(" please enter the number of students :");
        numStudent = validationByteNum();
        if(numStudent!=0) {
            students = new Student[numStudent];
            r = 3;
        }
        else
        in1.nextLine();
    }
    if(numStudent==0)
        return;

    for (int i = 0; i < students.length; i++)
    {
        students[i] = new Student();
        n++;
        in1.nextLine();
        System.out.print(" please enter the name  of student " + n + ":");
        students[i].name = validation_name( );
        System.out.print(" please enter the id  of student " + n + ":");
        students[i].id = validationIntNum();
        System.out.print(" please enter the grade  of student " + n + ":");
        students[i].grade = validationDoubleNum();


        if(students[i].grade>=60)
            m++;
//            } else {
//                System.out.println(" invalid input .");
//                in1.next();
        //   }
//            in2.close();
//            in3.close();
    }
    System.out.println("passed students : "+m);
    System.out.println("failed students : "+(n-m));
        while (nonExit) {


            System.out.println("1. Display Students\n2. Calculate Average Grade\n3. Find Highest Grade.\n4. Search Student by ID.\n0. Exit");
            System.out.print("please enter the number of service ");

                numService = validationByteNum();
                switch (numService) {
                    case 1:
                        System.out.println("name  id  grade  gradeStatus");
                        for (int i = 0; i < students.length; i++)
                            students[i].display();
                        break;
                    case 2:
                        double result=0;
                        for (int i=0;i<students.length;i++)
                           result+= students[i].averageGrade(numStudent);
                        System.out.println(" the average of grades = "+result);
                        break;

                    case 3:
                            System.out.println(" the Highest Grade  ="+students[0].highestgrade(students));
                        break;
                    case 4:

                       Student.SearchStudent(students);
                       break;
                    case 0:
                        nonExit=false;
                        break;
                    default:
                        break;
                }



        }




    }