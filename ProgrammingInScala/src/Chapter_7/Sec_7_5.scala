/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/04/26
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */

val firstArg = if (args.length > 0) args(0) else ""

firstArg match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")
}

val friend =
  firstArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
println(friend)