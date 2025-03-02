
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
 *         &lt;element name="GetRealTimeForwardRateResult" type="{http://www.xignite.com/services/}ForwardRate" minOccurs="0"/&gt;
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
    "getRealTimeForwardRateResult"
})
@XmlRootElement(name = "GetRealTimeForwardRateResponse")
public class GetRealTimeForwardRateResponse {

    @XmlElement(name = "GetRealTimeForwardRateResult")
    protected ForwardRate getRealTimeForwardRateResult;

    /**
     * Gets the value of the getRealTimeForwardRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardRate }
     *     
     */
    public ForwardRate getGetRealTimeForwardRateResult() {
        return getRealTimeForwardRateResult;
    }

    /**
     * Sets the value of the getRealTimeForwardRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardRate }
     *     
     */
    public void setGetRealTimeForwardRateResult(ForwardRate value) {
        this.getRealTimeForwardRateResult = value;
    }

}
