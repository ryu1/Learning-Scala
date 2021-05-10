import java.io.{InputStreamReader, BufferedReader}

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/26
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 */

var i = 0
var foundIt = false
while(i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}

def searchFrom(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchFrom(i + 1)
i = searchFrom(0)

val in = new BufferedReader(new InputStreamReader(System.in))

import scala.util.control.Breaks._

breakable {
  while (true) {
    println("?")
    if (in.readLine() == "") break
  }
}
