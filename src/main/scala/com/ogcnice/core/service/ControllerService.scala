package com.ogcnice.core.service

import spray.routing.HttpService
import akka.actor.ActorRefFactory
import akka.actor.Status.Success
import org.fusesource.scalate._
import java.io.File

/**
 * Created by dpuleri on 2/19/14.
 */
trait ControllerService extends HttpService {

  def templateEngine = new TemplateEngine()

      val controllerRoute = path(""){
        get {
          complete {

            templateEngine.layout("base.mustache", Map("name"->"David"))

          }
        }

      }

}
