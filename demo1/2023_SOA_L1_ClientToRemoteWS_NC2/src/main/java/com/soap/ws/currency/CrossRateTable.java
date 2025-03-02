
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRateTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRateTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xignite.com/services/}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lines" type="{http://www.xignite.com/services/}ArrayOfCrossRateTableLine" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRateTable", propOrder = {
    "lines"
})
public class CrossRateTable
    extends Common
{

    @XmlElement(name = "Lines")
    protected ArrayOfCrossRateTableLine lines;

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRateTableLine }
     *     
     */
    public ArrayOfCrossRateTableLine getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRateTableLine }
     *     
     */
    public void setLines(ArrayOfCrossRateTableLine value) {
        this.lines = value;
    }

}
