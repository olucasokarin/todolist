package services

import controllers.dtos.Task
import controllers.dtos.request.TaskRequest
import model.Tables.TASK
import org.jooq.DSLContext
import share.Connection

import scala.jdk.CollectionConverters.ListHasAsScala

class TaskService {

  val connection: DSLContext = Connection.connection()

  def tasks(): List[Task] = {
    println("chegou aqui??")

    val records = connection.select().from(TASK).fetch()
    records.into(classOf[Task]).asScala.toList
  }

  def createTask(task: TaskRequest): Unit = {
    connection.insertInto(TASK)
      .columns(TASK.TITLE, TASK.DONE, TASK.DESCRIPTION)
      .values(task.title, task.done, task.description)
      .execute()
  }
}
