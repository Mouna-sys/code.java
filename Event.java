import java.util.ArrayList;
import java.util.Scanner;

class Event {
    private String name;
    private String date;
    private String location;

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

class Student {
    private String name;
    private String rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
}

public class CollegeEventManagementSystem {
    private static ArrayList<Event> events = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("College Event Management System");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Register Student");
            System.out.println("4. View Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEvent(scanner);
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    registerStudent(scanner);
                    break;
                case 4:
                    viewStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addEvent(Scanner scanner) {
        System.out.print("Enter event name: ");
        String name = scanner.nextLine();
        System.out.print("Enter event date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter event location: ");
        String location = scanner.nextLine();

        Event event = new Event(name, date, location);
        events.add(event);
        System.out.println("Event added successfully!");
    }

    private static void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

    private static void registerStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        Student student = new Student(name, rollNumber);
        students.add(student);
        System.out.println("Student registered successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
