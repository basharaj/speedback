import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_speed_datingindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
invokeTag('link','asset',7,['rel':("icon"),'href':("favicon.ico"),'type':("image/x-ico")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(6)
expressionOut.print(grails.util.Environment.current.name)
printHtmlPart(7)
expressionOut.print(grailsApplication.config.grails?.profile)
printHtmlPart(8)
invokeTag('meta','g',19,['name':("info.app.version")],-1)
printHtmlPart(9)
invokeTag('meta','g',23,['name':("info.app.grailsVersion")],-1)
printHtmlPart(10)
expressionOut.print(GroovySystem.getVersion())
printHtmlPart(11)
expressionOut.print(System.getProperty('java.version'))
printHtmlPart(12)
expressionOut.print(grails.util.Environment.reloadingAgentEnabled)
printHtmlPart(13)
expressionOut.print(grailsApplication.controllerClasses.size())
printHtmlPart(14)
expressionOut.print(grailsApplication.domainClasses.size())
printHtmlPart(15)
expressionOut.print(grailsApplication.serviceClasses.size())
printHtmlPart(16)
expressionOut.print(grailsApplication.tagLibClasses.size())
printHtmlPart(17)
for( plugin in (applicationContext.getBean('pluginManager').allPlugins) ) {
printHtmlPart(18)
expressionOut.print(plugin.name)
printHtmlPart(19)
expressionOut.print(plugin.version)
printHtmlPart(20)
}
printHtmlPart(21)
})
invokeTag('captureContent','sitemesh',50,['tag':("nav")],2)
printHtmlPart(22)
invokeTag('image','asset',54,['src':("grails-cupsonly-logo-white.svg"),'class':("grails-logo")],-1)
printHtmlPart(23)
createClosureForHtmlPart(24, 2)
invokeTag('link','g',66,['controller':("event")],2)
printHtmlPart(25)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',69,['controller':("user")],2)
printHtmlPart(25)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',72,['controller':("feedbackM2W")],2)
printHtmlPart(25)
createClosureForHtmlPart(28, 2)
invokeTag('link','g',75,['controller':("feedbackW2M")],2)
printHtmlPart(25)
createClosureForHtmlPart(29, 2)
invokeTag('link','g',78,['controller':("feedback"),'action':("generate")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',85,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1540245585000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
