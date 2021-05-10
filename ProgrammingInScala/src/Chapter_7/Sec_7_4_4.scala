import java.net.MalformedURLException
import java.net.URL
/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */

// 値を生成するcatch節

def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }