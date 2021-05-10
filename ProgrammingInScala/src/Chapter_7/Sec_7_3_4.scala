import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */

val filesHere = new File(".").listFiles()

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)

grep(".*gcd.*")