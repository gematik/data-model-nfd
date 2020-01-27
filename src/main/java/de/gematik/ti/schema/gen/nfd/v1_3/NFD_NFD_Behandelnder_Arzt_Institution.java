/*
* Copyright (c) 2020 gematik GmbH
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*    http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

//
//  This is a generated file, do not edit.
//  This file was generated from an xsd file and represents a simple or complex type of it.
//  Generated by a fork of xsd2cocoa (see https://github.com/Daij-Djan/xsd2cocoa) and a specified custom transform template.
//
package de.gematik.ti.schema.gen.nfd.v1_3;

import de.gematik.ti.schema.gen.nfd.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class NFD_NFD_Behandelnder_Arzt_Institution  {
    
    public static final String NAMESPACE_PREFIX = "NFD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/NFD_Document/v1.3";
    
    // attributes:
    /*@isRequired*/
    public String BAI_Art;
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String NFD_BAI_Arzt_Nachname;
    
    /*@isSingleAndOptionalValue*/
    
    public String NFD_BAI_Arzt_Vorname;
    
    /*@isSingleAndOptionalValue*/
    
    public String NFD_BAI_Institution_Bezeichnung;
    
    /*@isSingleAndOptionalValue*/
    
    public String NFD_BAI_Arzt_Bezeichnung;
    
    /*@isSingleAndOptionalValue*/
    
    public NFD_NFD_Adresse NFD_BAI_Adresse;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public List<NFD_NFD_Kommunikationsdaten> NFD_BAI_Kommunikation;
    
    // default Constructor
    public NFD_NFD_Behandelnder_Arzt_Institution() {
        
        this.BAI_Art = new String();
        
        this.NFD_BAI_Arzt_Nachname = new String();
        
        this.NFD_BAI_Arzt_Vorname = null;
        
        this.NFD_BAI_Institution_Bezeichnung = null;
        
        this.NFD_BAI_Arzt_Bezeichnung = null;
        
        this.NFD_BAI_Adresse = null;
        
        this.NFD_BAI_Kommunikation = new ArrayList<NFD_NFD_Kommunikationsdaten>();
        
    }
    
    // copy Constructor
    public NFD_NFD_Behandelnder_Arzt_Institution(NFD_NFD_Behandelnder_Arzt_Institution _NFD_NFD_Behandelnder_Arzt_Institution) {
        
        this.BAI_Art = _NFD_NFD_Behandelnder_Arzt_Institution.BAI_Art;
        
        this.NFD_BAI_Arzt_Nachname = _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Nachname;
        this.NFD_BAI_Arzt_Vorname = _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Vorname;
        this.NFD_BAI_Institution_Bezeichnung = _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Institution_Bezeichnung;
        this.NFD_BAI_Arzt_Bezeichnung = _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Bezeichnung;
        this.NFD_BAI_Adresse = _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Adresse;
        this.NFD_BAI_Kommunikation = _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Kommunikation;
    }
    
    public static NFD_NFD_Behandelnder_Arzt_Institution deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFD_NFD_Behandelnder_Arzt_Institution _NFD_NFD_Behandelnder_Arzt_Institution = new NFD_NFD_Behandelnder_Arzt_Institution();
        
        _NFD_NFD_Behandelnder_Arzt_Institution.BAI_Art = element.getAttributeNode("BAI_Art") != null ? element.getAttributeNode("BAI_Art").getValue() : null;
        
        NodeList nodeListNFD_BAI_Arzt_Nachname = element.getElementsByTagNameNS(NFD_NFD_Behandelnder_Arzt_Institution.NAMESPACE_URI ,"NFD_BAI_Arzt_Nachname");
        
        if (nodeListNFD_BAI_Arzt_Nachname.getLength() == 0) {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Nachname = null;
        } else {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Nachname = String.valueOf(((Element) nodeListNFD_BAI_Arzt_Nachname.item(0)).getTextContent());
        }
        
        NodeList nodeListNFD_BAI_Arzt_Vorname = element.getElementsByTagNameNS(NFD_NFD_Behandelnder_Arzt_Institution.NAMESPACE_URI ,"NFD_BAI_Arzt_Vorname");
        
        if (nodeListNFD_BAI_Arzt_Vorname.getLength() == 0) {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Vorname = null;
        } else {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Vorname = String.valueOf(((Element) nodeListNFD_BAI_Arzt_Vorname.item(0)).getTextContent());
        }
        
        NodeList nodeListNFD_BAI_Institution_Bezeichnung = element.getElementsByTagNameNS(NFD_NFD_Behandelnder_Arzt_Institution.NAMESPACE_URI ,"NFD_BAI_Institution_Bezeichnung");
        
        if (nodeListNFD_BAI_Institution_Bezeichnung.getLength() == 0) {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Institution_Bezeichnung = null;
        } else {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Institution_Bezeichnung = String.valueOf(((Element) nodeListNFD_BAI_Institution_Bezeichnung.item(0)).getTextContent());
        }
        
        NodeList nodeListNFD_BAI_Arzt_Bezeichnung = element.getElementsByTagNameNS(NFD_NFD_Behandelnder_Arzt_Institution.NAMESPACE_URI ,"NFD_BAI_Arzt_Bezeichnung");
        
        if (nodeListNFD_BAI_Arzt_Bezeichnung.getLength() == 0) {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Bezeichnung = null;
        } else {
            _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Arzt_Bezeichnung = String.valueOf(((Element) nodeListNFD_BAI_Arzt_Bezeichnung.item(0)).getTextContent());
        }
        
        NodeList nodeListNFD_BAI_Adresse = element.getElementsByTagNameNS(NFD_NFD_Adresse.NAMESPACE_URI ,"NFD_BAI_Adresse");
        Node nodeNFD_BAI_Adresse = nodeListNFD_BAI_Adresse.item(0);
        _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Adresse = NFD_NFD_Adresse.deserialize(nodeNFD_BAI_Adresse);
        
        List<Node> nodeListNFD_BAI_Kommunikation = Utils.getChildrenWithName(element, NFD_NFD_Kommunikationsdaten.NAMESPACE_URI, "NFD_BAI_Kommunikation");
        _NFD_NFD_Behandelnder_Arzt_Institution.NFD_BAI_Kommunikation = NFD_NFD_Kommunikationsdaten.deserializeToList(nodeListNFD_BAI_Kommunikation);
        
        return _NFD_NFD_Behandelnder_Arzt_Institution;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFD_NFD_Behandelnder_Arzt_Institution>();
        for( Node node : nodeList) {
            result.add(deserialize(node));
        }
        return result;
    }
    
    /**
    * Returns a map of attributes
    */
    public Map<String, Object> getAttributes() {
        HashMap<String, Object> attributesDict = new HashMap<>();
        
        attributesDict.put("BAI_Art", this.BAI_Art);
        
        return attributesDict;
    }
    
    /**
    * Returns a LinkedHashMap of the elements. LinkedHashMap is used as a workaround to provide the needed
    * functionality of a ordered array of tuples.
    */
    public LinkedHashMap<String, Object> getElements() {
        LinkedHashMap<String, Object> elemArray = new LinkedHashMap<>();
        
        elemArray.put("NFD_BAI_Arzt_Nachname", this.NFD_BAI_Arzt_Nachname);
        elemArray.put("NFD_BAI_Arzt_Vorname", this.NFD_BAI_Arzt_Vorname);
        elemArray.put("NFD_BAI_Institution_Bezeichnung", this.NFD_BAI_Institution_Bezeichnung);
        elemArray.put("NFD_BAI_Arzt_Bezeichnung", this.NFD_BAI_Arzt_Bezeichnung);
        elemArray.put("NFD_BAI_Adresse", this.NFD_BAI_Adresse);
        elemArray.put("NFD_BAI_Kommunikation", this.NFD_BAI_Kommunikation);
        
        return elemArray;
    }
}

