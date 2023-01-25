package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.rest.HelloResource;

public class StudentModule  extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(HelloResource.class);
	}
}
