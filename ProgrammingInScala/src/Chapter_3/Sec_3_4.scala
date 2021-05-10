/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/05
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */

// イミュータブルな集合の作成・初期化・操作
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

// ミュータブルな集合の作成・初期化・操作
import scala.collection.mutable.Set
val movieSet = Set("Hitch", "Poltergeist")
movieSet += "Shrek"
// 以下のように書いても良い
//movieSet.+=("Shrek")
println(movieSet)

import scala.collection.immutable.HashSet
val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

import scala.collection.mutable.Map
val treasureMap = Map[Int, String]()
// ->メソッドは、タプルを返す。
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

// import文がない場合は、デフォルトのscala.colleciton.imuutable.Mapが作成される。
val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4))
