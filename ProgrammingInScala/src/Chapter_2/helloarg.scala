/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/04
 * Time: 17:38
 * To change this template use File | Settings | File Templates.
 */

// 第一引数にhelloと声をかけよう
//println("Hello, " + args(0) + "!")

var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}
