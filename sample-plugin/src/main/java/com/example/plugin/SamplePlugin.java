package com.example.plugin;

import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SamplePlugin extends SpringPlugin {

  public SamplePlugin(PluginWrapper wrapper) {
    super(wrapper);
  }

  @Override
  protected ApplicationContext createApplicationContext() {
    var applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.setClassLoader(getWrapper().getPluginClassLoader());
    applicationContext.scan("com.example.plugin");
    applicationContext.refresh();

    return applicationContext;
  }

}
