@main def main():Unit = print(cipher("lbmqb", 1, decrypt));

def cipher(text:String, shifts:Int, method:(String, Int) => String): String = method(text, shifts)

def encrypt(text:String, shifts:Int):String =
    text match {
        case t if t.length == 1 => (text.head.toInt + shifts).toChar.toString
        case _ => (text.head.toInt + shifts).toChar.toString + encrypt(text.tail, shifts)
    }

def decrypt(text:String, shifts:Int):String =
    text match {
        case t if t.length == 1 => (text.head.toInt - shifts).toChar.toString
        case _ => (text.head.toInt - shifts).toChar.toString + decrypt(text.tail, shifts)
    }