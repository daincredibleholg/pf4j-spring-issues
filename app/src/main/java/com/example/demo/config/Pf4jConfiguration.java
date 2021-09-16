package com.example.demo.config;

import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.PluginManager;
import org.pf4j.spring.SpringPluginManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Pf4jConfiguration {

  @Value("${demo.plugins.path}")
  private String pluginPath;

  @Bean
  public PluginManager pluginManager() {
    if (pluginPath == null) {
      log.info("No custom plugin root configured. Using defaults.");
      return new SpringPluginManager();
    }
    else {
      log.info("Custom plugin root {} configured.", pluginPath);
      return new SpringPluginManager(new File(pluginPath).toPath());
    }
  }

}
