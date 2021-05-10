import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */


val fileHere = new File(".").listFiles()

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for (
    file <- fileHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(file + ": " + line.trim)

grep(".*gcd.*")