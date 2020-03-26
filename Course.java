import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private int vahed;
    private int capacity;
    private ArrayList<Student> students;
    boolean flag = true;
    public Course(String name, String code,int vahed,int capacity) {
        students = new ArrayList<Student>();
        this.name = name;
        if (validCode(code))
        this.code = code;
        else System.out.println("invalid code!");
        if (validVahed(vahed))
        this.vahed = vahed;
        else System.out.println("invalid vahed!");
        if (checkCapacity(capacity))
        this.capacity = capacity;
        else System.out.println("out of capacity!");
    }
    public boolean checkCapacity(int capacity){
        if (students.size() <= capacity)
            return true;
        else
            return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVahed(int vahed) {
        if (validVahed(vahed))
        this.vahed = vahed;
        else
            System.out.println("invalid index!");
    }

    public void setCapacity(int capacity) {
        if (checkCapacity(capacity))
        this.capacity = capacity;
        else
            System.out.println("out of capacity!");
    }

    public void setCode(String code) {
        if (validCode(code))
        this.code = code;
        else
            System.out.println("invalid code!");
    }

    public String getCode() {
        return code;
    }

    public int getVahed() {
        return vahed;
    }
    public boolean validCode(String code){
        if (code.length() == 4)
            return true;
        else
            return false;
    }
    public boolean validVahed(int vahed){
        if(vahed >= 1 && vahed <= 3)
            return true;
        else
            return false;
    }
    public boolean checkStudent(){
        for (Student i: students){
            if((i.getIdNumber()).equals(students))
                flag = false;
        }
        return flag;
    }
    public void deleteCourse(Student student){
        if (students.contains(student))
            students.remove(student);
        else
            System.out.println("don't have the course!");
    }
    public void addCourse(Student student){
        if (checkCapacity(capacity) && validCode(code) && validVahed(vahed) && checkStudent()){
            students.add(student);
        }
    }
    public void printCourse(){
        System.out.print(name + ": ");
        for (Student s: students)
            System.out.print(s.getName() + " ");
        System.out.println();
    }
}
