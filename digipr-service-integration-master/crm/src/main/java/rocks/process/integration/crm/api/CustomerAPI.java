/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.integration.crm.api;



import javax.ws.rs.*;

import rocks.process.integration.crm.domain.Customer;


@Path("/")
public interface CustomerAPI {

    @GET
    @Path("/customer/{customerId}")
    @Produces({"application/json"})
    public Customer findCustomer(@PathParam("customerId") String customerId);

    @PUT
    @Path("/loyalty/{customerId}")
    @Consumes({"application/json"})
    public void editLoyaltyBalance(@PathParam("customerId") String customerId, Customer customer);
}

