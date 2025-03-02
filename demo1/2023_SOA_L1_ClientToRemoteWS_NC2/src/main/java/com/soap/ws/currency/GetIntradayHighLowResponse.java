
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
 *         &lt;element name="GetIntradayHighLowResult" type="{http://www.xignite.com/services/}HighLowTick" minOccurs="0"/&gt;
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
    "getIntradayHighLowResult"
})
@XmlRootElement(name = "GetIntradayHighLowResponse")
public class GetIntradayHighLowResponse {

    @XmlElement(name = "GetIntradayHighLowResult")
    protected HighLowTick getIntradayHighLowResult;

    /**
     * Gets the value of the getIntradayHighLowResult property.
     * 
     * @return
     *     possible object is
     *     {@link HighLowTick }
     *     
     */
    public HighLowTick getGetIntradayHighLowResult() {
        return getIntradayHighLowResult;
    }

    /**
     * Sets the value of the getIntradayHighLowResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLowTick }
     *     
     */
    public void setGetIntradayHighLowResult(HighLowTick value) {
        this.getIntradayHighLowResult = value;
    }

}
