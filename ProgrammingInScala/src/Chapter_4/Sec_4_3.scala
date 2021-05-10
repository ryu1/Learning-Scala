/**
 * 4.2 シングルトンオブジェクト
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/07
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 */

import scala.collection.mutable.Map
object ChecksumAccumlator {

  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumlator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}
