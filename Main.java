import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        boolean flag = false;
        int courses = in1.nextInt();
        Course[] crs = new Course[courses];
        for (int i = 0; i < courses; i++) {
            String courseName = in1.next();
            String courseCode = in1.next();
            int courseVahed = in1.nextInt();
            int capacity = in1.nextInt();
             crs[i] = new Course(courseName,courseCode,courseVahed,capacity);
                if (!(crs[i].validVahed(courseVahed) && crs[i].validCode(courseCode) && crs[i].checkCapacity(capacity)))
                    i--;
        }

        int students = in.nextInt();
        Student[] std = new Student[students];
        for (int i = 0; i < students; i++) {
            String studentName = in.next();
            String studentID = in.next();
            int totalAVG = in.nextInt();
            std[i] = new Student(studentName,studentID,totalAVG);
                if (!(std[i].validTotalAvg(totalAVG) && std[i].validId(studentID) && std[i].courseToGet(totalAVG)))
                    i--;
                int tedadDars = in.nextInt();
                for (int j = 0; j < tedadDars; j++) {
                    String code = in.next();
                    for (int a = 0; a < courses; a++)
                        if (crs[a].getCode().equals(code)) {
                            std[i].courseToAdd(crs[a]);
                            crs[a].addStudent(std[i]);
                        }
            }
        }
            int studentNum = in.nextInt();
            for (int i = 0; i < studentNum; i++) {
                String stdName = in.next();
                for (int k = 0; k < students; k++)
                    if (std[k].getName().equals(stdName)) {
                            int change = in.nextInt();
                            for (int j = 0; j < change; j++) {
                                String code = in.next();
                                for (int l = 0; l < courses; l++){
                                    if (crs[l].getCode().equals(code)){
                                        std[k].courseToRemove(crs[l]);
                                        crs[l].deleteStudent(std[k]);
                                    }
                                }
                            }
                    }
            }

        for (int i = 0; i < courses; i++) {
            crs[i].printCourse();
        }
        for (int i = 0; i < students; i++){
            std[i].printStudent();
        }
    }
}
