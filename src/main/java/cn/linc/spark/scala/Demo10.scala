package cn.linc.spark.scala

import java.util.Date

/**
  * 函数柯里化
  */

object Demo10 {

  def main(args: Array[String]): Unit = {
    applicationFunction(new Date())("message2")

  }

  def applicationFunction(time: Date)( message: String): Unit = {
    println(time + "-------" + message)
  }


}
