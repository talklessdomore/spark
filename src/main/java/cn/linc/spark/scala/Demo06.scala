package cn.linc.spark.scala

/**
  * 高阶函数
  */

object Demo06 {

  def main(args: Array[String]): Unit = {
    println(useFunction(hiFunction,3))
  }

  def useFunction(f: Int =>String,b:Int) = f(b)

  def hiFunction(a: Int): String = {
    return "[" + a.toString + "]"
  }


}
