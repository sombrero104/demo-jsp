package me.sombrero.demojsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * jar 패키지가 아닌 war 패키지를 사용하도록 프로젝트를 만들면(jsp이기 때문에 war이어야 한다.)
 * 아래처럼 ServletInitializer 클래스가 디폴트로 생긴다.
 *
 * jar 처럼 독립적인 war를 실행할 때에는 @SpringBootApplication가 붙은 DemoJspApplication 클래스가 실행되고,
 * 톰캣과 같은 서블릿 엔진(서블릿 컨테이너)에 배포를 하는 형태로 사용하게 될 때에는 이 ServletInitializer 클래스 파일을 사용하게 된다.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoJspApplication.class);
    }

}
