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
public class NFD_NFD_Befunddaten  {
    
    public static final String NAMESPACE_PREFIX = "NFD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/NFD_Document/v1.3";
    
    // attributes:
    
    // elements:
    /*@isSingleAndOptionalValue*/
    
    public NFD_Besondere_Hinweise Besondere_Hinweise;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public List<NFD_Allergien_Unvertraeglichkeiten> Allergien_Unvertraeglichkeiten;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public List<NFD_Diagnosen> Diagnosen;
    
    // default Constructor
    public NFD_NFD_Befunddaten() {
        
        this.Besondere_Hinweise = null;
        
        this.Allergien_Unvertraeglichkeiten = new ArrayList<NFD_Allergien_Unvertraeglichkeiten>();
        
        this.Diagnosen = new ArrayList<NFD_Diagnosen>();
        
    }
    
    // copy Constructor
    public NFD_NFD_Befunddaten(NFD_NFD_Befunddaten _NFD_NFD_Befunddaten) {
        
        this.Besondere_Hinweise = _NFD_NFD_Befunddaten.Besondere_Hinweise;
        this.Allergien_Unvertraeglichkeiten = _NFD_NFD_Befunddaten.Allergien_Unvertraeglichkeiten;
        this.Diagnosen = _NFD_NFD_Befunddaten.Diagnosen;
    }
    
    public static NFD_NFD_Befunddaten deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFD_NFD_Befunddaten _NFD_NFD_Befunddaten = new NFD_NFD_Befunddaten();
        
        NodeList nodeListBesondere_Hinweise = element.getElementsByTagNameNS(NFD_Besondere_Hinweise.NAMESPACE_URI ,"Besondere_Hinweise");
        Node nodeBesondere_Hinweise = nodeListBesondere_Hinweise.item(0);
        _NFD_NFD_Befunddaten.Besondere_Hinweise = NFD_Besondere_Hinweise.deserialize(nodeBesondere_Hinweise);
        
        List<Node> nodeListAllergien_Unvertraeglichkeiten = Utils.getChildrenWithName(element, NFD_Allergien_Unvertraeglichkeiten.NAMESPACE_URI, "Allergien_Unvertraeglichkeiten");
        _NFD_NFD_Befunddaten.Allergien_Unvertraeglichkeiten = NFD_Allergien_Unvertraeglichkeiten.deserializeToList(nodeListAllergien_Unvertraeglichkeiten);
        
        List<Node> nodeListDiagnosen = Utils.getChildrenWithName(element, NFD_Diagnosen.NAMESPACE_URI, "Diagnosen");
        _NFD_NFD_Befunddaten.Diagnosen = NFD_Diagnosen.deserializeToList(nodeListDiagnosen);
        
        return _NFD_NFD_Befunddaten;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFD_NFD_Befunddaten>();
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
        
        elemArray.put("Besondere_Hinweise", this.Besondere_Hinweise);
        elemArray.put("Allergien_Unvertraeglichkeiten", this.Allergien_Unvertraeglichkeiten);
        elemArray.put("Diagnosen", this.Diagnosen);
        
        return elemArray;
    }
}

