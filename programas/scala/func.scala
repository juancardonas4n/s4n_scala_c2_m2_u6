
def getInt = util.Random.nextInt(10)

def funcValor(a: Int) = {
  println("a: " + a)
  a
}

def funcNombre(a: => Int) = {
  println("a: " + a)
  a
}

println(funcValor(getInt))

println(funcNombre(getInt))

def cincoNombre(a: => Int):List[Int] = List(a,a,a,a,a)

def cincoLazy(a: => Int) = { val b = a; List(b,b,b,b,b) }

println(cincoNombre(getInt))
println(cincoLazy(getInt))

