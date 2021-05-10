/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/05
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */

// 命令形のスタイル
def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

// 関数型のスタイル
def printArgs(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

def printArgs(args: Array[String]): Unit = {
  args.foreach(println)
}

// 副作用もvarもない関数
def formatArgs(args: Array[String]) = args.mkStringt("\n")
println(formatArgs(args))

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")
