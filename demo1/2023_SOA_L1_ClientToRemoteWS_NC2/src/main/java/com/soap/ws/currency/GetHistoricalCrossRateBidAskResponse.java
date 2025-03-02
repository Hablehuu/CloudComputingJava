
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
 *         &lt;element name="GetHistoricalCrossRateBidAskResult" type="{http://www.xignite.com/services/}FullHistoricalCrossRate" minOccurs="0"/&gt;
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
    "getHistoricalCrossRateBidAskResult"
})
@XmlRootElement(name = "GetHistoricalCrossRateBidAskResponse")
public class GetHistoricalCrossRateBidAskResponse {

    @XmlElement(name = "GetHistoricalCrossRateBidAskResult")
    protected FullHistoricalCrossRate getHistoricalCrossRateBidAskResult;

    /**
     * Gets the value of the getHistoricalCrossRateBidAskResult property.
     * 
     * @return
     *     possible object is
     *     {@link FullHistoricalCrossRate }
     *     
     */
    public FullHistoricalCrossRate getGetHistoricalCrossRateBidAskResult() {
        return getHistoricalCrossRateBidAskResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRateBidAskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullHistoricalCrossRate }
     *     
     */
    public void setGetHistoricalCrossRateBidAskResult(FullHistoricalCrossRate value) {
        this.getHistoricalCrossRateBidAskResult = value;
    }

}
