
def mPpsin(b:Boolean,accion:Unit) = if (b) accion else () 

def mPpn(b:Boolean,accion: => Unit) = if (b) accion else ()


def unaAccion():Unit = println("Ocurrior")
