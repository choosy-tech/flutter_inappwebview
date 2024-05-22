package com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js;

import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;

public class ConsoleLogJS {
  public static final String CONSOLE_LOG_JS_PLUGIN_SCRIPT_GROUP_NAME = "IN_APP_WEBVIEW_CONSOLE_LOG_JS_PLUGIN_SCRIPT";
  public static final PluginScript CONSOLE_LOG_JS_PLUGIN_SCRIPT = new PluginScript(
          ConsoleLogJS.CONSOLE_LOG_JS_PLUGIN_SCRIPT_GROUP_NAME,
          ConsoleLogJS.CONSOLE_LOG_JS_SOURCE,
          UserScriptInjectionTime.AT_DOCUMENT_START,
          null,
          true,
          null
  );

  public static final String CONSOLE_LOG_JS_SOURCE = "(function(con) {" +
          " function _bm(args) {" +
          "   var message = '';" +
          "   for (var i in args) {" +
          "     try {" +
          "       message += message === '' ? args[i] : ' ' + args[i];" +
          "     } catch(ignored) {}" +
          "   }" +
          "   return message;" +
          " }" +
          " var ols = {" +
          "     'log': con.log," +
          "     'debug': con.debug," +
          "     'error': con.error," +
          "     'info': con.info," +
          "     'warn': con.warn" +
          " };" +
          " for (var k in ols) {" +
          "  (function(ol) {con[ol] = function(){ols[ol].call(con,_bm(arguments));}})(k);" +
          " }" +
          "})(window.console);";
}
