import java.util.function.Predicate


// function to get student by id
    fun getStudentById(StudentList: ArrayList<Student>) {
        println("Enter the student ID of the student you wish to find")
        val studentId = readLine()!!
            StudentList.forEach { if (it.studentId == studentId.toInt()) println(it) }
    }


   // function that sorts students based on their grade
    fun sortStudentsByGrade(StudentList: ArrayList<Student>) {
        StudentList.sortedBy { it.grade }
            .forEach { println(it) }

    }






    // function to get student by first letter of first name
    fun getStudentByFirstLetter(StudentList: ArrayList<Student>) {
        println("Enter the first letter of the first name of the student you wish to find")
        val firstLetter = readLine()!!
        StudentList.filter { it.firstName.startsWith(firstLetter) }
            .forEach { println(it) }

    }


    // function to get student by name
    fun getStudentByName(StudentList: ArrayList<Student>) {
        println("Enter the first name of the student you wish to find")
        val firstName = readLine()!!
        StudentList.filter { it.firstName == firstName  }
            .forEach { println(it) }

    }


  // function to get student by course
    fun getStudentByCourse(StudentList: ArrayList<Student>) {
        println("Enter the course of the student you wish to find")
        val course = readLine()!!
        StudentList.filter { it.courseType == CourseType.valueOf(course)  }
            .forEach { println(it) }
    }


// print students grouped by course
    fun printStudentsGroupedByCourse(StudentList: ArrayList<Student>) {
        StudentList.groupBy { it.courseType }
            .forEach { println(it) }
    }

    // function to get student by age
    fun getStudentByAge(StudentList: ArrayList<Student>) {
        println("Enter the age of the student you wish to find")
        val age = readLine()!!.toInt()
        StudentList.filter { it.age == age  }
            .forEach { println(it) }

    }


    //function to add a student
    fun addStudent(StudentList: ArrayList<Student>) {
        val firstName = getUserInput("Enter the first name of the student you wish to add", isString)
        val surname = getUserInput("Enter the surname of the student you wish to add", isString)
        val age = getUserInput("Enter the age of the student you wish to add", isInt).toInt()
        val course = getUserInput("Enter the course of the student you wish to add", isCourseType)
        val grade = getUserInput("Enter the grade of the student you wish to add", isInt).toInt()
        val studentId = StudentList.size + 1
        StudentList.add(Student(firstName, surname, age, CourseType.valueOf(course), grade, studentId))
    }


//function to get user input with parameters string prompt and predicate function to check if input is valid
    fun getUserInput(prompt: String, predicate: Predicate<String>): String {
        println(prompt)
        val input = readLine()!!
        return if (predicate.test(input)) {
            input
        } else {
            println("Invalid input")
            getUserInput(prompt, predicate)
        }
    }

    val isString: Predicate<String> = Predicate { input -> doesNotContainDigit(input) }
    val isInt: Predicate<String> = Predicate { input -> !doesNotContainDigit(input) }
    val isCourseType: Predicate<String> = Predicate { input -> isCourseTypeValid(input) }


    fun printAllStudents(StudentList: ArrayList<Student>) {
        StudentList.forEach { println(it) }
    }


//function to remove student by id
    fun removeStudent(StudentList: ArrayList<Student>) {
        println("Enter the student ID of the student you wish to remove")
        val studentId = readLine()!!
        if (!doesNotContainDigit(studentId)) {
            StudentList.removeIf { it.studentId == studentId.toInt() }
        } else {
            println("Invalid input")
            removeStudent(StudentList)
        }
    }


//remove student with no checks
    fun removeAStudent(StudentList: ArrayList<Student>) {
        println("Enter the student ID of the student you wish to remove")
        val input = readln()
        StudentList.removeIf { it.studentId == input.toInt() }
    }





//function that gets student course and sorts by grade
    fun getStudentCourseAndSortByGradeAsc(StudentList: ArrayList<Student>) {
        println("Enter the course of the student you wish to find")
        val course = readLine()!!
            StudentList.filter { it.courseType == CourseType.valueOf(course) }
                .sortedBy { it.grade }
                .forEach { println(it) }
    }

//function that gets student course and sorts by grade descending
    fun getStudentCourseAndSortByGrade(StudentList: ArrayList<Student>) {
        println("Enter the course of the student you wish to find")
        val course = readLine()!!
        StudentList.filter { it.courseType == CourseType.valueOf(course) }
            .sortedByDescending { it.grade }
            .forEach { println(it) }
    }



  fun isCourseTypeValid(courseType: String): Boolean {
      return try {
          CourseType.valueOf(courseType)
          true
      } catch (e: IllegalArgumentException) {
          false }
  }


//function to check user input contains only letters
 fun doesNotContainDigit(input: String): Boolean {
    return !input.matches(".*\\d.*".toRegex())
}




