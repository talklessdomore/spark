package cn.linc.spark.scala

/**
  * 内嵌函数
  */

object Demo07 {

  def main(args: Array[String]): Unit = {
    niFunction("hello world")
  }



  def niFunction(a: String): Unit = {
    def hello(s:String): Unit ={
      print(s)
    }
    hello(a)
  }


}
