package cn.linc.spark.scala

/**
  * 函数传名称调用方式
  */

object Demo01 {

  def main(args: Array[String]): Unit = {
    useFunctionName(functionName(1, 3))
  }

  def functionName(x: Int, y: Int): Int = {
    println("这个是函数传名调用方式")
    return x + y
  }

  def useFunctionName(t: => Int) = {
    val s = t
    println("这个是该函数的值:" + s)
  }


}
