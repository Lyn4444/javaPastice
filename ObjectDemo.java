public class ObjectDemo {
    public static void main (String[] args) {
        employee employee1 = new employee();
        employee1.setEmployeeId("S001");
        employee1.setName("John");
        employee1.setSex("male");
        employee1.setDept("Engineering-Department");
        employee1.setDuty("manager");
        employee1.setWage(8000);

        employee employee2 = new employee();
        employee2.setEmployeeId("S002");
        employee2.setName("Kate");
        employee2.setSex("female");
        employee2.setDept("HR-Department");
        employee2.setDuty("cleck");
        employee2.setWage(5000);

        for (String e : employee1.getPaySlip())
            System.out.print(e + " ");
        System.out.println();
        for (String e : employee2.getPaySlip())
            System.out.print(e + " ");
    }
}


class Salary implements OfRealWage{
    public String employeeId;
    private double wage;
    private double tax;
    private double realWage;

    Salary() {

    }

    Salary (String employeeId , double wage) {
        this.employeeId = employeeId;
        this.wage = wage;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setRealWage(double realWage) {
        this.realWage = realWage;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double getRealWage() {
        double tempWage = wage - 2000;
        if (tempWage <= 500)
            realWage = wage - tempWage * 0.05;
        if (500 <= tempWage && tempWage <= 2000)
            realWage = wage - tempWage * 0.1 - 25;
        if (2000 <= tempWage && tempWage <= 5000)
            realWage = wage - tempWage * 0.15 - 125;
        if (5000 <= tempWage && tempWage <= 20000)
            realWage = wage - tempWage * 0.20 - 375;
        if (20000 <= tempWage && tempWage <= 40000)
            realWage = wage - tempWage * 0.25 - 1375;
        if (40000 <= tempWage && tempWage <= 60000)
            realWage = wage - tempWage * 0.30 - 3375;
        if (60000 <= tempWage && tempWage <= 80000)
            realWage = wage - tempWage * 0.35 - 6375;
        if (80000 <= tempWage && tempWage <= 100000)
            realWage = wage - tempWage * 0.40 - 10375;
        if (tempWage > 100000)
            realWage = wage - tempWage * 0.45 - 15375;

        return realWage;
    }

    public double getTax() {
        return tax;
    }

    public double getWage() {
        return wage;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}


class employee extends Salary {
    private String name;
    private String sex;
    private String dept;
    private String duty;
    private String[] paySlip = new String[7];

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmployeeId(String employeeId) {
        super.employeeId = employeeId;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDept() {
        return dept;
    }

    public String getDuty() {
        return duty;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String[] getPaySlip() {
        paySlip[0] = this.employeeId;
        paySlip[1] = this.name;
        paySlip[2] = this.sex;
        paySlip[3] = this.dept;
        paySlip[4] = this.duty;
        paySlip[5] = Double.toString(getWage());
        paySlip[6] = Double.toString(getRealWage());

        return paySlip;
    }
}


interface OfRealWage {
    double getRealWage();
}

