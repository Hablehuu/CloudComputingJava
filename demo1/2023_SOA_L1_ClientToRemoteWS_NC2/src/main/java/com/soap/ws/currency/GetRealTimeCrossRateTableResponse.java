
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
 *         &lt;element name="GetRealTimeCrossRateTableResult" type="{http://www.xignite.com/services/}CrossRateTable" minOccurs="0"/&gt;
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
    "getRealTimeCrossRateTableResult"
})
@XmlRootElement(name = "GetRealTimeCrossRateTableResponse")
public class GetRealTimeCrossRateTableResponse {

    @XmlElement(name = "GetRealTimeCrossRateTableResult")
    protected CrossRateTable getRealTimeCrossRateTableResult;

    /**
     * Gets the value of the getRealTimeCrossRateTableResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRateTable }
     *     
     */
    public CrossRateTable getGetRealTimeCrossRateTableResult() {
        return getRealTimeCrossRateTableResult;
    }

    /**
     * Sets the value of the getRealTimeCrossRateTableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRateTable }
     *     
     */
    public void setGetRealTimeCrossRateTableResult(CrossRateTable value) {
        this.getRealTimeCrossRateTableResult = value;
    }

}
