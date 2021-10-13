import org.scalatest.flatspec.AnyFlatSpec


class Attandance_Test extends AnyFlatSpec with Employee {
  override var empID: String = _
  override var first_name: String = _
  override var last_name: String = _
  override var salary: Double = _
  override var pfix: String = _

  val attandance_detail = new Attandance()
  attandance_detail.attandance_Detail("Shubham Shrivastava",9.45,6.45)
  "Attandance" should "give" in {

    val temp =  attandance_detail.attandance_Detail("Shubham Shrivastava",9.45,6.45)

    assert(temp == "Name : Shubham Shrivastava , Start Time : 9.45 , End Time : 6.45")

  }
  attandance_detail.attandance_Detail("Shubham Shrivastava")
  "Attandance1" should "give" in {
    val temp =  attandance_detail.attandance_Detail("Shubham Shrivastava")

    assert(temp == "Name : Shubham Shrivastava")

  }
}
