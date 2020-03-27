import java.util.ArrayList;
public class Student {
    private String name;
    private String idNumber;
    private int totalAvg;
    private ArrayList<Course> courses;
    int sum = 0;
    public Student(String name,String idNumber,int totalAvg){
        courses = new ArrayList<Course>();
        this.name = name;
        if (validId(idNumber))
        this.idNumber = idNumber;
        else System.out.println("invalid ID number!");
        if (validTotalAvg(totalAvg))
            this.totalAvg = totalAvg;
        else System.out.println("invalid total average!");
    }

    public void setIdNumber(String idNumber) {
        if(validId(idNumber))
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalAvg(int totalAvg) {
        if (validTotalAvg(totalAvg))
        this.totalAvg = totalAvg;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean validId(String idNumber){
        if(idNumber.length() != 7){
            System.out.println("invalid ID number!");
            return false;
        }else
            return true;
    }
    public boolean validTotalAvg(float totalAvg){
        if(totalAvg <= 0 && totalAvg >= 20){
            System.out.println("invalid total average!");
            return false;
        }else
            return true;
    }
    boolean flag = false;
    public boolean courseToGet(float totalAvg){
        for(Course i: courses)
            sum += i.getVahed();
        if(totalAvg >= 15 && sum <= 20)
            flag = true;
        if (totalAvg >= 10 && totalAvg <= 15 && sum <= 15)
            flag = true;
        if (totalAvg <= 10 && sum == 0)
            flag = true;
        return flag;
        }
    public void courseToRemove(Course course){
        if (courses.contains(course))
            courses.remove(course);
        else
            courses.add(course);
    }
    public void courseToAdd(Course course){
//        if (courses.contains(course))
//            System.out.println("you already have the course!");
//        else
//            if (courseToGet(totalAvg))
                courses.add(course);
    }
    public void printStudent(){
        System.out.print(name + ":");
        for (Course i: courses)
            System.out.print(i.getName() + " ");
        System.out.println();
    }

    }
