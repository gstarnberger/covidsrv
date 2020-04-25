package org.sysfrog;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CovidSrvApplication extends Application<CovidSrvConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CovidSrvApplication().run(args);
    }

    @Override
    public String getName() {
        return "CovidSrv";
    }

    @Override
    public void initialize(final Bootstrap<CovidSrvConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final CovidSrvConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
