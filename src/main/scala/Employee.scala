trait Employee {
  var empID:String
  var first_name: String
  var last_name: String
  var salary: Double
  var pfix:String


  def SetEmpID(EmpID:String,Prefix:String): String={
    this.empID = Prefix+EmpID
    empID
  }

  def SetFirstName(FirstName:String): Unit={
    this.first_name = FirstName
  }

  def SetLastName(LastName:String): Unit = {
    this.last_name = LastName
  }

  def SetSalary(Salary:Double): Unit = {
    this.salary = Salary
  }

  def EmployeeDetails(): Unit = {
    println("Employee ID : " + empID + " Name : " + first_name + last_name )
  }

  def GetEmployeeID:String={
    empID
  }

  def GetFirstName:String={
    first_name
  }

  def GetLastName:String = {
    last_name
  }

  def GetSalary:Double={
    salary
  }

}
