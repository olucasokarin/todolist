package share

import org.jooq._
import org.jooq.impl.DSL

import java.sql.DriverManager

object Connection {
  def connection(): DSLContext = {
    val connection = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/postgres", "root", "root")
    DSL.using (connection, SQLDialect.POSTGRES)}
}
