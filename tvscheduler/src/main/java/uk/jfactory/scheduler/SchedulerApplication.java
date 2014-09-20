package uk.jfactory.scheduler;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SchedulerApplication extends Application<SchedulerConfiguration> {

    public static void main(String[] args) throws Exception {
        new SchedulerApplication().run(args);
    }
    
	@Override
	public String getName() {
		return "Prototype TV Scheduler";
	}

	@Override
	public void initialize(Bootstrap<SchedulerConfiguration> configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(SchedulerConfiguration configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
