package com.recombee.api_client.api_requests;

/*
 This file is auto-generated, do not edit
*/

import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.recombee.api_client.bindings.Logic;
import com.recombee.api_client.util.HTTPMethod;

/**
 * Adds a purchase of the given item made by the given user.
 */
public class AddPurchase extends Request {

    /**
     * User who purchased the item
     */
    protected String userId;
    /**
     * Purchased item
     */
    protected String itemId;
    /**
     * UTC timestamp of the purchase as ISO8601-1 pattern or UTC epoch time. The default value is the current time.
     */
    protected Date timestamp;
    /**
     * Sets whether the given user/item should be created if not present in the database.
     */
    protected Boolean cascadeCreate;
    /**
     * Amount (number) of purchased items. The default is 1. For example, if `user-x` purchases two `item-y` during a single order (session...), the `amount` should equal 2.
     */
    protected Double amount;
    /**
     * Price paid by the user for the item. If `amount` is greater than 1, the sum of prices of all the items should be given.
     */
    protected Double price;
    /**
     * Your profit from the purchased item. The profit is natural in the e-commerce domain (for example, if `user-x` purchases `item-y` for $100 and the gross margin is 30 %, then the profit is $30) but is also applicable in other domains (for example, at a news company it may be income from a displayed advertisement on article page). If `amount` is greater than 1, the sum of profit of all the items should be given.
     */
    protected Double profit;
    /**
     * If this purchase is based on a recommendation request, `recommId` is the id of the clicked recommendation.
     */
    protected String recommId;
    /**
     * A dictionary of additional data for the interaction.
     */
    protected Map<String, Object> additionalData;

    /**
     * Construct the request
     * @param userId User who purchased the item
     * @param itemId Purchased item
     */
    public AddPurchase (String userId,String itemId) {
        this.userId = userId;
        this.itemId = itemId;
        this.timeout = 3000;
    }

    /**
     * @param timestamp UTC timestamp of the purchase as ISO8601-1 pattern or UTC epoch time. The default value is the current time.
     */
    public AddPurchase setTimestamp(Date timestamp) {
         this.timestamp = timestamp;
         return this;
    }

    /**
     * @param cascadeCreate Sets whether the given user/item should be created if not present in the database.
     */
    public AddPurchase setCascadeCreate(boolean cascadeCreate) {
         this.cascadeCreate = cascadeCreate;
         return this;
    }

    /**
     * @param amount Amount (number) of purchased items. The default is 1. For example, if `user-x` purchases two `item-y` during a single order (session...), the `amount` should equal 2.
     */
    public AddPurchase setAmount(double amount) {
         this.amount = amount;
         return this;
    }

    /**
     * @param price Price paid by the user for the item. If `amount` is greater than 1, the sum of prices of all the items should be given.
     */
    public AddPurchase setPrice(double price) {
         this.price = price;
         return this;
    }

    /**
     * @param profit Your profit from the purchased item. The profit is natural in the e-commerce domain (for example, if `user-x` purchases `item-y` for $100 and the gross margin is 30 %, then the profit is $30) but is also applicable in other domains (for example, at a news company it may be income from a displayed advertisement on article page). If `amount` is greater than 1, the sum of profit of all the items should be given.
     */
    public AddPurchase setProfit(double profit) {
         this.profit = profit;
         return this;
    }

    /**
     * @param recommId If this purchase is based on a recommendation request, `recommId` is the id of the clicked recommendation.
     */
    public AddPurchase setRecommId(String recommId) {
         this.recommId = recommId;
         return this;
    }

    /**
     * @param additionalData A dictionary of additional data for the interaction.
     */
    public AddPurchase setAdditionalData(Map<String, Object> additionalData) {
         this.additionalData = additionalData;
         return this;
    }

    public String getUserId() {
         return this.userId;
    }

    public String getItemId() {
         return this.itemId;
    }

    public Date getTimestamp() {
         return this.timestamp;
    }

    public boolean getCascadeCreate() {
         if (this.cascadeCreate==null) return false;
         return this.cascadeCreate;
    }

    public double getAmount() {
         return this.amount;
    }

    public double getPrice() {
         return this.price;
    }

    public double getProfit() {
         return this.profit;
    }

    public String getRecommId() {
         return this.recommId;
    }

    public Map<String, Object> getAdditionalData() {
         return this.additionalData;
    }

    /**
     * @return Used HTTP method
     */
    @Override
    public HTTPMethod getHTTPMethod() {
        return HTTPMethod.POST;
    }

    /**
     * @return URI to the endpoint including path parameters
     */
    @Override
    public String getPath() {
        return "/purchases/";
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
        params.put("userId", this.userId);
        params.put("itemId", this.itemId);
        if (this.timestamp!=null) {
            params.put("timestamp", this.timestamp.getTime()/1000.0);
        }
        if (this.cascadeCreate!=null) {
            params.put("cascadeCreate", this.cascadeCreate);
        }
        if (this.amount!=null) {
            params.put("amount", this.amount);
        }
        if (this.price!=null) {
            params.put("price", this.price);
        }
        if (this.profit!=null) {
            params.put("profit", this.profit);
        }
        if (this.recommId!=null) {
            params.put("recommId", this.recommId);
        }
        if (this.additionalData!=null) {
            params.put("additionalData", this.additionalData);
        }
        return params;
    }

}
