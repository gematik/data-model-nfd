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
public class NFDM_Kommunikationsdaten  {
    
    public static final String NAMESPACE_PREFIX = "NFDM";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/common/NFDM_Common/v1.0";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Telefonnummer;
    
    /*@isSingleAndOptionalValue*/
    
    public String Faxnummer;
    
    /*@isSingleAndOptionalValue*/
    
    public String EMail;
    
    // default Constructor
    public NFDM_Kommunikationsdaten() {
        
        this.Telefonnummer = new String();
        
        this.Faxnummer = null;
        
        this.EMail = null;
        
    }
    
    // copy Constructor
    public NFDM_Kommunikationsdaten(NFDM_Kommunikationsdaten _NFDM_Kommunikationsdaten) {
        
        this.Telefonnummer = _NFDM_Kommunikationsdaten.Telefonnummer;
        this.Faxnummer = _NFDM_Kommunikationsdaten.Faxnummer;
        this.EMail = _NFDM_Kommunikationsdaten.EMail;
    }
    
    public static NFDM_Kommunikationsdaten deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFDM_Kommunikationsdaten _NFDM_Kommunikationsdaten = new NFDM_Kommunikationsdaten();
        
        NodeList nodeListTelefonnummer = element.getElementsByTagNameNS(NFDM_Kommunikationsdaten.NAMESPACE_URI ,"Telefonnummer");
        
        if (nodeListTelefonnummer.getLength() == 0) {
            _NFDM_Kommunikationsdaten.Telefonnummer = null;
        } else {
            _NFDM_Kommunikationsdaten.Telefonnummer = String.valueOf(((Element) nodeListTelefonnummer.item(0)).getTextContent());
        }
        
        NodeList nodeListFaxnummer = element.getElementsByTagNameNS(NFDM_Kommunikationsdaten.NAMESPACE_URI ,"Faxnummer");
        
        if (nodeListFaxnummer.getLength() == 0) {
            _NFDM_Kommunikationsdaten.Faxnummer = null;
        } else {
            _NFDM_Kommunikationsdaten.Faxnummer = String.valueOf(((Element) nodeListFaxnummer.item(0)).getTextContent());
        }
        
        NodeList nodeListEMail = element.getElementsByTagNameNS(NFDM_Kommunikationsdaten.NAMESPACE_URI ,"E-Mail");
        
        if (nodeListEMail.getLength() == 0) {
            _NFDM_Kommunikationsdaten.EMail = null;
        } else {
            _NFDM_Kommunikationsdaten.EMail = String.valueOf(((Element) nodeListEMail.item(0)).getTextContent());
        }
        
        return _NFDM_Kommunikationsdaten;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFDM_Kommunikationsdaten>();
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
        
        return attributesDict;
    }
    
    /**
    * Returns a LinkedHashMap of the elements. LinkedHashMap is used as a workaround to provide the needed
    * functionality of a ordered array of tuples.
    */
    public LinkedHashMap<String, Object> getElements() {
        LinkedHashMap<String, Object> elemArray = new LinkedHashMap<>();
        
        elemArray.put("Telefonnummer", this.Telefonnummer);
        elemArray.put("Faxnummer", this.Faxnummer);
        elemArray.put("EMail", this.EMail);
        
        return elemArray;
    }
}

