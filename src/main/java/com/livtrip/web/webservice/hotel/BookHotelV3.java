
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://schemas.tourico.com/webservices/hotelv3}BookV3Request" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{http://tourico.com/webservices/hotelv3}ArrayOfFeature" minOccurs="0"/&gt;
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
    "request",
    "features"
})
@XmlRootElement(name = "BookHotelV3", namespace = "http://tourico.com/webservices/hotelv3")
public class BookHotelV3 {

    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected BookV3Request request;
    @XmlElement(namespace = "http://tourico.com/webservices/hotelv3")
    protected ArrayOfFeature features;

    /**
     * 获取request属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookV3Request }
     *     
     */
    public BookV3Request getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookV3Request }
     *     
     */
    public void setRequest(BookV3Request value) {
        this.request = value;
    }

    /**
     * 获取features属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeature }
     *     
     */
    public ArrayOfFeature getFeatures() {
        return features;
    }

    /**
     * 设置features属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeature }
     *     
     */
    public void setFeatures(ArrayOfFeature value) {
        this.features = value;
    }

}
