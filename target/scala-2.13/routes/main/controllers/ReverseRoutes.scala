// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dnagadi@us.ibm.com/Projects/PlayFramework/play-101/conf/routes
// @DATE:Thu Aug 29 07:46:53 EDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def jsonCatch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/catch")
    }
  
    // @LINE:8
    def plainText(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "plainText")
    }
  
    // @LINE:10
    def jsonObject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/object")
    }
  
    // @LINE:13
    def jsonBadRequest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/badRequest")
    }
  
    // @LINE:9
    def jsonMap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/map")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
