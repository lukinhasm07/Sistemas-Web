// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lucas/sistemas-web/conf/routes
// @DATE:Sat Sep 15 01:07:55 BRT 2018


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