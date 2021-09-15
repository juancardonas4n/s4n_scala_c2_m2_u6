
def mPr(b:Boolean,accion:Unit)     = if (b) accion else ()

def mPn(b:Boolean,accion: => Unit) = if (b) accion else ()

def unaAccion():Unit = println("Ocurrior")
