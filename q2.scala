@main def main():Unit = numberType(scala.io.StdIn.readInt())

def numberType(num: Int): Unit = num match{
    case n if n%3 == 0 && n%5 == 0 => println("Multiple of Both Three and Five")
    case n if n%3 == 0 => println("Multiple of Three")
    case n if n%5 == 0 => println("Multiple of Five")
    case _ => println("Not a Multiple of Three or Five")
}