import java.math.BigInteger

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/04
 * Time: 18:24
 * To change this template use File | Settings | File Templates.
 */

val big = new BigInteger("12345")

// greetStringsは、Array[String](「文字列の配列」)型の値になる。
val greetStrings = new Array[String](3)
// greetStringの型はArray[String]であって、Array[String](3)ではない
//val greetStrings: Array[String] = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings.update(0, "Hello")
greetStrings(1) = ", "
greetStrings.update(1, ", ")
greetStrings(2) = "world!\n"
greetStrings.update(2, "world!\n")
for (i <- 0 to 2)
  print(greetStrings(i))
  print(greetStrings.apply(i))

// 以下のコードは
greetStrings(0) = "Hello"
// 以下のようにメソッド呼び出しに変換される
greetStrings.update(0, "Hello")

// 簡潔に配列を作成・初期化する方法
val numNames = Array("zero", "one", "two")

// 下記と同じ
//val numNames = Array.apply("zero", "one", "two")
