
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laffineur/Raspi_WebApp/conf/routes
// @DATE:Tue Mar 28 12:19:06 CEST 2017


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
