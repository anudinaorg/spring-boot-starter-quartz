package de.chclaus.spring.boot.quartz.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * @author Christian Claus (ch.claus@me.com)
 */
@Configuration
@ConditionalOnProperty(name = "quartz.enabled")
@AutoConfigureAfter({org.springframework.web.WebApplicationInitializer.class})
public class QuartzWebAutoConfiguration implements ApplicationListener<ContextRefreshedEvent>, Ordered {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    System.out.println("foo");
  }

  @Override
  public int getOrder() {
    return Ordered.LOWEST_PRECEDENCE;
  }
}
