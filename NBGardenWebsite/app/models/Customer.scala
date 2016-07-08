package models

/**
  * Created by Administrator on 07/07/2016.
  */

case class Customer(val username:String, var email:String, var telephone:String, val name:String, var password:String){



}


object Customer {
  var customers = Set(Customer(
    "john123", "john@gmail.com", "07898000000", "John", "password"),
    Customer("joe123", "joe@gmail.com", "07898000000", "Joe", "password"),
    Customer("fred123", "fred@gmail.com", "07898000000", "Fred", "password"),
    Customer("jane123", "jane@gmail.com", "07898000000", "Jane", "password")
  )





}