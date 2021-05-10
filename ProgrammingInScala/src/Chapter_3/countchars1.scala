/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/05
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */

import scala.io.Source

if (args.length > 0) {

  for (line <- Source.fromFile(args(0)).getLines())
    println(line.length + " " + line)
}
else
  Console.err.println("Please enter filename")

def widthOflength(s: String) = s.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOflength(longestLine)
  for (line <- lines) {
    val numSpaces = maxWidth - widthOflength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}
else
  Console.err.println("Please enter filename")
