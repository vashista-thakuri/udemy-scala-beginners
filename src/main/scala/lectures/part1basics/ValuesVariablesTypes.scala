package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)
  // val is immutable
  // compiler can infer types

  val aString: String = "Hello"
  println(aString)

  val aBoolean: Boolean = true
  val aCharacter: Char = 'a'
  val aShort: Short = 4613
  val aLong: Long = 24643256724L
  val aFloat: Float = 2.0345f
  val aDouble: Double = 3.1423451

  // variables
  // var is mutable
  var aVariable: Int = 23
  aVariable = 5 // changing a variable is called side effects
  print(aVariable)

}
