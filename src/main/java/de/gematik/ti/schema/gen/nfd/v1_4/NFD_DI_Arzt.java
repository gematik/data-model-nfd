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
public class NFD_DI_Arzt  {
    
    public static final String NAMESPACE_PREFIX = "NFD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/NFD_Document/v1.4";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DI_Arzt_Name;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DI_Arzt_Fachgebiet;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DI_Arzt_Ort;
    
    // default Constructor
    public NFD_DI_Arzt() {
        
        this.DI_Arzt_Name = new String();
        
        this.DI_Arzt_Fachgebiet = new String();
        
        this.DI_Arzt_Ort = new String();
        
    }
    
    // copy Constructor
    public NFD_DI_Arzt(NFD_DI_Arzt _NFD_DI_Arzt) {
        
        this.DI_Arzt_Name = _NFD_DI_Arzt.DI_Arzt_Name;
        this.DI_Arzt_Fachgebiet = _NFD_DI_Arzt.DI_Arzt_Fachgebiet;
        this.DI_Arzt_Ort = _NFD_DI_Arzt.DI_Arzt_Ort;
    }
    
    public static NFD_DI_Arzt deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFD_DI_Arzt _NFD_DI_Arzt = new NFD_DI_Arzt();
        
        NodeList nodeListDI_Arzt_Name = element.getElementsByTagNameNS(NFD_DI_Arzt.NAMESPACE_URI ,"DI_Arzt_Name");
        
        if (nodeListDI_Arzt_Name.getLength() == 0) {
            _NFD_DI_Arzt.DI_Arzt_Name = null;
        } else {
            _NFD_DI_Arzt.DI_Arzt_Name = String.valueOf(((Element) nodeListDI_Arzt_Name.item(0)).getTextContent());
        }
        
        NodeList nodeListDI_Arzt_Fachgebiet = element.getElementsByTagNameNS(NFD_DI_Arzt.NAMESPACE_URI ,"DI_Arzt_Fachgebiet");
        
        if (nodeListDI_Arzt_Fachgebiet.getLength() == 0) {
            _NFD_DI_Arzt.DI_Arzt_Fachgebiet = null;
        } else {
            _NFD_DI_Arzt.DI_Arzt_Fachgebiet = String.valueOf(((Element) nodeListDI_Arzt_Fachgebiet.item(0)).getTextContent());
        }
        
        NodeList nodeListDI_Arzt_Ort = element.getElementsByTagNameNS(NFD_DI_Arzt.NAMESPACE_URI ,"DI_Arzt_Ort");
        
        if (nodeListDI_Arzt_Ort.getLength() == 0) {
            _NFD_DI_Arzt.DI_Arzt_Ort = null;
        } else {
            _NFD_DI_Arzt.DI_Arzt_Ort = String.valueOf(((Element) nodeListDI_Arzt_Ort.item(0)).getTextContent());
        }
        
        return _NFD_DI_Arzt;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFD_DI_Arzt>();
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
        
        elemArray.put("DI_Arzt_Name", this.DI_Arzt_Name);
        elemArray.put("DI_Arzt_Fachgebiet", this.DI_Arzt_Fachgebiet);
        elemArray.put("DI_Arzt_Ort", this.DI_Arzt_Ort);
        
        return elemArray;
    }
}

