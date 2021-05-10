import java.io.{FileNotFoundException, FileReader}

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 18:35
 * To change this template use File | Settings | File Templates.
 */

try {
  val f = new FileReader("input.txt")
  // ファイルを使ってからクローズする
} catch {
  case ex: FileNotFoundException => // ファイルなしエラーを処理
  case ex: IOException => // その他のI/Oエラーを処理
}