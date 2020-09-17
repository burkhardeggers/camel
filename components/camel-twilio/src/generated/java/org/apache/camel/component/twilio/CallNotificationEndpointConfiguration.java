
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.Notification}.
 */
@ApiParams(apiName = "call-notification", description = "",
           apiMethods = {@ApiMethod(methodName = "fetcher", description="Create a NotificationFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.call.NotificationFetcher fetcher(String pathCallSid, String pathSid)", "com.twilio.rest.api.v2010.account.call.NotificationFetcher fetcher(String pathAccountSid, String pathCallSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a NotificationReader to execute read", signatures={"com.twilio.rest.api.v2010.account.call.NotificationReader reader(String pathCallSid)", "com.twilio.rest.api.v2010.account.call.NotificationReader reader(String pathAccountSid, String pathCallSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class CallNotificationEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="The Call SID of the resource to fetch"), @ApiMethod(methodName = "fetcher", description="The Call SID of the resource to fetch"), @ApiMethod(methodName = "reader", description="The Call SID of the resources to read"), @ApiMethod(methodName = "reader", description="The Call SID of the resource to fetch")})
    private String pathCallSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
