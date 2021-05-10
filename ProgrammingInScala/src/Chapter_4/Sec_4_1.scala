/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/05
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */

class ChecksumAccumulator {
  private var sum = 0

  deff add(b: Byte): Unit = {
    sum += b
  }

  def checksum(): Int = {
    return ~(sum & OxFF) + 1
  }
}

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

acc.sum = 3

println(acc.sum)

// Unitに変換される
def f(): Unit = "this String gets lost"

// 等号がないとUnitに変換される
def g() {"this String gets lost too"}

// Stringを返却する
def h() = {"this String gets returned!"}

