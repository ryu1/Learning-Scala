/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */

var filename = "default.txt"
if (!args.isEmpty)
  filename = args(0)

// Scalaの条件式による初期化イディオム
var filename1 = if (!args.isEmpty) args(0)
  else "default.txt"

println(if (!args.isEmpty) args(0) else "default.txt")