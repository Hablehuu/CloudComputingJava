
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
 *         &lt;element name="GetAverageHistoricalCrossRatesResult" type="{http://www.xignite.com/services/}ArrayOfAverageHistoricalCrossRate" minOccurs="0"/&gt;
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
    "getAverageHistoricalCrossRatesResult"
})
@XmlRootElement(name = "GetAverageHistoricalCrossRatesResponse")
public class GetAverageHistoricalCrossRatesResponse {

    @XmlElement(name = "GetAverageHistoricalCrossRatesResult")
    protected ArrayOfAverageHistoricalCrossRate getAverageHistoricalCrossRatesResult;

    /**
     * Gets the value of the getAverageHistoricalCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAverageHistoricalCrossRate }
     *     
     */
    public ArrayOfAverageHistoricalCrossRate getGetAverageHistoricalCrossRatesResult() {
        return getAverageHistoricalCrossRatesResult;
    }

    /**
     * Sets the value of the getAverageHistoricalCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAverageHistoricalCrossRate }
     *     
     */
    public void setGetAverageHistoricalCrossRatesResult(ArrayOfAverageHistoricalCrossRate value) {
        this.getAverageHistoricalCrossRatesResult = value;
    }

}
