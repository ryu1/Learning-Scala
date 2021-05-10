import scala.io.Source

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/27
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */

def processFile(filename: String, width: Int) {
  def processLine(filename: String, width: Int, line: String) {
    if (line.length > width) {
      println(filename + ": " + line)
    }
  }
  val source = Source.fromFile(filename)
  for (line <- source.getLines()) {
    processLine(filename, width, line)
  }
}

object LongLines {
  def processFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length > width) {
        println(filename + ": " + line)
      }
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}