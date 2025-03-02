
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockChart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockChart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xignite.com/services/}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Design" type="{http://www.xignite.com/services/}ChartDesign" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockChart", propOrder = {
    "design"
})
@XmlSeeAlso({
    HistoricalChart.class,
    CurrencyChartIntraday.class
})
public class StockChart
    extends Common
{

    @XmlElement(name = "Design")
    protected ChartDesign design;

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDesign }
     *     
     */
    public ChartDesign getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDesign }
     *     
     */
    public void setDesign(ChartDesign value) {
        this.design = value;
    }

}
