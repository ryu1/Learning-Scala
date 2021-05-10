/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/04
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */

// 関数の型パラメタについては型推論を行わない
def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

// 結果型を明示しない
def max2(x: Int, y: Int) = if (x > y) x else y

println(max(3, 5))

// パラメタを取らず、意味のある結果も返さない関数の定義
// 結果型は、Unitといい、意味のある値を返してこないことを示す
def greet() = println("Hello, world!")

