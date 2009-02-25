package yufeiyu.parlayxgateway.foundation.bsc.servicelistener;

import org.springframework.oxm.jaxb.AbstractJaxbMarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public abstract class ServiceListener extends AbstractMarshallingPayloadEndpoint {
	
	protected AbstractJaxbMarshaller marshaller;

	public void init() {
		marshaller = new Jaxb2Marshaller();
		setMarshaller(marshaller);
		setUnmarshaller(marshaller);
	}
	
	@Override
	protected Object invokeInternal(Object requestObject) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
