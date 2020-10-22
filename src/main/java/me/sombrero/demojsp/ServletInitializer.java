package me.sombrero.demojsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * jar 패키지가 아닌 war 패키지를 사용하도록 프로젝트를 만들면(jsp이기 때문에 war이어야 한다.)
 * 아래처럼 ServletInitializer 클래스가 디폴트로 생긴다.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoJspApplication.class);
    }

}
