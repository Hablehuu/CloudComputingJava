
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRateChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRateChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xignite.com/services/}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}QuoteTypes"/&gt;
 *         &lt;element name="From" type="{http://www.xignite.com/services/}Currency" minOccurs="0"/&gt;
 *         &lt;element name="To" type="{http://www.xignite.com/services/}Currency" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Changes" type="{http://www.xignite.com/services/}ArrayOfChange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRateChange", propOrder = {
    "symbol",
    "type",
    "from",
    "to",
    "date",
    "time",
    "rate",
    "bid",
    "ask",
    "changes"
})
public class CrossRateChange
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected QuoteTypes type;
    @XmlElement(name = "From")
    protected Currency from;
    @XmlElement(name = "To")
    protected Currency to;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Rate")
    protected double rate;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "Changes")
    protected ArrayOfChange changes;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteTypes }
     *     
     */
    public QuoteTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteTypes }
     *     
     */
    public void setType(QuoteTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setFrom(Currency value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTo(Currency value) {
        this.to = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(double value) {
        this.rate = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     */
    public double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     */
    public void setBid(double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     */
    public double getAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     */
    public void setAsk(double value) {
        this.ask = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChange }
     *     
     */
    public ArrayOfChange getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChange }
     *     
     */
    public void setChanges(ArrayOfChange value) {
        this.changes = value;
    }

}
