package org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.request;

import org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkHandlerStatus;
import org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityMessageContext;
import org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.FrameworkHandler;

public abstract class AbstractRequestHandler extends FrameworkHandler {
    public abstract FrameworkHandlerStatus validate(IdentityMessageContext identityMessageContext)
            throws RequestHandlerException;


}