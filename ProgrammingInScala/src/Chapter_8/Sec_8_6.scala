/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/05/02
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */

val someNumbers = List(-11, -10, -5, 0, 5, 10)

someNumbers.foreach(println(_))

someNumbers.foreach(x => println(x))

def sum(a: Int, b: Int, c: Int) = a + b + c

sum(1, 2, 3)

val a = sum _

a(1, 2, 3)

a.apply(1, 2, 3)

val b = sum(1, _: Int, 3)

b(2)

b(5)

someNumbers.foreach(println_)

someNumbers.foreach(println)