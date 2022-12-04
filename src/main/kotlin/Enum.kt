fun main(args: Array<String>) {
    println(Department.HR.getDepartmentInfo())
}

enum class Department(val fullName: String, val numberOfEmployees: Int) {
    HR("Human Resources", 20), SALES("Sales", 40);

    fun getDepartmentInfo() = "$fullName -- $numberOfEmployees"
}
