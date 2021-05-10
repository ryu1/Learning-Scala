import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/23
 * Time: 18:04
 * To change this template use File | Settings | File Templates.
 */

val filesHere = (new File(".")).listFiles()

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length