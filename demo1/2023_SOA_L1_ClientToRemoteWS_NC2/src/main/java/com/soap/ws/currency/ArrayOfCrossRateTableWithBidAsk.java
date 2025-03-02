
package com.soap.ws.currency;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrossRateTableWithBidAsk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrossRateTableWithBidAsk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrossRateTableWithBidAsk" type="{http://www.xignite.com/services/}CrossRateTableWithBidAsk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrossRateTableWithBidAsk", propOrder = {
    "crossRateTableWithBidAsk"
})
public class ArrayOfCrossRateTableWithBidAsk {

    @XmlElement(name = "CrossRateTableWithBidAsk", nillable = true)
    protected List<CrossRateTableWithBidAsk> crossRateTableWithBidAsk;

    /**
     * Gets the value of the crossRateTableWithBidAsk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossRateTableWithBidAsk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossRateTableWithBidAsk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossRateTableWithBidAsk }
     * 
     * 
     */
    public List<CrossRateTableWithBidAsk> getCrossRateTableWithBidAsk() {
        if (crossRateTableWithBidAsk == null) {
            crossRateTableWithBidAsk = new ArrayList<CrossRateTableWithBidAsk>();
        }
        return this.crossRateTableWithBidAsk;
    }

}
