package cn.linc.spark.scala


/**
  * 闭包:在函数体内引用了外部变量
  */

object Demo11 {

  def main(args: Array[String]): Unit = {
    applicationFunction("message2")
  }

  var s = "hello"
  def applicationFunction(message: String): Unit = {
    println("-------" + message + "-----" + s)
  }


}
