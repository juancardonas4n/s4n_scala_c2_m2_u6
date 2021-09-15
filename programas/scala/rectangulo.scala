
val x = (a:Int) => (b:Double) => a + b

def f(x:Int => Double => Double):Double => Int => Double = (w:Double) => (y:Int) => x(y)(w)

// val y = f(x)
