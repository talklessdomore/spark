package cn.linc.spark.scala

/**
  * 单例对象即：Object 修饰的与文件名称一致
  * 伴生对象：即在object还有其他class对象，可以互相访问私有属性
  */

object Demo15 {

  def main(args: Array[String]): Unit = {
    val a = new A(10, 20)
    val b = new B(30, 20, 10)
    a.move(1, 2)
    b.move(10, 20, 30)

  }


  class A(a: Int, b: Int) {
    var x: Int = a
    var y: Int = b

    def move(mx: Int, my: Int): Unit = {
      x = x + mx
      y = y + my
      println("x移动的位置：" + x)
      println("y移动的位置：" + y)
    }

    override def toString: String = "this is a test"
  }

  //重写属性
  class B(@Override ba: Int, @Override bb: Int, bc: Int) extends A(ba, bb) {
    def move(bx: Int, by: Int, bz: Int): Unit = {
      println("x继承后位置：" + bx + x)
      println("y继承后位置：" + by + y)
      println("z的位置：" + bz)
      super.toString
    }

  }


}
