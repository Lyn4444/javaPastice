public class course11_2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小当");
        System.out.println(person.toString());

        Student student = new Student();
        student.setName("小明");
        student.setGrade("大一");
        System.out.println(student.toString() + " " + student.getGrade());

        Employee employee =new Employee();
        employee.setName("小东");
        employee.setEmployeeData(9 , 9 ,2019);
        System.out.println(employee.toString() + " " + employee.getEmployeeData());

        Faculty faculty = new Faculty();
        faculty.setName("小白");
        faculty.setGrade("大二");
        faculty.setFacultyData(10 , 10 , 2019);
        System.out.println(faculty.toString() + " " + faculty.getGrade() + " " + faculty.getFacultyData());

        Stuff stuff = new Stuff();
        stuff.setName("小小");
        stuff.setPosition("经理");
        System.out.println(stuff.toString() + " " + stuff.getPosition());
    }
}



class MyData {
    private int day = 0 , month = 0 , year = 0;

    MyData() {

    }

    MyData(int day , int month , int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return year;
    }

    public void setData(int day , int month , int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getData() {
        String[] arrayData = new String[6];
        arrayData[0] = String.valueOf(this.year);
        arrayData[1] = "年";
        arrayData[2] = String.valueOf(this.month);
        arrayData[3] = "月";
        arrayData[4] = String.valueOf(this.day);
        arrayData[5] = "日";

        StringBuilder str = new StringBuilder();
        for (String e : arrayData) {
            str.append(e);
        }
        String sData = str.toString();
        return sData;
    }
}



class Person {
    public String name;
    public String address;
    public String telephoneNumbers;
    public String emailAddress;

    Person() {

    }

    Person(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getTelephoneNumbers() {
        return this.telephoneNumbers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTelephoneNumbers(String telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return new String("name : " + getName());
    }
}



class Student extends Person {
    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return new String("Student : " + getName());
    }
}


class Employee extends Person {
    private double price;
    private String office;
    MyData employeeData = new MyData();

    public double getPrice() {
        return this.price;
    }

    public String getOffice() {
        return this.office;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setEmployeeData(int day , int month , int year) {
        employeeData.setData(day , month , year);
    }

    public String getEmployeeData() {
        return employeeData.getData();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return new String("Employee : " + getName());
    }
}


class Faculty extends Person {
    private String Grade;
    MyData facultyData = new MyData();

    public String getGrade() {
        return this.Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setFacultyData(int day , int month , int year) {
        facultyData.setData(day , month , year);
    }

    public String getFacultyData() {
        return facultyData.getData();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return new String("Faculty : " + getName());
    }
}


class Stuff extends Person {
    private String Position;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return new String("Stuff : " + getName());
    }

    public String getPosition() {
        return this.Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }
}

