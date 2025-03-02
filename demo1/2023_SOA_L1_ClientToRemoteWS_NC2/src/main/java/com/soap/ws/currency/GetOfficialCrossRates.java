
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CountryType" type="{http://www.xignite.com/services/}CountryTypes"/&gt;
 *         &lt;element name="Symbols" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "countryType",
    "symbols",
    "asOfDate"
})
@XmlRootElement(name = "GetOfficialCrossRates")
public class GetOfficialCrossRates {

    @XmlElement(name = "CountryType", required = true)
    @XmlSchemaType(name = "string")
    protected CountryTypes countryType;
    @XmlElement(name = "Symbols")
    protected String symbols;
    @XmlElement(name = "AsOfDate")
    protected String asOfDate;

    /**
     * Gets the value of the countryType property.
     * 
     * @return
     *     possible object is
     *     {@link CountryTypes }
     *     
     */
    public CountryTypes getCountryType() {
        return countryType;
    }

    /**
     * Sets the value of the countryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryTypes }
     *     
     */
    public void setCountryType(CountryTypes value) {
        this.countryType = value;
    }

    /**
     * Gets the value of the symbols property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbols() {
        return symbols;
    }

    /**
     * Sets the value of the symbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbols(String value) {
        this.symbols = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(String value) {
        this.asOfDate = value;
    }

}
