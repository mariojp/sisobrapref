package br.com.mariojp.sisobrapref;

import br.com.mariojp.sisobrapref.clientws.wsdl.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.mariojp.sisobrapref.clientws.wsdl.RecepcaoDSM;
import br.com.mariojp.sisobrapref.clientws.wsdl.RecepcaoDSMResponse;

import javax.xml.bind.JAXBElement;


public class SisobraClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SisobraClient.class);

    public RecepcaoDSMResponse getRecepcaoResponse(String xml) {

        RecepcaoDSM request = new RecepcaoDSM();

        request.setXmlEntrada(xml);

        log.info("Requesting location for " + xml);

        RecepcaoDSMResponse response = (RecepcaoDSMResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://sisobrapref.receita.economia.gov.br/sisobraprefWS/recepcao", request);

        return response;
    }


    public RecepcaoDSMResponse getRecepcaoResponse(){
        RecepcaoDSM request = new RecepcaoDSM();

        request.setXmlEntrada("<xml></xml>");

        JAXBElement<RecepcaoDSMResponse> jaxbResponse =
                (JAXBElement<RecepcaoDSMResponse>) getWebServiceTemplate().marshalSendAndReceive(new ObjectFactory().createRecepcaoDSM(request));

        RecepcaoDSMResponse response = jaxbResponse.getValue();
        return response;
    }
}