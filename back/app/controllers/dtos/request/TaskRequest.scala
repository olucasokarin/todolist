package controllers.dtos.request

import play.api.libs.json.{Json, Reads}

case class TaskRequest(title: String, description: String, done: Boolean = false)

object TaskRequest {
  implicit val writes: Reads[TaskRequest] = Json.reads[TaskRequest]
}