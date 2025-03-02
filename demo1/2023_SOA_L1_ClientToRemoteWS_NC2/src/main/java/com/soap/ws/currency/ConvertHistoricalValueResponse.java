
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
 *         &lt;element name="ConvertHistoricalValueResult" type="{http://www.xignite.com/services/}ExchangeConversion" minOccurs="0"/&gt;
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
    "convertHistoricalValueResult"
})
@XmlRootElement(name = "ConvertHistoricalValueResponse")
public class ConvertHistoricalValueResponse {

    @XmlElement(name = "ConvertHistoricalValueResult")
    protected ExchangeConversion convertHistoricalValueResult;

    /**
     * Gets the value of the convertHistoricalValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConversion }
     *     
     */
    public ExchangeConversion getConvertHistoricalValueResult() {
        return convertHistoricalValueResult;
    }

    /**
     * Sets the value of the convertHistoricalValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConversion }
     *     
     */
    public void setConvertHistoricalValueResult(ExchangeConversion value) {
        this.convertHistoricalValueResult = value;
    }

}
