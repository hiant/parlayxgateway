package yufeiyu.parlayxgateway.foundation.bsc.servicelistener;

import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public abstract class ServiceListener extends AbstractMarshallingPayloadEndpoint {
	
	public void init() {}
	
	protected Object invokeInternal(Object requestObject) throws Exception {
		System.out.println(requestObject.getClass().getCanonicalName());
		return null;
	}
}
