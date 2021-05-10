/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/02
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */

//1 + 2;
//res0 * 3;

println("Hello world!")

// 関数の基本形
def max(x: Int, y: Int): Int = {
  if (x > y)
    x
  else
    y
}

// 結果型は推論してくれる。
// ワンラインの場合は中括弧を省略できる。
def max2(x: Int, y: Int) = if (x > y) x else y

println(max(3, 5))