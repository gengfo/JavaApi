1. ����
1.1 Commons-logging : apache�����ṩ����־������ӿڡ�����;������־����ֱ����ϡ�������JDBC ��api �ӿڣ�����ĵ�JDBC driver ʵ���ɸ����ݿ��ṩ��ʵ�֡�ͨ��ͳһ�ӿڽ���������ڲ�Ҳʵ����һЩ����־������
JDK 1.4 ��Logging
�����ԡ����ܺ���չ�Ժܲ���Է���
��־����All��FINEST��FINER��FINE��CONFIG��INFO��WARNING��SEVERE��OFF�ȣ������������ߡ�
����Ϊ�߼��������£��ͼ��𲻻��������������ΪINFO����INFO֮ǰ�ĵͼ�����Ϣ�����������
Ĭ���и�����̨������������INFO�������ϵ���Ϣ��

�� Commons��Logging������CLASSPATH�в���commons-logging.properties�ļ�����������ļ����ٶ��� org.apache.commons.logging.Log���ԣ�����ֵӦ������������Log�ӿ�ʵ�ֵ������޶����ơ�����ҵ� org.apache.commons.logging.Log���࣬��ʹ�ø������Ӧ����־������������ֹ��̡� 
�� �������Ĳ���ʧ�ܣ��ļ������ڻ����಻���ڣ���Commons��Logging���ż��ϵͳ���� org.apache.commons.logging.Log������ҵ�org.apache.commons.logging.Logϵͳ���ԣ���ʹ�ø�ϵͳ���Զ�Ӧ����־������������ֹ��̡� 
�� ����Ҳ���org.apache.commons.logging.Logϵͳ���ԣ�Logging������CLASSPATH��Ѱ��log4j���ࡣ����ҵ��ˣ�Logging�ͼٶ�Ӧ��Ҫʹ�õ���log4j��������ʱlog4j�����������Ҫͨ��log4j.properties�ļ���ȷ���á��������ֹ��̡� 
�� ����������Ҿ������ҵ��ʵ���Logging API����Ӧ�ó�����������JRE 1.4����߰汾�ϣ���Ĭ��ʹ��JRE 1.4����־��¼���ܡ��������ֹ��̡� 
�� ����������������ʧ�ܣ�JRE �汾Ҳ����1.4������Ӧ�ý�ʹ���ڽ���SimpleLog��SimpleLog��������־��Ϣֱ�������System.err���������ֹ���


1.2 Log4j : �����һ����־����������ڲ�����־ϵͳ�����װ��Logger ��appender ��pattern ��ʵ�֡����ǿ���ͨ�������ļ����ɵ�ʵ����־ϵͳ�Ĺ���Ͷ��������á�
Log4j
1. ��־����:ALL��TRACE(����)��DEBUG(����)��INFO(��Ϣ)��WARNING(����)��ERROR(����)��FITAL(����)��OFF �����������ߣ�����ߵĻ����μ���͵���Ϣ��


1.3 Slf4j : ȫ��ΪSimple Logging Facade for JAVA��java����־���档 �ǶԲ�ͬ��־����ṩ��һ�������װ�������ڲ����ʱ���޸��κ����ü��ɽ���һ����־ʵ�ַ�������commons-loging Ӧ����һ���ĳ��ԡ����˸о���Ӽ��ϸ���һЩ��û��commons ��ô��Ǳ����

1.4 Logback : LOGBack ��Ϊһ��ͨ�ÿɿ�������������־��ܣ�����ΪLog4j �������SLF4J ����µ���־ϵͳ������ʵ�֡�