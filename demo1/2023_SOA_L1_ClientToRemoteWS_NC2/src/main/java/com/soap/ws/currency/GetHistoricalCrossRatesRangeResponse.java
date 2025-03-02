
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
 *         &lt;element name="GetHistoricalCrossRatesRangeResult" type="{http://www.xignite.com/services/}HistoricalCrossRates" minOccurs="0"/&gt;
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
    "getHistoricalCrossRatesRangeResult"
})
@XmlRootElement(name = "GetHistoricalCrossRatesRangeResponse")
public class GetHistoricalCrossRatesRangeResponse {

    @XmlElement(name = "GetHistoricalCrossRatesRangeResult")
    protected HistoricalCrossRates getHistoricalCrossRatesRangeResult;

    /**
     * Gets the value of the getHistoricalCrossRatesRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalCrossRates }
     *     
     */
    public HistoricalCrossRates getGetHistoricalCrossRatesRangeResult() {
        return getHistoricalCrossRatesRangeResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRatesRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalCrossRates }
     *     
     */
    public void setGetHistoricalCrossRatesRangeResult(HistoricalCrossRates value) {
        this.getHistoricalCrossRatesRangeResult = value;
    }

}
