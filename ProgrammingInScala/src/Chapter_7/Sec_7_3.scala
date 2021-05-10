import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 */

// for式でディレクトリ内のファイルリストを表示する
val filesHere = (new File(".")).listFiles()
for (file <- filesHere)
  println(file)

for (i <- 1 to 4)
  println("Iteration " + i)

// 4を外す
for (i <- 1 until 4)
  println("Iteration " + i)