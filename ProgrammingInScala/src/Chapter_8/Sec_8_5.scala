/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/05/02
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.filter(_ > 0)

someNumbers.filter(x => x > 0)

val f = (_: Int) + (_: Int)

f(5, 10)
