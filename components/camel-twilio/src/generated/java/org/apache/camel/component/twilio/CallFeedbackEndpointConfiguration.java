
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.Feedback}.
 */
@ApiParams(apiName = "call-feedback", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a FeedbackCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.call.FeedbackCreator creator(String pathCallSid, Integer qualityScore)", "com.twilio.rest.api.v2010.account.call.FeedbackCreator creator(String pathAccountSid, String pathCallSid, Integer qualityScore)"}), @ApiMethod(methodName = "fetcher", description="Create a FeedbackFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.call.FeedbackFetcher fetcher(String pathCallSid)", "com.twilio.rest.api.v2010.account.call.FeedbackFetcher fetcher(String pathAccountSid, String pathCallSid)"}), @ApiMethod(methodName = "updater", description="Create a FeedbackUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.call.FeedbackUpdater updater(String pathCallSid, Integer qualityScore)", "com.twilio.rest.api.v2010.account.call.FeedbackUpdater updater(String pathAccountSid, String pathCallSid, Integer qualityScore)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class CallFeedbackEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The unique sid that identifies this account"), @ApiMethod(methodName = "fetcher", description="The unique sid that identifies this account"), @ApiMethod(methodName = "updater", description="The unique sid that identifies this account")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The call sid that uniquely identifies the call"), @ApiMethod(methodName = "creator", description="The call sid that uniquely identifies the call"), @ApiMethod(methodName = "fetcher", description="The call sid that uniquely identifies the call"), @ApiMethod(methodName = "fetcher", description="The call sid that uniquely identifies the call"), @ApiMethod(methodName = "updater", description="The call sid that uniquely identifies the call"), @ApiMethod(methodName = "updater", description="The call sid that uniquely identifies the call")})
    private String pathCallSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The call quality expressed as an integer from 1 to 5"), @ApiMethod(methodName = "updater", description="The call quality expressed as an integer from 1 to 5")})
    private Integer qualityScore;

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

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }
}
