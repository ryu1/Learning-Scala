/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/26
 * Time: 18:40
 * To change this template use File | Settings | File Templates.
 */

def printMultiTable() {
  var i = 1
  // ここではiだけがスコープに入っている
  while (i <= 10){
    var j = 1
    // ここではiとjがスコープに入っている
    while (j <= 10) {
      val prod = (i * j).toString
      // ここではi,j,prodがスコープに入っている
      var k = prod.length
      // ここではi,j,prod,kがスコープに入っている
      while (k < 4) {
        print(" ")
        k += 1
      }
      print(prod)
      j += 1
   }
    // iとjはまだスコープに入っている。prodとkはスコープから外れている
    println()
    i += 1
  }
  // iはまだスコープに入っている。j,prod,kはスコープから外れている
}

val a = 1;
{
  // 内側でaが定義されると、外側のaは見えなくなる（シャドウイング）される
  val a = 2 // 問題なくコンパイルができる
  println(a)
}
println(a)

val b = 1;
{
  // 内側でbが定義されていない場合は、外側のbが見える
  println(b)
}