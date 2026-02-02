public class Employee {

    private Integer Id;

    private String name;

    private String department;

    private String address;

    private int age;

    private Integer salary;

    public Employee(String name, String department, String address, int age, Integer salary) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return Id;
    }

    public  void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
