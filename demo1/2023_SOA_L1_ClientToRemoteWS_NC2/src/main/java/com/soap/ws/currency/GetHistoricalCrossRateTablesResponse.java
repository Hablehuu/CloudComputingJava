
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
 *         &lt;element name="GetHistoricalCrossRateTablesResult" type="{http://www.xignite.com/services/}ArrayOfCrossRateTable" minOccurs="0"/&gt;
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
    "getHistoricalCrossRateTablesResult"
})
@XmlRootElement(name = "GetHistoricalCrossRateTablesResponse")
public class GetHistoricalCrossRateTablesResponse {

    @XmlElement(name = "GetHistoricalCrossRateTablesResult")
    protected ArrayOfCrossRateTable getHistoricalCrossRateTablesResult;

    /**
     * Gets the value of the getHistoricalCrossRateTablesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRateTable }
     *     
     */
    public ArrayOfCrossRateTable getGetHistoricalCrossRateTablesResult() {
        return getHistoricalCrossRateTablesResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRateTablesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRateTable }
     *     
     */
    public void setGetHistoricalCrossRateTablesResult(ArrayOfCrossRateTable value) {
        this.getHistoricalCrossRateTablesResult = value;
    }

}
