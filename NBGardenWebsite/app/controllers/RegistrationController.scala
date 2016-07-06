package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.mvc.{Action, Controller, Flash}

/**
  * Created by Administrator on 06/07/2016.
  */
@Singleton
class RegistrationController  @Inject() extends Controller{

  def registration = Action {
    Ok(views.html.registration())
  }

}
