//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.18 às 06:47:39 PM BRT 
//


package br.com.mariojp.sisobrapref.clientws.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.mariojp.sisobrapref.clientws.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarDocumento_QNAME = new QName("http://webservice.ejb.sisobrapref.serpro.gov.br/", "consultarDocumento");
    private final static QName _ConsultarDocumentoResponse_QNAME = new QName("http://webservice.ejb.sisobrapref.serpro.gov.br/", "consultarDocumentoResponse");
    private final static QName _RecepcaoDSM_QNAME = new QName("http://webservice.ejb.sisobrapref.serpro.gov.br/", "recepcaoDSM");
    private final static QName _RecepcaoDSMResponse_QNAME = new QName("http://webservice.ejb.sisobrapref.serpro.gov.br/", "recepcaoDSMResponse");
    private final static QName _RecepcaoLote_QNAME = new QName("http://webservice.ejb.sisobrapref.serpro.gov.br/", "recepcaoLote");
    private final static QName _RecepcaoLoteResponse_QNAME = new QName("http://webservice.ejb.sisobrapref.serpro.gov.br/", "recepcaoLoteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.mariojp.sisobrapref.clientws.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarDocumento }
     * 
     */
    public ConsultarDocumento createConsultarDocumento() {
        return new ConsultarDocumento();
    }

    /**
     * Create an instance of {@link ConsultarDocumentoResponse }
     * 
     */
    public ConsultarDocumentoResponse createConsultarDocumentoResponse() {
        return new ConsultarDocumentoResponse();
    }

    /**
     * Create an instance of {@link RecepcaoDSM }
     * 
     */
    public RecepcaoDSM createRecepcaoDSM() {
        return new RecepcaoDSM();
    }

    /**
     * Create an instance of {@link RecepcaoDSMResponse }
     * 
     */
    public RecepcaoDSMResponse createRecepcaoDSMResponse() {
        return new RecepcaoDSMResponse();
    }

    /**
     * Create an instance of {@link RecepcaoLote }
     * 
     */
    public RecepcaoLote createRecepcaoLote() {
        return new RecepcaoLote();
    }

    /**
     * Create an instance of {@link RecepcaoLoteResponse }
     * 
     */
    public RecepcaoLoteResponse createRecepcaoLoteResponse() {
        return new RecepcaoLoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ejb.sisobrapref.serpro.gov.br/", name = "consultarDocumento")
    public JAXBElement<ConsultarDocumento> createConsultarDocumento(ConsultarDocumento value) {
        return new JAXBElement<ConsultarDocumento>(_ConsultarDocumento_QNAME, ConsultarDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDocumentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarDocumentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ejb.sisobrapref.serpro.gov.br/", name = "consultarDocumentoResponse")
    public JAXBElement<ConsultarDocumentoResponse> createConsultarDocumentoResponse(ConsultarDocumentoResponse value) {
        return new JAXBElement<ConsultarDocumentoResponse>(_ConsultarDocumentoResponse_QNAME, ConsultarDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcaoDSM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcaoDSM }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ejb.sisobrapref.serpro.gov.br/", name = "recepcaoDSM")
    public JAXBElement<RecepcaoDSM> createRecepcaoDSM(RecepcaoDSM value) {
        return new JAXBElement<RecepcaoDSM>(_RecepcaoDSM_QNAME, RecepcaoDSM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcaoDSMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcaoDSMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ejb.sisobrapref.serpro.gov.br/", name = "recepcaoDSMResponse")
    public JAXBElement<RecepcaoDSMResponse> createRecepcaoDSMResponse(RecepcaoDSMResponse value) {
        return new JAXBElement<RecepcaoDSMResponse>(_RecepcaoDSMResponse_QNAME, RecepcaoDSMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcaoLote }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcaoLote }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ejb.sisobrapref.serpro.gov.br/", name = "recepcaoLote")
    public JAXBElement<RecepcaoLote> createRecepcaoLote(RecepcaoLote value) {
        return new JAXBElement<RecepcaoLote>(_RecepcaoLote_QNAME, RecepcaoLote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcaoLoteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcaoLoteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.ejb.sisobrapref.serpro.gov.br/", name = "recepcaoLoteResponse")
    public JAXBElement<RecepcaoLoteResponse> createRecepcaoLoteResponse(RecepcaoLoteResponse value) {
        return new JAXBElement<RecepcaoLoteResponse>(_RecepcaoLoteResponse_QNAME, RecepcaoLoteResponse.class, null, value);
    }

}
