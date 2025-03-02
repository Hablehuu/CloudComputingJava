
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
 *         &lt;element name="GetChartDesignResult" type="{http://www.xignite.com/services/}ChartDesign" minOccurs="0"/&gt;
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
    "getChartDesignResult"
})
@XmlRootElement(name = "GetChartDesignResponse")
public class GetChartDesignResponse {

    @XmlElement(name = "GetChartDesignResult")
    protected ChartDesign getChartDesignResult;

    /**
     * Gets the value of the getChartDesignResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDesign }
     *     
     */
    public ChartDesign getGetChartDesignResult() {
        return getChartDesignResult;
    }

    /**
     * Sets the value of the getChartDesignResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDesign }
     *     
     */
    public void setGetChartDesignResult(ChartDesign value) {
        this.getChartDesignResult = value;
    }

}
