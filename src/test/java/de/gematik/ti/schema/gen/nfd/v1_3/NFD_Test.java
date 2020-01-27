package de.gematik.ti.schema.gen.nfd.v1_3;

import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class NFD_Test {

    @Test
    public void testXmlToClassDeserialize() {

        URL url = Thread.currentThread().getContextClassLoader().getResource("nfd_v1_3.xml");
        File file = new File(url.getPath());

        //Read and Parse
        Document doc = null;
        NFD_NFD_Document nfdDocument = null;
        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            dbfactory.setNamespaceAware(true);
            DocumentBuilder builder = dbfactory.newDocumentBuilder();

            doc = builder.parse(file);
            nfdDocument = NFD_NFD_Document.deserialize(doc.getDocumentElement());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // test for attributes
        Assert.assertEquals("0.0.0", nfdDocument.NFD_Version);
        Assert.assertEquals("ID1", nfdDocument.Notfalldaten.ID);

        // test for value in different namespace
        Assert.assertEquals("A000000000", nfdDocument.Notfalldaten.NFD_Versicherter.Versicherter.Versicherten_ID);

        // test for multiple occurring values / arrays
        List<NFD_Implantate> implantateCopy = new ArrayList<NFD_Implantate>(nfdDocument.Notfalldaten.NFD_Befunddaten.Besondere_Hinweise.Implantate);
        Assert.assertEquals(9, implantateCopy.size());

        implantateCopy.removeIf(implantante -> !implantante.Typenbezeichnung.equals("St. Jude Medical Current Accel"));
        Assert.assertEquals(1, implantateCopy.size());

        // test for enum handling
        Assert.assertEquals(NFD_DiagnosesicherheitEnum.V, nfdDocument.Notfalldaten.NFD_Befunddaten.Diagnosen.get(0).Diagnosesicherheit);

        // test for removing illegal characters (E-Mail -> EMail)
        Assert.assertEquals("chantal@daisy_chain.com", nfdDocument.Notfalldaten.NFD_Versicherter.NFD_Benachrichtigungskontakt.NFD_BK_Kommunikation.get(0).Kommunikationsdaten.EMail);

        // test for optional elements (minOccurs = "0")
        Assert.assertEquals("a", nfdDocument.Notfalldaten.NFD_Befunddaten.Allergien_Unvertraeglichkeiten.get(0).Reaktion);
        Assert.assertNull(nfdDocument.Notfalldaten.NFD_Befunddaten.Allergien_Unvertraeglichkeiten.get(1).Reaktion);

        // test for optional attributes
        Assert.assertEquals("String", nfdDocument.Notfalldaten.NFD_Befunddaten.Diagnosen.get(0).Diagnose_Code_System.DC_Version);
        Assert.assertNull(nfdDocument.Notfalldaten.NFD_Befunddaten.Diagnosen.get(1).Diagnose_Code_System.DC_Version);
    }

    @Test
    public void testXmlToClassDeserializeGenericNameSpaces() {

        URL url = Thread.currentThread().getContextClassLoader().getResource("nfd_v1_3_genericNamespaces.xml");
        File file = new File(url.getPath());

        //Read and Parse
        Document doc = null;
        NFD_NFD_Document nfdDocument = null;
        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            dbfactory.setNamespaceAware(true);
            DocumentBuilder builder = dbfactory.newDocumentBuilder();

            doc = builder.parse(file);
            nfdDocument = NFD_NFD_Document.deserialize(doc.getDocumentElement());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // test for attributes
        Assert.assertEquals("0.0.0", nfdDocument.NFD_Version);
        Assert.assertEquals("ID1", nfdDocument.Notfalldaten.ID);

        // test for value in different namespace
        Assert.assertEquals("A000000000", nfdDocument.Notfalldaten.NFD_Versicherter.Versicherter.Versicherten_ID);

        // test for multiple occurring values / arrays
        List<NFD_Implantate> implantateCopy = new ArrayList<NFD_Implantate>(nfdDocument.Notfalldaten.NFD_Befunddaten.Besondere_Hinweise.Implantate);
        Assert.assertEquals(9, implantateCopy.size());

        implantateCopy.removeIf(implantante -> !implantante.Typenbezeichnung.equals("St. Jude Medical Current Accel"));
        Assert.assertEquals(1, implantateCopy.size());

        // test for enum handling
        Assert.assertEquals(NFD_DiagnosesicherheitEnum.V, nfdDocument.Notfalldaten.NFD_Befunddaten.Diagnosen.get(0).Diagnosesicherheit);

        // test for removing illegal characters (E-Mail -> EMail)
        Assert.assertEquals("chantal@daisy_chain.com", nfdDocument.Notfalldaten.NFD_Versicherter.NFD_Benachrichtigungskontakt.NFD_BK_Kommunikation.get(0).Kommunikationsdaten.EMail);

        // test for optional elements (minOccurs = "0")
        Assert.assertEquals("a", nfdDocument.Notfalldaten.NFD_Befunddaten.Allergien_Unvertraeglichkeiten.get(0).Reaktion);
        Assert.assertNull(nfdDocument.Notfalldaten.NFD_Befunddaten.Allergien_Unvertraeglichkeiten.get(1).Reaktion);

        // test for optional attributes
        Assert.assertEquals("String", nfdDocument.Notfalldaten.NFD_Befunddaten.Diagnosen.get(0).Diagnose_Code_System.DC_Version);
        Assert.assertNull(nfdDocument.Notfalldaten.NFD_Befunddaten.Diagnosen.get(1).Diagnose_Code_System.DC_Version);
    }
}
