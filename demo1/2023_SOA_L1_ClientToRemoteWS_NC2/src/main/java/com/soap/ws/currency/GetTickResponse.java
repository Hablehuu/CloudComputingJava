
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
 *         &lt;element name="GetTickResult" type="{http://www.xignite.com/services/}SingleTick" minOccurs="0"/&gt;
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
    "getTickResult"
})
@XmlRootElement(name = "GetTickResponse")
public class GetTickResponse {

    @XmlElement(name = "GetTickResult")
    protected SingleTick getTickResult;

    /**
     * Gets the value of the getTickResult property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTick }
     *     
     */
    public SingleTick getGetTickResult() {
        return getTickResult;
    }

    /**
     * Sets the value of the getTickResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTick }
     *     
     */
    public void setGetTickResult(SingleTick value) {
        this.getTickResult = value;
    }

}
