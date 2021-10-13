import org.scalatest.flatspec.AnyFlatSpec

class SrManager_Test extends AnyFlatSpec with Employee {
  override var empID: String = _
  override var first_name: String = _
  override var last_name: String = _
  override var salary: Double = _
  override var pfix: String = _

  val sr_manager = new SrManager

  "SeniorManager" should "give" in {

    val Detail_SrMa = sr_manager.srManager("001","Shubham","Shrivastava",20000)

    assert(Detail_SrMa == "SRMA001")
  }
}
