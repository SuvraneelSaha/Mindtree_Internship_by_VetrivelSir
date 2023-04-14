package Week2.OOPSDay2;

import java.util.Scanner;

// Course class
// course name ;
// course instructor
// students
//
public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of Objects");
        int n = in.nextInt();
        Course[] arr = new Course[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Please enter the Course Name");
            String CourseName = in.nextLine();
            CourseName = in.nextLine();
            System.out.println("Please enter the instructor Name");
            String INname = in.nextLine();
            System.out.println("Pleas enter the number of Students");
            int students = in.nextInt();

            arr[i] = new Course(CourseName,INname,students);
        }
        System.out.println("Enter the course Name to be searched");
        String search = in.nextLine();
        search = in.nextLine();
        searchCourse(arr,search);
    }
    public static void searchCourse(Course[] arr , String search)
    {
        int check = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if(search.equalsIgnoreCase(arr[i].getCourseName()))
            {
                check = 1 ;
                if(arr[i].getStudents() > 1000)
                {
                    System.out.println("gold");
                }
                else if(arr[i].getStudents()>500)
                {
                    System.out.println("Trending");
                }
                else
                {
                    System.out.println("Good");
                }
            }
        }
        if(check == 0)
        {
            System.out.println("No course found");
        }

    }
}
class Course
{
    private String CourseName;
    private String INName;
    private int students;

    Course(String CourseName,String INName , int students)
    {
        this.CourseName = CourseName;
        this.INName = INName;
        this.students=students;
    }

    public String getCourseName()
    {
        return this.CourseName;
    }
    public String getINName()
    {
        return this.INName;
    }
    public int getStudents()
    {
        return this.students;
    }




}