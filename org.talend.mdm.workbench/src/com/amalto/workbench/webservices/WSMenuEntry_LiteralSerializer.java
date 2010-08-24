// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSMenuEntry_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_id_QNAME = new QName("", "id");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_descriptions_QNAME = new QName("", "descriptions");
    private static final QName ns2_WSMenu$2d$menuEntries$2d$descriptions_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSMenu-menuEntries-descriptions");
    private CombinedSerializer ns2_myWSMenuMenuEntriesDescriptions_LiteralSerializer;
    private static final QName ns1_context_QNAME = new QName("", "context");
    private static final QName ns1_application_QNAME = new QName("", "application");
    private static final QName ns1_icon_QNAME = new QName("", "icon");
    private static final QName ns1_subMenus_QNAME = new QName("", "subMenus");
    private static final QName ns2_WSMenuEntry_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSMenuEntry");
    private CombinedSerializer ns2_myWSMenuEntry_LiteralSerializer;
    
    public WSMenuEntry_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSMenuEntry_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myWSMenuMenuEntriesDescriptions_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions.class, ns2_WSMenu$2d$menuEntries$2d$descriptions_TYPE_QNAME);
        ns2_myWSMenuEntry_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSMenuEntry.class, ns2_WSMenuEntry_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSMenuEntry instance = new com.amalto.workbench.webservices.WSMenuEntry();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_id_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_id_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setId((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_id_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_descriptions_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_descriptions_QNAME))) {
                    value = ns2_myWSMenuMenuEntriesDescriptions_LiteralSerializer.deserialize(ns1_descriptions_QNAME, reader, context);
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull");
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions[values.size()];
            member = values.toArray((Object[]) member);
            instance.setDescriptions((com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions[])member);
        }
        else if(!(reader.getState() == XMLReader.END)) {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_context_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_context_QNAME, reader, context);
                instance.setContext((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_context_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_application_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_application_QNAME, reader, context);
                instance.setApplication((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_application_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_icon_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_icon_QNAME, reader, context);
                instance.setIcon((java.lang.String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_subMenus_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_subMenus_QNAME))) {
                    value = ns2_myWSMenuEntry_LiteralSerializer.deserialize(ns1_subMenus_QNAME, reader, context);
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull");
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.amalto.workbench.webservices.WSMenuEntry[values.size()];
            member = values.toArray((Object[]) member);
            instance.setSubMenus((com.amalto.workbench.webservices.WSMenuEntry[])member);
        }
        else {
            instance.setSubMenus(new com.amalto.workbench.webservices.WSMenuEntry[0]);
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSMenuEntry instance = (com.amalto.workbench.webservices.WSMenuEntry)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSMenuEntry instance = (com.amalto.workbench.webservices.WSMenuEntry)obj;
        
        if (instance.getId() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getId(), ns1_id_QNAME, null, writer, context);
        if (instance.getDescriptions() != null) {
            for (int i = 0; i < instance.getDescriptions().length; ++i) {
                ns2_myWSMenuMenuEntriesDescriptions_LiteralSerializer.serialize(instance.getDescriptions()[i], ns1_descriptions_QNAME, null, writer, context);
            }
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getContext(), ns1_context_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getApplication(), ns1_application_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getIcon(), ns1_icon_QNAME, null, writer, context);
        if (instance.getSubMenus() != null) {
            for (int i = 0; i < instance.getSubMenus().length; ++i) {
                ns2_myWSMenuEntry_LiteralSerializer.serialize(instance.getSubMenus()[i], ns1_subMenus_QNAME, null, writer, context);
            }
        }
    }
}
