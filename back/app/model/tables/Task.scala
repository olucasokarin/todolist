/*
 * This file is generated by jOOQ.
 */
package model.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.time.LocalDateTime
import java.util.Collection

import model.Keys
import model.Public
import model.tables.records.TaskRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object Task {

  /**
   * The reference instance of <code>public.task</code>
   */
  val TASK = new Task
}

/**
 * This class is generated by jOOQ.
 */
class Task(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, TaskRecord],
  parentPath: InverseForeignKey[_ <: Record, TaskRecord],
  aliased: Table[TaskRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[TaskRecord](
  alias,
  Public.PUBLIC,
  path,
  childPath,
  parentPath,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.table,
  where
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[TaskRecord] = classOf[TaskRecord]

  /**
   * The column <code>public.task.id</code>.
   */
  val ID: TableField[TaskRecord, Integer] = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), "")

  /**
   * The column <code>public.task.title</code>.
   */
  val TITLE: TableField[TaskRecord, String] = createField(DSL.name("title"), SQLDataType.VARCHAR(255), "")

  /**
   * The column <code>public.task.done</code>.
   */
  val DONE: TableField[TaskRecord, Boolean] = createField(DSL.name("done"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), "")

  /**
   * The column <code>public.task.description</code>.
   */
  val DESCRIPTION: TableField[TaskRecord, String] = createField(DSL.name("description"), SQLDataType.VARCHAR(255), "")

  /**
   * The column <code>public.task.created_at</code>.
   */
  val CREATED_AT: TableField[TaskRecord, LocalDateTime] = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  /**
   * The column <code>public.task.updated_at</code>.
   */
  val UPDATED_AT: TableField[TaskRecord, LocalDateTime] = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  private def this(alias: Name, aliased: Table[TaskRecord]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[TaskRecord], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.task</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), model.tables.Task.TASK)

  /**
   * Create an aliased <code>public.task</code> table reference
   */
  def this(alias: Name) = this(alias, model.tables.Task.TASK)

  /**
   * Create a <code>public.task</code> table reference
   */
  def this() = this(DSL.name("task"), null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC

  override def getIdentity: Identity[TaskRecord, Integer] = super.getIdentity.asInstanceOf[ Identity[TaskRecord, Integer] ]

  override def getPrimaryKey: UniqueKey[TaskRecord] = Keys.TASK_PKEY
  override def as(alias: String): Task = new Task(DSL.name(alias), this)
  override def as(alias: Name): Task = new Task(alias, this)
  override def as(alias: Table[_]): Task = new Task(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Task = new Task(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Task = new Task(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Task = new Task(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): Task = new Task(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): Task = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): Task = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): Task = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): Task = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): Task = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): Task = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): Task = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): Task = where(DSL.notExists(select))
}
