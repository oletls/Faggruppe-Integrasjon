
package com.embriq.webservice.posten;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postalPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postalPlace"
})
@XmlRootElement(name = "GetPostalPlaceByPostalCodeResponse", namespace = "http://posten.no/enterprise/letterservice/getpostalplacebypostalcode_v1")
public class GetPostalPlaceByPostalCodeResponse {

    @XmlElement(required = true)
    protected String postalPlace;

    /**
     * Gets the value of the postalPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalPlace() {
        return postalPlace;
    }

    /**
     * Sets the value of the postalPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalPlace(String value) {
        this.postalPlace = value;
    }

}
