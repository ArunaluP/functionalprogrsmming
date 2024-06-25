object HelloWorld{
    def main(args:Array[String]):Unit={
        println("Take home salary of the employee = " + takeHomeSalary(40,30))
    }
    def normaiHoursalary(hours:Int):Int ={
        hours*250
    }
    def otHours(hours:Int):Int={
        hours*85
    }
    def totalSalary(normal:Int,ot:Int):Int={
        normaiHoursalary(normal) + otHours(ot)
    }
    def takeHomeSalary(normal:Int,ot:Int):Double={
        totalSalary(normal,ot)*88/100
    }

}