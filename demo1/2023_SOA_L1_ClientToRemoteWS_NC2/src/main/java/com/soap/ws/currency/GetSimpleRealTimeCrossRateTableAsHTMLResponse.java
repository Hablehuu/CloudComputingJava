
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetSimpleRealTimeCrossRateTableAsHTMLResult" type="{http://www.xignite.com/services/}HTMLCrossRateTable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSimpleRealTimeCrossRateTableAsHTMLResult"
})
@XmlRootElement(name = "GetSimpleRealTimeCrossRateTableAsHTMLResponse")
public class GetSimpleRealTimeCrossRateTableAsHTMLResponse {

    @XmlElement(name = "GetSimpleRealTimeCrossRateTableAsHTMLResult")
    protected HTMLCrossRateTable getSimpleRealTimeCrossRateTableAsHTMLResult;

    /**
     * Gets the value of the getSimpleRealTimeCrossRateTableAsHTMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLCrossRateTable }
     *     
     */
    public HTMLCrossRateTable getGetSimpleRealTimeCrossRateTableAsHTMLResult() {
        return getSimpleRealTimeCrossRateTableAsHTMLResult;
    }

    /**
     * Sets the value of the getSimpleRealTimeCrossRateTableAsHTMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLCrossRateTable }
     *     
     */
    public void setGetSimpleRealTimeCrossRateTableAsHTMLResult(HTMLCrossRateTable value) {
        this.getSimpleRealTimeCrossRateTableAsHTMLResult = value;
    }

}
