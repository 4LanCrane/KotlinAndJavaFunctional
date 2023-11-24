import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    public class Main {


        public static void main(String[] args) {

            ArrayList<Student> students = new ArrayList<Student>();//create an arraylist of students
            //add students to the arraylist
            students.add(new Student("Alan", "Cray", 12, CourseType.CS, 8, 1));
            students.add(new Student("Bonny", "Tom", 18, CourseType.SE, 6, 2));
            students.add(new Student("Jeff", "Mathetew", 12, CourseType.CSG, 4, 3));
            students.add(new Student("John", "King", 22, CourseType.SE ,4, 4));
            students.add(new Student("Tom", "bobby", 32, CourseType.SE, 5, 5));
            students.add(new Student("Alisha", "reed", 12, CourseType.CSG, 6, 6));
            students.add(new Student("Terry", "Johnson", 14, CourseType.SE, 7, 7));
            students.add(new Student("Thomas", "Goldson", 16,CourseType.CS, 8, 8));
            students.add(new Student("Harry", "Johnson", 18,CourseType.SE, 9, 9));
            students.add(new Student("Danny", "Roberts", 17, CourseType.SE, 8, 10));
            students.add(new Student("teff", "bobby", 14, CourseType.CSG, 8, 11));

            menu(students);//Start menu function
        }


        public static void enter() {
            System.out.println("Press enter to continue");//ask the user to press enter to continue
            Scanner scanner = new Scanner(System.in);//create a scanner object
            scanner.nextLine();//continue when the user presses enter
        }


        public static void menu(ArrayList<Student> students) {
            //print the option menu
            System.out.println("Please Select the function you want to perform: ");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Print all students");
            System.out.println("4. Print all students grouped by course type");
            System.out.println("5. Get student by id");
            System.out.println("6. Get all students by course type and sort by grade decending");
            System.out.println("7. Get all students whose name starts with a given letter");
            System.out.println("8. Get all students whose name is a given name");


            Scanner scanner = new Scanner(System.in);//create a scanner object
            int select = scanner.nextInt();//get the user input
            switch (select) {//switch the user input
                case 1: ;
                    FunctionsKt.addStudent(students);
                    menu(students);//call the menu method
                    break;

                case 2:
                    FunctionsKt.removeStudent(students);
                    menu(students);//call the menu method
                    break;

                case 3:
                    FunctionsKt.printAllStudents(students);//call the printAllStudents method from student class
                    enter();//call the enter method
                    menu(students);//call the menu method
                    break;

                case 4:
                   FunctionsKt.getStudentByCourse(students);//call the getCourseAndSortByGrade method from student class
                    enter();//call the enter method to pause the program
                    menu(students);//call the menu method
                    break;

                case 5:
                    FunctionsKt.getStudentById(students);
                    enter();//call the enter method to pause the program
                    menu(students);//call the menu method
                    break;
//

                case 6:
                    FunctionsKt.getStudentCourseAndSortByGrade(students);//call the getCourseAndSortByGrade method from student class
                    enter();//call the enter method
                    menu(students);//call the menu method
                    break;

                case 7:
                    FunctionsKt.getStudentByFirstLetter(students);//call the getStudentByFirstLetter method from student class
                    enter();//call the enter method
                    menu(students);//call the menu method
                    break;


                case 8:
                    FunctionsKt.getStudentByName(students);
                    //call the getStudentByName method from student class
                    enter();//call the enter method
                    menu(students);//call the menu method
                    break;

                default:
                    System.out.println("Invalid input");
                    menu(students);//call the menu method
                    break;

            }


        }
    }
