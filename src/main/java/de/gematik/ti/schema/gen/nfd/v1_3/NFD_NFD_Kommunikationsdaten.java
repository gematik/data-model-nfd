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
public class NFD_NFD_Kommunikationsdaten  {
    
    public static final String NAMESPACE_PREFIX = "NFD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/NFD_Document/v1.3";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public NFDM_Kommunikationsdaten Kommunikationsdaten;
    
    // default Constructor
    public NFD_NFD_Kommunikationsdaten() {
        
        this.Kommunikationsdaten = new NFDM_Kommunikationsdaten();
        
    }
    
    // copy Constructor
    public NFD_NFD_Kommunikationsdaten(NFD_NFD_Kommunikationsdaten _NFD_NFD_Kommunikationsdaten) {
        
        this.Kommunikationsdaten = _NFD_NFD_Kommunikationsdaten.Kommunikationsdaten;
    }
    
    public static NFD_NFD_Kommunikationsdaten deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFD_NFD_Kommunikationsdaten _NFD_NFD_Kommunikationsdaten = new NFD_NFD_Kommunikationsdaten();
        
        NodeList nodeListKommunikationsdaten = element.getElementsByTagNameNS(NFDM_Kommunikationsdaten.NAMESPACE_URI ,"Kommunikationsdaten");
        Node nodeKommunikationsdaten = nodeListKommunikationsdaten.item(0);
        _NFD_NFD_Kommunikationsdaten.Kommunikationsdaten = NFDM_Kommunikationsdaten.deserialize(nodeKommunikationsdaten);
        
        return _NFD_NFD_Kommunikationsdaten;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFD_NFD_Kommunikationsdaten>();
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
        
        elemArray.put("Kommunikationsdaten", this.Kommunikationsdaten);
        
        return elemArray;
    }
}

