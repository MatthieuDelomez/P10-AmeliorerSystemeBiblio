
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchBook complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomouvrage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBook", propOrder = {
    "nomouvrage"
})
public class SearchBook {

    protected String nomouvrage;

    /**
     * Obtient la valeur de la propriété nomouvrage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomouvrage() {
        return nomouvrage;
    }

    /**
     * Définit la valeur de la propriété nomouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomouvrage(String value) {
        this.nomouvrage = value;
    }

}
