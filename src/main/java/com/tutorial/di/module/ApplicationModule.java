package com.tutorial.di.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.name.Names;
import com.tutorial.di.examples.*;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		// binding interfaces
		bind(MessageService.class).annotatedWith(Names.named("emailService")).to(EmailService.class);
		bind(MessageService.class).annotatedWith(Names.named("fbService")).to(FacebookService.class);
		binder().bind(InjectMultipleImplementation.class);

		// installing factory
		install(new FactoryModuleBuilder().build(RuntimeDependencyInjectionFactory.class));

		// request static injections
		requestStaticInjection(LegacyClass.class);
	}

	@Provides
	@Singleton
	HttpClient httpClientProvider(){
		return new HttpClient("localhost","8080");
	}
}
