class PasoRefMt(var a:Int)

class PasoRefIm(val b:Int)

def mMt(prmt:PasoRefMt, nuevo:Int):Int = {
  prmt.a = prmt.a + nuevo
  prmt.a
}

def mIm(prim:PasoRefIm, nuevo:Int):Int = prim.b + nuevo

var mt = new PasoRefMt(10)
val im = new PasoRefIm(20)
