




  // function to get student by id
    fun getStudentById(StudentList: ArrayList<Student>) {
        println("Enter the student ID of the student you wish to find")
        val studentId = readLine()!!.toInt()
        StudentList.forEach { if (it.studentId == studentId) println(it) }

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

    // function to get student by age
    fun getStudentByAge(StudentList: ArrayList<Student>) {
        println("Enter the age of the student you wish to find")
        val age = readLine()!!.toInt()
        StudentList.filter { it.age == age  }
            .forEach { println(it) }

    }


    //function to add a student
    fun addStudent(StudentList: ArrayList<Student>) {
        println("Enter the first name of the student you wish to add")
        val firstName = readLine()!!
        println("Enter the surname of the student you wish to add")
        val surname = readLine()!!
        println("Enter the age of the student you wish to add")
        val age = readLine()!!.toInt()
        println("Enter the course of the student you wish to add")
        val course = readLine()!!
        println("Enter the grade of the student you wish to add")
        val grade = readLine()!!.toInt()
        println("Enter the student ID of the student you wish to add")
        val studentId = StudentList.size + 1
        StudentList.add(Student(firstName, surname, age, CourseType.valueOf(course), grade, studentId))

    }


    fun printAllStudents(StudentList: ArrayList<Student>) {
        StudentList.forEach { println(it) }

    }


//function to remove student by id
    fun removeStudent(StudentList: ArrayList<Student>) {
        println("Enter the student ID of the student you wish to remove")
        val studentId = readLine()!!.toInt()
        StudentList.removeIf { it.studentId == studentId }

    }

//function that gets student course and sorts by grade
    fun getStudentCourseAndSortByGrade(StudentList: ArrayList<Student>) {
        println("Enter the course of the student you wish to find")
        val course = readLine()!!
        StudentList.filter { it.courseType == CourseType.valueOf(course) }
            .sortedBy { it.grade }
            .forEach { println(it) }

    }









