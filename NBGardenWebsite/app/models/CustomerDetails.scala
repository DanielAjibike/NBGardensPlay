package models

import play.api.data.Forms._
import play.api.data._

/**
  * Created by Administrator on 06/07/2016.
  */
case class CustomerDetails(firstName: String, lastName: String, email: String, telephone: Int, username: String, password: String) {

  val userForm = Form(
    mapping(
      "name" -> text,
      "lastName" -> text,
      "email" -> text,
      "telephone" -> number,
      "username" -> text,
      "password" -> text
    )(CustomerDetails.apply)(CustomerDetails.unapply)
  )


}