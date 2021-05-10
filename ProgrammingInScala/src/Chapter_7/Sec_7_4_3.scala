import java.io.FileReader

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 18:51
 * To change this template use File | Settings | File Templates.
 */

val file = new FileReader("input.txt")

try {
  // ファイルを使う

} finally {
  file.close()  // 確実にファイルをクローズする
}