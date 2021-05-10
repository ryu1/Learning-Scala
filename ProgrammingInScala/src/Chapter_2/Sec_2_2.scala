/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/04
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 */

// valはfinal変数と似ていて初期化後に別の値を代入することができない。
// 型推論Stringと推論される。
val msg = "Hello, world"

// 型名を指定する
val msg2: java.lang.String = "Hello again, world!"

// java.lang型は、単純名で参照できる
val msg3: String = "Hello again , world!"

// 別の値を代入し直すことができない
msg = "Goodbye cruel world!"

// 代入し直せるようにしたい場合はvarを使う必要がある
var greeting = "Hello, world!"
greeting = "Leave me alone, world!"

// 複数またがるものを入力したい場合
//val multiLine =
//  | "This is the next line."

