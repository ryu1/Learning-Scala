/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while(line != "")