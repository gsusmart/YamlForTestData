package techtalk.pojos;

public class Employee extends Profession {

    private String nameOfEmployer;
    private String salary;
    private String designation;

    public void setNameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public String getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameOfEmployer='" + nameOfEmployer + '\'' +
                ", salary='" + salary + '\'' +
                ", designation='" + designation + '\'' +
                "} " + super.toString();
    }
}
