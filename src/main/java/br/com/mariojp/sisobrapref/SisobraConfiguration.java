package br.com.mariojp.sisobrapref;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SisobraConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("br.com.mariojp.sisobrapref.clientws.wsdl");
        return marshaller;
    }

    @Bean
    public SisobraClient sisobraClient(Jaxb2Marshaller marshaller) {
        SisobraClient client = new SisobraClient();
        client.setDefaultUri("https://sisobrapref.receita.economia.gov.br/sisobraprefWS/recepcao");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}

