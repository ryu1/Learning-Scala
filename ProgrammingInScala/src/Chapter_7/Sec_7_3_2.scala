import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */

val filesHere = (new File(".")).listFiles()
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

for (file <- filesHere)
  if (file.getName.endsWith(".scala"))
    println(file)

// for式で複数のフィルターを使う
for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)