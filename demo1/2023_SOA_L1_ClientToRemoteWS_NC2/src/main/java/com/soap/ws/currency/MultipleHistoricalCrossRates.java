
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleHistoricalCrossRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleHistoricalCrossRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xignite.com/services/}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoricalCrossRates" type="{http://www.xignite.com/services/}ArrayOfFullHistoricalCrossRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleHistoricalCrossRates", propOrder = {
    "historicalCrossRates"
})
public class MultipleHistoricalCrossRates
    extends Common
{

    @XmlElement(name = "HistoricalCrossRates")
    protected ArrayOfFullHistoricalCrossRate historicalCrossRates;

    /**
     * Gets the value of the historicalCrossRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFullHistoricalCrossRate }
     *     
     */
    public ArrayOfFullHistoricalCrossRate getHistoricalCrossRates() {
        return historicalCrossRates;
    }

    /**
     * Sets the value of the historicalCrossRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFullHistoricalCrossRate }
     *     
     */
    public void setHistoricalCrossRates(ArrayOfFullHistoricalCrossRate value) {
        this.historicalCrossRates = value;
    }

}
