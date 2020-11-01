package cn.linc.spark.scala

/**
  * 模式匹配
  */

object Demo17 {

  def main(args: Array[String]): Unit = {
    println(matchString(1))
    println(matchString(2))
  }

  def matchString(i:Int):String = i match {
    case 1 => "hello"
    case 2 => "world"
  }



}
