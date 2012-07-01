
package com.mulesoft.wcfconsumer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="order" type="{http://schemas.datacontract.org/2004/07/wcfmule}Order" minOccurs="0"/>
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
    "order"
})
@XmlRootElement(name = "CreateOrder", namespace = "http://tempuri.org/")
public class CreateOrder {

    @XmlElementRef(name = "order", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Order> order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Order }{@code >}
     *     
     */
    public JAXBElement<Order> getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Order }{@code >}
     *     
     */
    public void setOrder(JAXBElement<Order> value) {
        this.order = ((JAXBElement<Order> ) value);
    }

}
