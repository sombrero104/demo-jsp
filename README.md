
# 스프링부트에서 JSP 사용하기

#### 제약사항
- JAR 프로젝트로 만들 수 없음. WAR 프로젝트로 만들어야 함.
- Java-JAR로 실행할 수는 있지만 "실행가능한 JAR 파일"은 지원하지 않음.
- 언더토우(JBoss에서 만든 서블릿 컨테이너)는 JSP를 지원하지 않음.
- Whitelabel 에러 페이지를 error.jsp로 오버라이딩 할 수 없음.

#### jar와 war의 차이
- JAR (Java ARchive): Java 애플리케이션이 동작할 수 있도록 자바 프로젝트를 압축한 파일. JRE로도 실행 가능.
- WAR (Web Application aRchive): 서블릿 컨테이너에 배치할 수 있는 웹 애플리케이션 압축 파일. <br/>
    JSP, Servlet, Jar, Class, XML, HTML, Javascript 등 Servlet Context 관련 파일들로 패키징 되어 있음.<br/>
    WAR는 웹 응용프로그램을 위한 포맷이기 때문에 웹 관련 자원만 포함하고 있으며, 이를 사용하면 웹 애플리케이션을 쉽게 배포하고 테스트 할 수 있다.<br/>
    원하는 구성을 할 수 있는 Jar 포맷과 달리 War는 WEB-INF 및 META-INF 디렉토리로 사전 정의된 구조를 사용하며,<br/>
    WAR 파일을 실행하려면 Tomcat, Weblogic, WebSphere 등의 웹 서버(WEB) 또는 웹 컨테이너(WAS)가 필요하다. <br/>

<br/><br/>
