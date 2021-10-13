import org.scalatest.flatspec.AnyFlatSpec

class President_Test extends AnyFlatSpec with Employee {
  override var empID: String = _
  override var first_name: String = _
  override var last_name: String = _
  override var salary: Double = _
  override var pfix: String = _

  val Test_Presedent = new President

  "TestPresedent" should "give" in {

    val Detail_Pres = Test_Presedent.president("004", "Shubham", "Shrivastava", 20000)

    assert(Detail_Pres == "POTC004")
  }
}


