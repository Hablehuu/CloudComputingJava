
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
 *         &lt;element name="ListOfficialRatesResult" type="{http://www.xignite.com/services/}OfficialRates" minOccurs="0"/&gt;
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
    "listOfficialRatesResult"
})
@XmlRootElement(name = "ListOfficialRatesResponse")
public class ListOfficialRatesResponse {

    @XmlElement(name = "ListOfficialRatesResult")
    protected OfficialRates listOfficialRatesResult;

    /**
     * Gets the value of the listOfficialRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link OfficialRates }
     *     
     */
    public OfficialRates getListOfficialRatesResult() {
        return listOfficialRatesResult;
    }

    /**
     * Sets the value of the listOfficialRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficialRates }
     *     
     */
    public void setListOfficialRatesResult(OfficialRates value) {
        this.listOfficialRatesResult = value;
    }

}
