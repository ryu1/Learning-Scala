/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/04
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */

// リストの作成・初期化
//val oneTwoThree = List(1, 2, 3)

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

// cons演算子をつかうと既存のリストの先頭に新しい要素を追加して得られるリストを返す。
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)


