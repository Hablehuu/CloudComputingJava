
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
 *         &lt;element name="Symbols" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ColumnHeaderStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineHeaderStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "symbols",
    "columnHeaderStyle",
    "lineHeaderStyle",
    "cellStyle"
})
@XmlRootElement(name = "GetRealTimeCrossRateTableAsHTML")
public class GetRealTimeCrossRateTableAsHTML {

    @XmlElement(name = "Symbols")
    protected String symbols;
    @XmlElement(name = "ColumnHeaderStyle")
    protected String columnHeaderStyle;
    @XmlElement(name = "LineHeaderStyle")
    protected String lineHeaderStyle;
    @XmlElement(name = "CellStyle")
    protected String cellStyle;

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
     * Gets the value of the columnHeaderStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnHeaderStyle() {
        return columnHeaderStyle;
    }

    /**
     * Sets the value of the columnHeaderStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnHeaderStyle(String value) {
        this.columnHeaderStyle = value;
    }

    /**
     * Gets the value of the lineHeaderStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHeaderStyle() {
        return lineHeaderStyle;
    }

    /**
     * Sets the value of the lineHeaderStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHeaderStyle(String value) {
        this.lineHeaderStyle = value;
    }

    /**
     * Gets the value of the cellStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellStyle() {
        return cellStyle;
    }

    /**
     * Sets the value of the cellStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellStyle(String value) {
        this.cellStyle = value;
    }

}
