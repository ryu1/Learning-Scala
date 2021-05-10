package Chapter_8

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/27
 * Time: 0:12
 * To change this template use File | Settings | File Templates.
 */
object FindLongLines {
  def main(args: Array[String]) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}
