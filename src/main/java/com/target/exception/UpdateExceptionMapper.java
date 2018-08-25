package com.target.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.target.model.ErrorMessage;


@Provider
public class UpdateExceptionMapper implements ExceptionMapper<UpdateException> {

	@Override
	public Response toResponse(UpdateException exception) {
		return Response.status(Status.NOT_MODIFIED)
				.entity(new ErrorMessage("array index out of bound exception", 400, "wwwelham"))
				.build();
	}

}
