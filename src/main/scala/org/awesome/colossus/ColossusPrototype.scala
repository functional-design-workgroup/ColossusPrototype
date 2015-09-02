package org.awesome.colossus

import colossus._
import service._
import protocols.http._
import UrlParsing._
import HttpMethod._

object ColossusPrototype extends App {

  implicit val io_system = IOSystem()

  Service.become[Http]("http-echo", 9000) {
    case request @ Get on Root => Callback.successful(request.ok("Hello world!"))
    case request @ Get on Root / "echo" / str => Callback.successful(request.ok(str))
    case request @ Get on Root / "version" => Callback.successful(request.ok("1.0-SNAPSHOT"))
  }

}
