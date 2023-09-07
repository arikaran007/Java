class Students{
    int rollno;
    String name;
    int marks;
}

public class EnLoop2 {
    public static void main(String a[])
    {
        Students s1 = new Students();
        s1.rollno = 23;
        s1.marks = 90;

        Students s2 = new Students();
        s2.rollno = 24;
        s2.name ="karan";
        s2.marks = 98;

        Students s3 = new Students();
        s3.rollno = 27;
        s3.name ="rockt";
        s3.marks = 93;


        Students student[] = new Students[3];
        student[0]= s1;
        student[1]=s2;
        student[2]=s3;


        for(Students stud : student)
        {
            System.out.println(stud.name + ":" + stud.marks);
        }

    }
}
