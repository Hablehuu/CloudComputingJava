
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
 *         &lt;element name="GetHistoricalCrossRatesBidAskRangeResult" type="{http://www.xignite.com/services/}FullHistoricalCrossRates" minOccurs="0"/&gt;
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
    "getHistoricalCrossRatesBidAskRangeResult"
})
@XmlRootElement(name = "GetHistoricalCrossRatesBidAskRangeResponse")
public class GetHistoricalCrossRatesBidAskRangeResponse {

    @XmlElement(name = "GetHistoricalCrossRatesBidAskRangeResult")
    protected FullHistoricalCrossRates getHistoricalCrossRatesBidAskRangeResult;

    /**
     * Gets the value of the getHistoricalCrossRatesBidAskRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FullHistoricalCrossRates }
     *     
     */
    public FullHistoricalCrossRates getGetHistoricalCrossRatesBidAskRangeResult() {
        return getHistoricalCrossRatesBidAskRangeResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRatesBidAskRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullHistoricalCrossRates }
     *     
     */
    public void setGetHistoricalCrossRatesBidAskRangeResult(FullHistoricalCrossRates value) {
        this.getHistoricalCrossRatesBidAskRangeResult = value;
    }

}
