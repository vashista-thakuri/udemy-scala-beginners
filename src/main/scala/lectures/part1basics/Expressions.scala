package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // Expression used to evaluate
  println(x)

  println(2 + 3 * 4)
  // Math operators are : + - * / & | ^ << >> >>>

  println(1==x)
  // == != < > <= >=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions(DO) vs Expressions(VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3) // If Can be evaluated like this
  println(1 + 3)

  var i = 0
  val aWhile = while (i<10){
    println(i)
    i += 1
  }

  // Never write while loops in scala

  // Everything in scala is an expression

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "Hello" else "Goodbye"
  }

  // val anotherValue = z + 1
  // Here 'z' does not fall under the scope

  // 1. Difference between "hello world" vs println("hello world")?

}
