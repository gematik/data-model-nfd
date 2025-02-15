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
public class NFD_Diagnosen  {
    
    public static final String NAMESPACE_PREFIX = "NFD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/NFD_Document/v1.4";
    
    // attributes:
    
    // elements:
    /*@isSingleAndOptionalValue*/
    
    public String Diagnose_Code;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Diagnose_Text;
    
    /*@isSingleAndOptionalValue*/
    
    public String Diagnose_Zeitpunkt;
    
    /*@isSingleAndOptionalValue*/
    
    public NFD_DiagnosesicherheitEnum Diagnosesicherheit;
    
    /*@isSingleAndOptionalValue*/
    
    public NFD_SeitenlokalisationEnum Seitenlokalisation;
    
    /*@isSingleAndOptionalValue*/
    
    public NFD_Diagnose_Code_System Diagnose_Code_System;
    
    /*@isSingleAndOptionalValue*/
    
    public NFD_Diagnose_Indikation diagnostiziert_indiziert;
    
    // default Constructor
    public NFD_Diagnosen() {
        
        this.Diagnose_Code = null;
        
        this.Diagnose_Text = new String();
        
        this.Diagnose_Zeitpunkt = null;
        
        this.Diagnosesicherheit = null;
        
        this.Seitenlokalisation = null;
        
        this.Diagnose_Code_System = null;
        
        this.diagnostiziert_indiziert = null;
        
    }
    
    // copy Constructor
    public NFD_Diagnosen(NFD_Diagnosen _NFD_Diagnosen) {
        
        this.Diagnose_Code = _NFD_Diagnosen.Diagnose_Code;
        this.Diagnose_Text = _NFD_Diagnosen.Diagnose_Text;
        this.Diagnose_Zeitpunkt = _NFD_Diagnosen.Diagnose_Zeitpunkt;
        this.Diagnosesicherheit = _NFD_Diagnosen.Diagnosesicherheit;
        this.Seitenlokalisation = _NFD_Diagnosen.Seitenlokalisation;
        this.Diagnose_Code_System = _NFD_Diagnosen.Diagnose_Code_System;
        this.diagnostiziert_indiziert = _NFD_Diagnosen.diagnostiziert_indiziert;
    }
    
    public static NFD_Diagnosen deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        NFD_Diagnosen _NFD_Diagnosen = new NFD_Diagnosen();
        
        NodeList nodeListDiagnose_Code = element.getElementsByTagNameNS(NFD_Diagnosen.NAMESPACE_URI ,"Diagnose_Code");
        
        if (nodeListDiagnose_Code.getLength() == 0) {
            _NFD_Diagnosen.Diagnose_Code = null;
        } else {
            _NFD_Diagnosen.Diagnose_Code = String.valueOf(((Element) nodeListDiagnose_Code.item(0)).getTextContent());
        }
        
        NodeList nodeListDiagnose_Text = element.getElementsByTagNameNS(NFD_Diagnosen.NAMESPACE_URI ,"Diagnose_Text");
        
        if (nodeListDiagnose_Text.getLength() == 0) {
            _NFD_Diagnosen.Diagnose_Text = null;
        } else {
            _NFD_Diagnosen.Diagnose_Text = String.valueOf(((Element) nodeListDiagnose_Text.item(0)).getTextContent());
        }
        
        NodeList nodeListDiagnose_Zeitpunkt = element.getElementsByTagNameNS(NFD_Diagnosen.NAMESPACE_URI ,"Diagnose_Zeitpunkt");
        
        if (nodeListDiagnose_Zeitpunkt.getLength() == 0) {
            _NFD_Diagnosen.Diagnose_Zeitpunkt = null;
        } else {
            _NFD_Diagnosen.Diagnose_Zeitpunkt = String.valueOf(((Element) nodeListDiagnose_Zeitpunkt.item(0)).getTextContent());
        }
        
        NodeList nodeListDiagnosesicherheit = element.getElementsByTagNameNS(NFD_Diagnosen.NAMESPACE_URI ,"Diagnosesicherheit");
        
        // element is optional, so check for existence
        if (nodeListDiagnosesicherheit.getLength() == 0) {
            _NFD_Diagnosen.Diagnosesicherheit = null;
        } else {
            Node nodeDiagnosesicherheit = nodeListDiagnosesicherheit.item(0);
            _NFD_Diagnosen.Diagnosesicherheit = NFD_DiagnosesicherheitEnum.deserialize(nodeDiagnosesicherheit);
        }
        
        NodeList nodeListSeitenlokalisation = element.getElementsByTagNameNS(NFD_Diagnosen.NAMESPACE_URI ,"Seitenlokalisation");
        
        // element is optional, so check for existence
        if (nodeListSeitenlokalisation.getLength() == 0) {
            _NFD_Diagnosen.Seitenlokalisation = null;
        } else {
            Node nodeSeitenlokalisation = nodeListSeitenlokalisation.item(0);
            _NFD_Diagnosen.Seitenlokalisation = NFD_SeitenlokalisationEnum.deserialize(nodeSeitenlokalisation);
        }
        
        NodeList nodeListDiagnose_Code_System = element.getElementsByTagNameNS(NFD_Diagnose_Code_System.NAMESPACE_URI ,"Diagnose_Code_System");
        Node nodeDiagnose_Code_System = nodeListDiagnose_Code_System.item(0);
        _NFD_Diagnosen.Diagnose_Code_System = NFD_Diagnose_Code_System.deserialize(nodeDiagnose_Code_System);
        
        NodeList nodeListdiagnostiziert_indiziert = element.getElementsByTagNameNS(NFD_Diagnose_Indikation.NAMESPACE_URI ,"diagnostiziert_indiziert");
        Node nodediagnostiziert_indiziert = nodeListdiagnostiziert_indiziert.item(0);
        _NFD_Diagnosen.diagnostiziert_indiziert = NFD_Diagnose_Indikation.deserialize(nodediagnostiziert_indiziert);
        
        return _NFD_Diagnosen;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFD_Diagnosen>();
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
        
        elemArray.put("Diagnose_Code", this.Diagnose_Code);
        elemArray.put("Diagnose_Text", this.Diagnose_Text);
        elemArray.put("Diagnose_Zeitpunkt", this.Diagnose_Zeitpunkt);
        elemArray.put("Diagnosesicherheit", this.Diagnosesicherheit);
        elemArray.put("Seitenlokalisation", this.Seitenlokalisation);
        elemArray.put("Diagnose_Code_System", this.Diagnose_Code_System);
        elemArray.put("diagnostiziert_indiziert", this.diagnostiziert_indiziert);
        
        return elemArray;
    }
}

