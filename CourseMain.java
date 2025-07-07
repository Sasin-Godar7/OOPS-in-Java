class Course {
    String title;
    int credit;
    String courseCode;

    void setValues(String t, int c, String code) {
        title = t;
        credit = c;
        courseCode = code;
    }

    void showValues() {
        System.out.println("Title: " + title + ", Credit: " + credit + ", Code: " + courseCode);
    }
}

public class CourseMain{
    public static void main(String[] args) {
        Course[] c = new Course[5];

        c[0] = new Course(); c[0].setValues("C Programming", 3, "CACS101");
        c[1] = new Course(); c[1].setValues("Java", 4, "CACS204");
        c[2] = new Course(); c[2].setValues("Computer Graphics", 3, "CACS305");
        c[3] = new Course(); c[3].setValues("Data Structures", 3, "CACS203");
        c[4] = new Course(); c[4].setValues("C++", 3, "CACS104");

        System.out.println("Courses starting with 'C':");
        for (int i = 0; i < 5; i++) {
            if (c[i].title.startsWith("C")) {
                c[i].showValues();
            }
        }
    }
}
