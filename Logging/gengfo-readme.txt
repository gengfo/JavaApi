1. 概念
1.1 Commons-logging : apache最早提供的日志的门面接口。避免和具体的日志方案直接耦合。类似于JDBC 的api 接口，具体的的JDBC driver 实现由各数据库提供商实现。通过统一接口解耦，不过其内部也实现了一些简单日志方案。
JDK 1.4 的Logging
易用性、功能和扩展性很差，可以放弃
日志级别All、FINEST、FINER、FINE、CONFIG、INFO、WARNING、SEVERE、OFF等，级别依次升高。
设置为高级别的情况下，低级别不会输出，比如设置为INFO，则INFO之前的低级别信息将不会输出。
默认有个控制台输出，用于输出INFO级别以上的信息。

⑴ Commons的Logging首先在CLASSPATH中查找commons-logging.properties文件。这个属性文件至少定义 org.apache.commons.logging.Log属性，它的值应该是上述任意Log接口实现的完整限定名称。如果找到 org.apache.commons.logging.Log属相，则使用该属相对应的日志组件。结束发现过程。 
⑵ 如果上面的步骤失败（文件不存在或属相不存在），Commons的Logging接着检查系统属性 org.apache.commons.logging.Log。如果找到org.apache.commons.logging.Log系统属性，则使用该系统属性对应的日志组件。结束发现过程。 
⑶ 如果找不到org.apache.commons.logging.Log系统属性，Logging接着在CLASSPATH中寻找log4j的类。如果找到了，Logging就假定应用要使用的是log4j。不过这时log4j本身的属性仍要通过log4j.properties文件正确配置。结束发现过程。 
⑷ 如果上述查找均不能找到适当的Logging API，但应用程序正运行在JRE 1.4或更高版本上，则默认使用JRE 1.4的日志记录功能。结束发现过程。 
⑸ 最后，如果上述操作都失败（JRE 版本也低于1.4），则应用将使用内建的SimpleLog。SimpleLog把所有日志信息直接输出到System.err。结束发现过程


1.2 Log4j : 经典的一种日志解决方案。内部把日志系统抽象封装成Logger 、appender 、pattern 等实现。我们可以通过配置文件轻松的实现日志系统的管理和多样化配置。
Log4j
1. 日志级别:ALL、TRACE(跟踪)、DEBUG(调试)、INFO(信息)、WARNING(警告)、ERROR(错误)、FITAL(致命)、OFF 级别依次升高，级别高的会屏蔽级别低的信息。


1.3 Slf4j : 全称为Simple Logging Facade for JAVA：java简单日志门面。 是对不同日志框架提供的一个门面封装。可以在部署的时候不修改任何配置即可接入一种日志实现方案。和commons-loging 应该有一样的初衷。个人感觉设从计上更好一些，没有commons 那么多潜规则。

1.4 Logback : LOGBack 作为一个通用可靠、快速灵活的日志框架，将作为Log4j 的替代和SLF4J 组成新的日志系统的完整实现。