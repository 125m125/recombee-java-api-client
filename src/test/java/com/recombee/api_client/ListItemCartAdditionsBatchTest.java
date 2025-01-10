package com.recombee.api_client;
/*
 This file is auto-generated, do not edit
*/


import com.recombee.api_client.api_requests.*;
import com.recombee.api_client.bindings.*;
import com.recombee.api_client.exceptions.ApiException;
import com.recombee.api_client.exceptions.ResponseException;

import java.util.HashMap;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class ListItemCartAdditionsBatchTest extends InteractionsTestCase {

    @Test
    public void testListItemCartAdditions() throws ApiException {
        waitForDataProcessing();
        Object resp2;
        Request[] requests = new Request[] {
            new ListItemCartAdditions("item")
        };

        BatchResponse[] responses = this.client.send(new Batch(requests));
        assertEquals(200,responses[0].getStatusCode());
        assertEquals(1, ((CartAddition []) responses[0].getResponse()).length);
        assertEquals ("item",((CartAddition []) responses[0].getResponse())[0].getItemId());
        assertEquals ("user",((CartAddition []) responses[0].getResponse())[0].getUserId());
    }
}
