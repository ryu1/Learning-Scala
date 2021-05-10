/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/04
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */
args.foreach(arg => println(arg))

// 引数の型を明示的に指定する場合
// カッコで囲まないといけない
args.foreach((arg: String) => println(arg))

// 関数リテラルが一個の引数をとる一文から構成される場合は、率い数を明示的にしてしなくて済む
args.foreach(println)
