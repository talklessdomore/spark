package cn.linc.spark.scala

/**
  * 指定函数参数名
  */

object Demo02 {

  def main(args: Array[String]): Unit = {
    functionName(y=7,x=6)
  }

  def functionName(x: Int, y: Int): Unit = {
    println("x:"+x)
    println("y:"+y)
  }


}
