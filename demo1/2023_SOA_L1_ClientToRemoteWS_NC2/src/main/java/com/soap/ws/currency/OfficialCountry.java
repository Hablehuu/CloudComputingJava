
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficialCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficialCountry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficialCurrencies" type="{http://www.xignite.com/services/}ArrayOfOfficialCurrency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficialCountry", propOrder = {
    "country",
    "officialCurrencies"
})
public class OfficialCountry {

    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "OfficialCurrencies")
    protected ArrayOfOfficialCurrency officialCurrencies;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the officialCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfficialCurrency }
     *     
     */
    public ArrayOfOfficialCurrency getOfficialCurrencies() {
        return officialCurrencies;
    }

    /**
     * Sets the value of the officialCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfficialCurrency }
     *     
     */
    public void setOfficialCurrencies(ArrayOfOfficialCurrency value) {
        this.officialCurrencies = value;
    }

}
