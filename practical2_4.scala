object HelloWorld{
    def main(args:Array[String]):Unit={

    }
    def attendance(ticketprice:Int):Int={
        120+(15-ticketprice)*4
    }
    def totalcost(ticketprice1:Int):Int={
        500+3*attendance(ticketprice1)
    }
    def income(ticketprice2:Int):Int={
       ticketprice2*attendance(ticketprice2) 
    }
    def profit(ticketprice3:Int):Int={
        income(ticketprice3)-totalcost(ticketprice3)
    }
    val ticketprice4 =(5 to 100 by 1)
    val optimalprice=ticketprice4.maxBy(profit)
    println(optimalprice)
}