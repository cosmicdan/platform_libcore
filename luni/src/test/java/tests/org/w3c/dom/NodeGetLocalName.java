
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package tests.org.w3c.dom;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;

import javax.xml.parsers.DocumentBuilder;

/**
 *  The method getLocalName returns the local part of the qualified name of this node.
 *
 *  Ceate two new element nodes and atribute nodes, with and without namespace prefixes.
 *  Retreive the local part of their qualified names using getLocalName and verrify
 *  if it is correct.
* @author IBM
* @author Neil Delima
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-NodeNSLocalN">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-NodeNSLocalN</a>
*/
public final class NodeGetLocalName extends DOMTestCase {

    DOMDocumentBuilderFactory factory;

    DocumentBuilder builder;

    protected void setUp() throws Exception {
        super.setUp();
        try {
            factory = new DOMDocumentBuilderFactory(DOMDocumentBuilderFactory
                    .getConfiguration1());
            builder = factory.getBuilder();
        } catch (Exception e) {
            fail("Unexpected exception" + e.getMessage());
        }
    }

    protected void tearDown() throws Exception {
        factory = null;
        builder = null;
        super.tearDown();
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void testGetLocalName() throws Throwable {
      Document doc;
      Element element;
      Element qelement;
      Attr attr;
      Attr qattr;
      String localElemName;
      String localQElemName;
      String localAttrName;
      String localQAttrName;
      doc = (Document) load("staff", builder);
      element = doc.createElementNS("http://www.w3.org/DOM/Test/elem", "elem");
      qelement = doc.createElementNS("http://www.w3.org/DOM/Test/elem", "qual:qelem");
      attr = doc.createAttributeNS("http://www.w3.org/DOM/Test/attr", "attr");
      qattr = doc.createAttributeNS("http://www.w3.org/DOM/Test/attr", "qual:qattr");
      localElemName = element.getLocalName();
      localQElemName = qelement.getLocalName();
      localAttrName = attr.getLocalName();
      localQAttrName = qattr.getLocalName();
      assertEquals("nodegetlocalname03_localElemName", "elem", localElemName);
      assertEquals("nodegetlocalname03_localQElemName", "qelem", localQElemName);
      assertEquals("nodegetlocalname03_localAttrName", "attr", localAttrName);
      assertEquals("nodegetlocalname03_localQAttrName", "qattr", localQAttrName);
      }

}

