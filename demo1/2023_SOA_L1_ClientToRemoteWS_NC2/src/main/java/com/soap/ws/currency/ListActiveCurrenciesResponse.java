
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
 *         &lt;element name="ListActiveCurrenciesResult" type="{http://www.xignite.com/services/}CurrencyList" minOccurs="0"/&gt;
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
    "listActiveCurrenciesResult"
})
@XmlRootElement(name = "ListActiveCurrenciesResponse")
public class ListActiveCurrenciesResponse {

    @XmlElement(name = "ListActiveCurrenciesResult")
    protected CurrencyList listActiveCurrenciesResult;

    /**
     * Gets the value of the listActiveCurrenciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyList }
     *     
     */
    public CurrencyList getListActiveCurrenciesResult() {
        return listActiveCurrenciesResult;
    }

    /**
     * Sets the value of the listActiveCurrenciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyList }
     *     
     */
    public void setListActiveCurrenciesResult(CurrencyList value) {
        this.listActiveCurrenciesResult = value;
    }

}
