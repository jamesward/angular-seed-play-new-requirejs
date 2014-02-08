package controllers

import play.api.mvc.{RequestHeader, Call, Action, Controller}
import play.api.Logger

object Application extends Controller {
  
  def index = Action(Ok(views.html.index()))
  
}
