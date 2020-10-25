package cn.linc.spark.scala

import java.util.Date

/**
  * 偏应用函数
  */

object Demo09 {

  def main(args: Array[String]): Unit = {
    val boundTime = applicationFunction(new Date(),_:String)
    boundTime("message1")
    boundTime("message2")
  }

  def applicationFunction(time: Date, message: String): Unit = {
    println(time + "-------" + message)
  }


}
