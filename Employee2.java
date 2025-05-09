import java.util.Scanner;

 class Employee1 {
    protected String name;
    protected String add;
    protected double salary;
    protected String Job;

    public Employee1(String name, String add, double salary, String job) {
        this.name = name;
        this.add = add;
        this.salary = salary;
        this.Job = job;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void generatePerformanceReport() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + Job);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee1 {
    private String department;

    public Manager(String name, String add, double salary, String department) {
        super(name, add, salary, "Manager");
        this.department = department;
    }

    public double calculateBonus() {
        return salary * 0.2;
    }

    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Department: " + department);
    }

    public void manageProject(String ProjectName) {
        System.out.println(name + " is managing project " + ProjectName);
    }
}

class Developer extends Employee1 {
    private String technology;

    public Developer(String name, String add, double salary, String technology) {
        super(name, add, salary, "Developer");
        this.technology = technology;
    }

    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Technology: " + technology);
    }

    public void developeProject(String ProjectName) {
        System.out.println(name + " is developing project " + ProjectName);
    }
}

class Programmer extends Employee1 {
    private String programmingLang;

    public Programmer(String name, String add, double salary, String technology, String programmingLang) {
        super(name, add, salary, "Programmer");
        this.programmingLang = programmingLang;
    }

    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Programming Language: " + programmingLang);
    }

    public void writecode(String ProjectName) {
        System.out.println(name + " is writing code for project " + ProjectName);
    }
}

 class Employee2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee type (1 for Manager, 2 for Developer, 3 for Programmer):");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter address:");
        String address = sc.nextLine();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter department:");
                String department = sc.nextLine();

                Manager m = new Manager(name, address, salary, department);
                System.out.println("Manager's Bonus: " + m.calculateBonus());
                m.generatePerformanceReport();
                System.out.println("Enter project name:");
                String project1 = sc.nextLine();
                m.manageProject(project1);
                break;

            case 2:
                System.out.println("Enter technology:");
                String technology = sc.nextLine();

                Developer d = new Developer(name, address, salary, technology);
                System.out.println("Developer's Bonus: " + d.calculateBonus());
                d.generatePerformanceReport();
                System.out.println("Enter project name:");
                String project2 = sc.nextLine();
                d.developeProject(project2);
                break;

            case 3:
                System.out.println("Enter technology:");
                String tech = sc.nextLine();
                System.out.println("Enter programming language:");
                String plang = sc.nextLine();

                Programmer p = new Programmer(name, address, salary, tech, plang);
                System.out.println("Programmer's Bonus: " + p.calculateBonus());
                p.generatePerformanceReport();
                System.out.println("Enter project name:");
                String project3 = sc.nextLine();
                p.writecode(project3);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        
    }
}