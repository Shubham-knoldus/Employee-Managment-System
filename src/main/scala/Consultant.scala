class Consultant extends Employee {
  override var empID: String = _
  override var first_name: String = _
  override var last_name: String = _
  override var salary: Double = _
  override var pfix: String = _


  def consultant (EMP_ID:String,FName:String,LName:String,SalaryDetail:Double):String= {
    val prefix = "CONS"
    val EmployeeId = SetEmpID(EMP_ID,prefix)
    SetFirstName(FName)
    SetLastName(LName)
    SetSalary(SalaryDetail)

    EmployeeId

  }

}
