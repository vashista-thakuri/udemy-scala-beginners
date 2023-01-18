package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Vashista",3))
  // When you need loops, use recursion

  // Always try to specify a return type

  def aFunctionWithSideEffects (aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
  println(aBigFunction(5))

  // Write a greeting function (name, age) => "Hi, my name is Vashista and I am 26 years old"
  def greetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greetingFunction("Vashista",26))

  // Write a Factorial Function 1 * 2 * 3 * .. * n
  def factorialFunction(n: Int): Int = {
    if (n!=0) n*factorialFunction(n-1)
    else 1
  }
  println(factorialFunction(5))

  // Write a fibonacci function
  // f(1) = 1
  // f(2) = 2
  // f(n) = f(n-1) + f(n-2)
  def fibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else fibonacciFunction(n-1) + fibonacciFunction(n-2)

    // 1 1 2 3 5
  }
  println(fibonacciFunction(8))

  // Write a function to test if number is prime
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrime(17))
  println(isPrime(6))

}
