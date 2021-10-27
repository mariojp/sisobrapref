//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.18 às 06:47:39 PM BRT 
//


package br.com.mariojp.sisobrapref.clientws.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consultarDocumento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultarDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xmlEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarDocumento", propOrder = {
    "xmlEntrada"
})
public class ConsultarDocumento {

    protected String xmlEntrada;

    /**
     * Obtém o valor da propriedade xmlEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlEntrada() {
        return xmlEntrada;
    }

    /**
     * Define o valor da propriedade xmlEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlEntrada(String value) {
        this.xmlEntrada = value;
    }

}
