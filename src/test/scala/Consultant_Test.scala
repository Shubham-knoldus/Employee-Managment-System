import org.scalatest.flatspec.AnyFlatSpec

class Consultant_Test extends AnyFlatSpec with Employee {
  override var empID: String = _
  override var first_name: String = _
  override var last_name: String = _
  override var salary: Double = _
  override var pfix: String = _

  val Test_consultant = new Consultant

  "TestConsultant" should "give" in {

    val Detail_Cons = Test_consultant.consultant("002","Shubham","Shrivastava",20000)

    assert(Detail_Cons == "CONS002")

  }



}
