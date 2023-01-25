package com.unique.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/restApi")
public class RestEasyConfig extends Application {
	
   private Set<Object> singletons  = new HashSet<>();
   
   public RestEasyConfig() {
	   this.singletons.add(new MainResources());
   }
   @Override
   public Set<Object> getSingletons(){
	   return singletons;
   }
}