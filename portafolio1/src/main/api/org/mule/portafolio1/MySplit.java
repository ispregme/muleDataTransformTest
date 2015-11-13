package org.mule.portafolio1;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class MySplit extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		//org.mule.util.StringUtils.split(message.payload, ',')
		return message.getPayload().toString().split(",");
	}
	

}
