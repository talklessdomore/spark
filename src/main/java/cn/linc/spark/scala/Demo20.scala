package cn.linc.spark.scala

import java.io.FileReader

/**
  * 提取器
  */

object Demo20 {

  def main(args: Array[String]): Unit = {
    println(creator(1,2))
    println(getObject())
  }

  //定义一个对象用于构造
  def creator (a:Int,b:Int):Int ={
    a+b
  }
  //定义一个对象用于获取
  def getObject ():String ={
    "hello world"
  }


}
