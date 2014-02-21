package com.ogcnice.core.service

import spray.routing.HttpService

import org.fusesource.scalate.{ Binding, TemplateEngine }

/**
 * Created by dpuleri on 2/19/14.
 */
trait LiveService  extends HttpService {

  val liveServiceRoute = path("live"){
    get {
      complete {
        <h1>Live</h1>
      }
    }

  }
}
