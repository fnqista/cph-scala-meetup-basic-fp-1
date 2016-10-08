package cph.meetup.datastructures

object Collections extends App {

  def sum(xs: List[Int]): Int = ???


}

// orders of all customers
case class Customer(name: String, orders: List[Order])
case class Order(product: String, categories: List[Category])
case class Category(name: String)

object Traverse extends App {

  val customers = List(Customer("John", List(Order("iPhone", Category("Phone") :: Category("Electronics") :: Nil), Order("Ps4", Category("Consoles") :: Category("Electronics") :: Nil))),
    Customer("Julia", List(Order("Samsung s6", Category("Phone") :: Category("Electronics") :: Nil))))

  // print all categories ordered
  Console println customers.flatMap(_.orders).flatMap(_.categories).map(_.name)

  // apply for-comprehension, it is equivalent to code above
  Console println (
    for {
      c <- customers
      o <- c.orders
      cat <- o.categories
    } yield cat.name
  )
}


