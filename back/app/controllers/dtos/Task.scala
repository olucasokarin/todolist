package controllers.dtos

import play.api.libs.json._

case class Task(id: Int, title: String, done: Boolean, description: String, createdAt: String, updatedAt: String)

object Task {
  implicit val writes: Writes[Task] = Json.writes[Task]
}