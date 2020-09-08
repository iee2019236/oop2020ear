class Job {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Person {
    private Job job;

    public Person() {
        this.job = new Job();
        job.setSalary(1000);
    }

    public int getSalary() {
        return job.getSalary();
    }
}

public class K3_Thema1_3 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getSalary());
    }
}