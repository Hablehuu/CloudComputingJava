
package com.soap.ws.currency;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrossRateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrossRateItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrossRateItem" type="{http://www.xignite.com/services/}CrossRateItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrossRateItem", propOrder = {
    "crossRateItem"
})
public class ArrayOfCrossRateItem {

    @XmlElement(name = "CrossRateItem", nillable = true)
    protected List<CrossRateItem> crossRateItem;

    /**
     * Gets the value of the crossRateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossRateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossRateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossRateItem }
     * 
     * 
     */
    public List<CrossRateItem> getCrossRateItem() {
        if (crossRateItem == null) {
            crossRateItem = new ArrayList<CrossRateItem>();
        }
        return this.crossRateItem;
    }

}
