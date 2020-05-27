public class Main {

    public static void main(String[] args) {
    showWorkersOver40(initEmployeeArray());
    }

    public static Employee[] initEmployeeArray() {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Luke Skywalker", "Jedi",
                "1977@galactic.com", "+7–905-121-05-12", 1, 32);
        employeesArray[1] = new Employee("George Lukas", "Film Director",
                "George@gmail.com", "+7-901-963-03-27", 1000000, 57);
        employeesArray[2] = new Employee("Cristiano Ronaldo", "Football player",
                "Ronaldo@CR7.com", "+7-123-123-22-07", 440001337, 35);
        employeesArray[3] = new Employee("Carroll Shelby", "Racer",
                "mustang@ford.com", "+7-912-132-53-12", 600000, 89);
        employeesArray[4] = new Employee("Vasya Pupkin", "Officer",
                "Pupkin_v@gmail.com", "+7-912-912-39-41", 1000, 49);

        return employeesArray;
    }

    public static void showWorkersOver40(Employee[] arr) {

        for (Employee employee : arr) {

            if (employee.getAge() >= 40) {
                employee.getInfo();
            }
        }
    }
}
