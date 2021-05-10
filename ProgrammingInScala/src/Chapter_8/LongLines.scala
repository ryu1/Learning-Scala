package Chapter_8
import scala.io.Source

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/26
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */
object LongLines {
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  private def processLine(filename: String, width: Int, line: String) {
    if (line.length > width)
      println(filename + ": " + line.trim)
  }
}
