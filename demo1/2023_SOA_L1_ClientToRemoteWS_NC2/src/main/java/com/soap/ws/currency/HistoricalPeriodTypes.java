
package com.soap.ws.currency;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalPeriodTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistoricalPeriodTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HistoricalPeriodTypes")
@XmlEnum
public enum HistoricalPeriodTypes {

    @XmlEnumValue("Daily")
    DAILY("Daily");
    private final String value;

    HistoricalPeriodTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoricalPeriodTypes fromValue(String v) {
        for (HistoricalPeriodTypes c: HistoricalPeriodTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
