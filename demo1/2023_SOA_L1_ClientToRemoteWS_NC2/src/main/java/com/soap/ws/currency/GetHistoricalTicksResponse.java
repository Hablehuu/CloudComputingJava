
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
 *         &lt;element name="GetHistoricalTicksResult" type="{http://www.xignite.com/services/}Ticks" minOccurs="0"/&gt;
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
    "getHistoricalTicksResult"
})
@XmlRootElement(name = "GetHistoricalTicksResponse")
public class GetHistoricalTicksResponse {

    @XmlElement(name = "GetHistoricalTicksResult")
    protected Ticks getHistoricalTicksResult;

    /**
     * Gets the value of the getHistoricalTicksResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ticks }
     *     
     */
    public Ticks getGetHistoricalTicksResult() {
        return getHistoricalTicksResult;
    }

    /**
     * Sets the value of the getHistoricalTicksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticks }
     *     
     */
    public void setGetHistoricalTicksResult(Ticks value) {
        this.getHistoricalTicksResult = value;
    }

}
