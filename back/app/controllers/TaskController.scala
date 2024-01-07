package controllers

import controllers.dtos.request.TaskRequest
import play.api.libs.json.{JsPath, Json, JsonValidationError}
import play.api.mvc._
import services.TaskService

import javax.inject._

@Singleton
class TaskController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {


  def tasks: Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("chegou controller")
    val service = new TaskService()

    println(service)

    val values = service.tasks()
    val response = Json.toJson(values)
    Ok(response)
  }

  def createTask: Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val service = new TaskService()
    request.body.asJson.get.validate[TaskRequest].fold(
      (invalid: collection.Seq[(JsPath, collection.Seq[JsonValidationError])]) => {
        BadRequest(invalid.toString())
      },
      valid => {
        service.createTask(valid)
        Created
      }

    )

  }

}
