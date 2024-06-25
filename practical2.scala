object HelloWorld{
    def main(args: Array[String]):Unit ={
        println("Arunalu")
        //println(maximum(1,2))
        var i=2
        var j=2
        var k = 2
        var m=5
        var n=5
        var f = 12.0f
        var g=4.0f
        var c ='X'
        println(sumdouble(f,g))
        println("01.a)"+sum(k,multiplication(12,m)))
        println("01.b)"+devide(m,j))
        println("01.c)"+modulus(n,j))
        println("01.d)"+devide(multiplication(m,j),j))
        println("01.e)"+sumdouble(intdoublesum(multiplication(10,5),f),g))
        println("01.f)"+multiplication(increment(i),n))
        var a=2
        var b = 3
        var c2=4
        var d=5
        var k2 = 4.3f
        println("02.a)"+sum(multiplication(decrement(b),a),multiplication(c2,d)))
        b=decrement(b)
        d=decrement(d)
        println("02.b)"+a)
        a=increment(a)
        println("02.c)"+intdoublesum(c2,mulintdouble(-2,sub(g,k2))))
        println("02.d) c ="+c2)
        c2=increment(c2)
        println("02.e) c = "+mulintdouble(increment(c2),a))
        c2=increment(c2)
        a=increment(a)


    }
    def intdoublesum(a:Int,b:Double):Double={
        a+b
    }
    def sum(a:Int,b:Int):Int={
        a+b
    }
    def sumdouble(a:Double,b:Double):Double={
        a+b
    }
    def devide(a:Int , b:Int):Double ={
        a/b
    }
    def multiplication(a:Int,b:Int):Int={
        a*b
    }
    def modulus(a:Int ,b:Int):Int ={
        a%b
    }
    def increment(a:Int):Int={
        a+1
    }
    def decrement(a:Int):Int = {
        a-1
    }
    def sub(a:Double,b:Double):Double={
        a-b
    }
    def mulintdouble(a:Int,b:Double):Double ={
        a*b
    }
   
}