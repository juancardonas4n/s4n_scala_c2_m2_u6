val sumaNC = (a:Int,b:Double) => a + b
val multNC = (a:Int,b:Double) => a * b

val sumaC:Int => Double => Double = sumaNC.curried
val multC:Int => Double => Double = multNC.curried

sumaNC(3,9.3) == sumaC(3)(9.3)
multNC(2,5.7) == multC(2)(5.7)
