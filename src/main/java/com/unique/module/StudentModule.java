package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.rest.MainResources;

public class StudentModule  extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(MainResources.class);
	}
}
