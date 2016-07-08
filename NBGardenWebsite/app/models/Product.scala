package models

/**
  * Created by Administrator on 08/07/2016.
  */
case class Product(Name: String, description: String)

object Product {
  var customers = Set(CustomerDetails("Nick", "Noob", "MrNoob@everywhere.com", 999, "bigNoob", "mrPassword"))

  def add(customer : CustomerDetails): Unit ={
    customers = customers + customer
  }
}