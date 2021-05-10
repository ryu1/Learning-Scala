/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/05/02
 * Time: 16:57
 * To change this template use File | Settings | File Templates.
 */

// 連続パラメータ
def echo(args: String*) =
  for (arg <- args) println(arg)

echo()

echo("one")

echo("hello", "world!")

val arr = Array("What's", "up", "doc?")

// echo(arr) // コンパイルエラー

echo(arr: _*)

// 名前付き引数
def speed(distance: Float, time: Float): Float =
  distance / time

speed(100, 10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)

// パラメーターのデフォルト値
def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time" + System.currentTimeMillis())

def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) =
  out.print("time = " + System.currentTimeMillis() / divisor)

printTime2()
printTime2(out = Console.err)
printTime2(divisor = 1000)

// 末尾再帰
def approximate(guess: Double) =
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))


