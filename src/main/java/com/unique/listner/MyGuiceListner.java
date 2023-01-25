package com.unique.listner;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import com.google.inject.Module;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.unique.module.StudentModule;

public class MyGuiceListner extends GuiceResteasyBootstrapServletContextListener {
	

	@Override
	protected List<? extends Module> getModules(ServletContext context) {
		return Arrays.asList(new StudentModule());
	}
		
}
