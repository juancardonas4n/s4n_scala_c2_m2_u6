class PasoPorRef1(var a:Int)

class PasoPorRef2(val b:Int)

def mPpr1(ppr1:PasoPorRef1, nuevo:Int):Int = {
  ppr1.a = ppr1.a + nuevo
  ppr1.a
}

def mPpr2(ppr2:PasoPorRef2, nuevo:Int):Int = { 
  ppr2.b = ppr2.b + nuevo
  ppr2.b
}

var unPpr1 = new PasoPorRef1(10)
val unPpr2 = new PasoPorRef2(20)
