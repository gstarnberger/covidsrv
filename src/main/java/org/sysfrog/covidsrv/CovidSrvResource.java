package org.sysfrog.covidsrv;

import org.sysfrog.covidsrv.db.MessageDB;
import org.sysfrog.covidsrv.domain.infection.InfectionInfo;
import org.sysfrog.covidsrv.domain.tan.TanResponse;
import org.sysfrog.covidsrv.helper.ConfigurationHelper;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/Rest/v5")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CovidSrvResource {

    private final MessageDB messageDB;

    public CovidSrvResource(final MessageDB messageDB) {
        this.messageDB = messageDB;
    }

    @GET
    @Path("configuration")
    public Map<String, Object> getConfiguration() {
        return Map.of("configuration", ConfigurationHelper.getConfiguration());
    }

    @GET
    @Path("request-tan")
    public TanResponse requestTan(@QueryParam("phone") final String phone) {
        return new TanResponse();
    }

    @PUT
    @Path("infection-info")
    public String putInfectionInfo(final InfectionInfo infectionInfo) {
        // FIXME: The TAN is not checked
        messageDB.addInfection(infectionInfo);
        return "ok";  // FIXME - check what the official API returns
    }

    @GET
    @Path("infection-messages")
    public Map<String, Object> getInfectionMessages(@QueryParam("addressPrefix") final String addressPrefix) {
        // FIXME: Add support for fromId
        // FIXME: The MessageDB logic is just a placeholder that's probably incorrect
        return Map.of("infection-messages", messageDB.getMessages(addressPrefix));
    }
}
