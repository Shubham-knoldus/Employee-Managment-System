import org.scalatest.flatspec.AnyFlatSpec

class Manager_Test extends AnyFlatSpec with Employee {
  override var empID: String = _
  override var first_name: String = _
  override var last_name: String = _
  override var salary: Double = _
  override var pfix: String = _

  val manager = new Manager

  "TestManager" should "give" in{

    val Detail_Mana = manager.manager("003","Shubham","Shrivastava",20000)
    assert(Detail_Mana == "MANA003")
  }

}
