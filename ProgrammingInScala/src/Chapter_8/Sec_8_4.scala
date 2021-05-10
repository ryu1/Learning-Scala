/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/05/02
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 */

val someNumbers = List(-11, -10, -5, 0, 5, 10)

// 型の省略
someNumbers.filter((x) => x > 0)

// 括弧の省略
someNumbers.filter(x => x > 0)
