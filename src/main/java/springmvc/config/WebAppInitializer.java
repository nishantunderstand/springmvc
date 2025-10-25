package springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null; // No root context
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[]{WebConfig.class}; // Your WebConfig
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"}; // DispatcherServlet mapped to root
  }
}
