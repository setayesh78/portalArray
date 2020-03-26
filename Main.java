import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);

        int courses = in1.nextInt();
        ArrayList<Course> crs = new ArrayList<>(courses);
        for (int i = 0; i < courses; i++) {
            String courseName = in1.next();
            String courseCode = in1.next();
            int courseVahed = in1.nextInt();
            int capacity = in1.nextInt();
            crs.add(new Course(courseName, courseCode, courseVahed, capacity));
            for (Course p : crs)
                if (!(p.validVahed(courseVahed) && p.validCode(courseCode) && p.checkCapacity(capacity)))
                    crs.remove(p);
        }

        int students = in.nextInt();
        ArrayList<Student> std = new ArrayList<>(students);
        for (int i = 0; i < students; i++) {
            String studentName = in.next();
            String studentID = in.next();
            int totalAVG = in.nextInt();
            std.add(new Student(studentName, studentID, totalAVG));
            for (Student s : std) {
                if (!(s.validTotalAvg(totalAVG) && s.validId(studentID) && s.courseToGet(totalAVG)))
                    std.remove(s);
                int tedadDars = in.nextInt();
                for (int j = 0; j < tedadDars; j++) {
                    String code = in.next();
                    Iterator<Course> it = crs.iterator();
                    while (it.hasNext()) {
                        Course temp = it.next();
                        if (temp.getCode().equals(code))
                    s.courseToAdd(temp);
                }
            }
        }


//            int studentNum = in.nextInt();
//            for (int l =0; l < studentNum; l++){
//                String stdName = in.next();
//                int change = in.nextInt();
//                for (int j = 0; j < change; j++) {
//                    String code = in.next();
//                    for (Course o: crs) {
//                        if (code.equals())
//                    }
//                }
//            }
            for (Course b : crs)
                b.printCourse();
        }
    }
}
