// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dnagadi@us.ibm.com/Projects/PlayFramework/play-101/conf/routes
// @DATE:Thu Aug 29 07:46:53 EDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
