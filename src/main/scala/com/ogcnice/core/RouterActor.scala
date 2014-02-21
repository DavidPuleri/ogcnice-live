package com.ogcnice.core

import spray.routing.HttpService
import akka.actor.{ActorRefFactory, Actor}
import com.ogcnice.core.service.{LiveService, ControllerService}

/**
 * Created by dpuleri on 2/18/14.
 */
class RouterActor extends Actor with ControllerService with LiveService{

  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(controllerRoute ~ liveServiceRoute)
}
