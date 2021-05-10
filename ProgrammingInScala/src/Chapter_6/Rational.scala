package Chapter_6

/**
 * 有理数(rational number)
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 2014/01/19
 * Time: 19:06
 * To change this template use File | Settings | File Templates.
 */
class Rational(n: Int, d: Int) {
  // クラス本体に書かれた（フィールド/メソッド定義部以外の）任意のコードを、基本コンストラクタにコンパイルする
  println("Created " + n + "/" + d)
  // 事前条件チェック
  // trueでない場合、IllegalArgumentExceptionがスローされる。
  require(d != 0)

  /** 以下、フィールド **/
  // 非公開なフィールド
  private val g = gcd(n.abs, d.abs)

  // 分子(numerator)
  val numer = n / g

  // 分母(denominator)
  val denom = d / g

  // 補助コンストラクタ
  def this(n: Int) =
    // 最初の処理として、同じクラスの他のコンストラクタを呼びださなくてはならない。
    this(n, 1)

  /**
   * 加算
   * @param that
   * @return
   */
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  /**
   * 加算
   * @param i
   * @return
   */
  def + (i: Int): Rational =
    new Rational(
      numer + i * denom, denom
    )

  /**
   * 減算
   * @param that
   * @return
   */
  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  /**
   * 減算
   * @param i
   * @return
   */
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  /**
   * 乗算
   * @param that
   * @return
   */
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  /**
   * 乗算
   * @param i
   * @return
   */
  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  /**
   * 除算
   * @param that
   * @return
   */
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  /**
   * 除算
   * @param i
   * @return
   */
  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  def lessThan (that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max (that: Rational) =
    if (this.lessThan(that)) that else this

  // java.lang.Objectクラスで定義されたtoStringをoverrideする。
  override def toString = numer + "/" + denom

  // 非公開なフィールド
  // 最大公約数(greatest common divisor)
  private def gcd (a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
