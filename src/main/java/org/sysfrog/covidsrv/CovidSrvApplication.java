package org.sysfrog.covidsrv;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.sysfrog.covidsrv.db.MessageDB;

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
        final MessageDB messageDB = new MessageDB();
        final CovidSrvResource covidSrvResource = new CovidSrvResource(messageDB);
        environment.jersey().register(covidSrvResource);
    }
}
