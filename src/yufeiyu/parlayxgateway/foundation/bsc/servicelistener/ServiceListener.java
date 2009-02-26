package yufeiyu.parlayxgateway.foundation.bsc.servicelistener;

import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public abstract class ServiceListener extends AbstractMarshallingPayloadEndpoint {
	
	public void init() {}
	
	@Override
	protected Object invokeInternal(Object requestObject) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
