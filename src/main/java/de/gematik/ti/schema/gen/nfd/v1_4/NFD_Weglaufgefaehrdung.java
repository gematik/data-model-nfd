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
package de.gematik.ti.schema.gen.nfd.v1_4;

import de.gematik.ti.schema.gen.nfd.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class NFD_Weglaufgefaehrdung  {
    
    public static final String NAMESPACE_PREFIX = "NFD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/NFD_Document/v1.4";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Weglaufgefaehrdung;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Weglaufgefaehrdung_Erlaeuterung;
    
    /*@isSingleAndOptionalValue*/
    
    public NFD_Diagnose_Indikation diagnostiziert_indiziert;
    
    // default Constructor
    public NFD_Weglaufgefaehrdung() {
        
        this.Weglaufgefaehrdung = new String();
        
        this.Weglaufgefaehrdung_Erlaeuterung = new String();
        
        this.diagnostiziert_indiziert = null;
        
    }
    
    // copy Constructor
    public NFD_Weglaufgefaehrdung(NFD_Weglaufgefaehrdung _NFD_Weglaufgefaehrdung) {
        
        this.Weglaufgefaehrdung = _NFD_Weglaufgefaehrdung.Weglaufgefaehrdung;
        this.Weglaufgefaehrdung_Erlaeuterung = _NFD_Weglaufgefaehrdung.Weglaufgefaehrdung_Erlaeuterung;
        this.diagnostiziert_indiziert = _NFD_Weglaufgefaehrdung.diagnostiziert_indiziert;
    }
    
    public static NFD_Weglaufgefaehrdung deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFD_Weglaufgefaehrdung _NFD_Weglaufgefaehrdung = new NFD_Weglaufgefaehrdung();
        
        NodeList nodeListWeglaufgefaehrdung = element.getElementsByTagNameNS(NFD_Weglaufgefaehrdung.NAMESPACE_URI ,"Weglaufgefaehrdung");
        
        if (nodeListWeglaufgefaehrdung.getLength() == 0) {
            _NFD_Weglaufgefaehrdung.Weglaufgefaehrdung = null;
        } else {
            _NFD_Weglaufgefaehrdung.Weglaufgefaehrdung = String.valueOf(((Element) nodeListWeglaufgefaehrdung.item(0)).getTextContent());
        }
        
        NodeList nodeListWeglaufgefaehrdung_Erlaeuterung = element.getElementsByTagNameNS(NFD_Weglaufgefaehrdung.NAMESPACE_URI ,"Weglaufgefaehrdung_Erlaeuterung");
        
        if (nodeListWeglaufgefaehrdung_Erlaeuterung.getLength() == 0) {
            _NFD_Weglaufgefaehrdung.Weglaufgefaehrdung_Erlaeuterung = null;
        } else {
            _NFD_Weglaufgefaehrdung.Weglaufgefaehrdung_Erlaeuterung = String.valueOf(((Element) nodeListWeglaufgefaehrdung_Erlaeuterung.item(0)).getTextContent());
        }
        
        NodeList nodeListdiagnostiziert_indiziert = element.getElementsByTagNameNS(NFD_Diagnose_Indikation.NAMESPACE_URI ,"diagnostiziert_indiziert");
        Node nodediagnostiziert_indiziert = nodeListdiagnostiziert_indiziert.item(0);
        _NFD_Weglaufgefaehrdung.diagnostiziert_indiziert = NFD_Diagnose_Indikation.deserialize(nodediagnostiziert_indiziert);
        
        return _NFD_Weglaufgefaehrdung;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFD_Weglaufgefaehrdung>();
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
        
        elemArray.put("Weglaufgefaehrdung", this.Weglaufgefaehrdung);
        elemArray.put("Weglaufgefaehrdung_Erlaeuterung", this.Weglaufgefaehrdung_Erlaeuterung);
        elemArray.put("diagnostiziert_indiziert", this.diagnostiziert_indiziert);
        
        return elemArray;
    }
}

