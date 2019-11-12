public class course13_13 {
    public static void main(String[] args) {
        Course course = new Course("first");
        course.addStudent("小明");
        course.addStudent("小命");
        course.addStudent("小名");
        for (String e : course.getStudents()) {
            if (e != null)
                System.out.println(e);
        }
    }
}

class Course {
    private String courseName;
    private int numberOfStudents;
    private String[] students = new String[100];

    Course () {

    }

    Course (String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
       students[numberOfStudents] = student;
       numberOfStudents ++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int start = 0 , end = numberOfStudents;

        for (int i = 0 ; i < numberOfStudents ; i ++ ) {
            if (students[i] == student)
                start = i;
        }

        for (int i = start ; start <= end ; i ++ ) {
            students[i] = students[i + 1];
        }

        numberOfStudents --;
    }

}


interface clone {

}

