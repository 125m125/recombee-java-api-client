package com.recombee.api_client.api_requests;

/*
 This file is auto-generated, do not edit
*/

import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.recombee.api_client.util.HTTPMethod;

/**
 * List all the view portions ever submitted by a given user.
 */
public class ListUserViewPortions extends Request {

    /**
     * ID of the user whose view portions are to be listed.
     */
    protected String userId;

    /**
     * Construct the request
     * @param userId ID of the user whose view portions are to be listed.
     */
    public ListUserViewPortions (String userId) {
        this.userId = userId;
        this.timeout = 100000;
    }


    public String getUserId() {
         return this.userId;
    }

    /**
     * @return Used HTTP method
     */
    @Override
    public HTTPMethod getHTTPMethod() {
        return HTTPMethod.GET;
    }

    /**
     * @return URI to the endpoint including path parameters
     */
    @Override
    public String getPath() {
        return String.format("/users/%s/viewportions/", this.userId);
    }

    /**
     * Get query parameters
     * @return Values of query parameters (name of parameter: value of the parameter)
     */
    @Override
    public Map<String, Object> getQueryParameters() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        return params;
    }

    /**
     * Get body parameters
     * @return Values of body parameters (name of parameter: value of the parameter)
     */
    @Override
    public Map<String, Object> getBodyParameters() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        return params;
    }

}
