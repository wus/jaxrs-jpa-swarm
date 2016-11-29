package de.shan.rest.schrinkwrap;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import de.shan.service.CouponUsedException;

@Provider
public class CouponUsedExceptionMapper implements ExceptionMapper<CouponUsedException> {
    @Override
    public Response toResponse(CouponUsedException e) {
        return Response
                .status(Response.Status.OK)
                .entity(e.getMessage())
                .type(MediaType.TEXT_PLAIN_TYPE)
                .build();
    }
}
