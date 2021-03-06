/*
 * XML Type:  CT_GvmlPictureNonVisual
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPictureNonVisual
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GvmlPictureNonVisual(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGvmlPictureNonVisualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPictureNonVisual
{
    
    public CTGvmlPictureNonVisualImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final org.apache.poi.javax.xml.namespace.QName CNVPR$0 = 
        new org.apache.poi.javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cNvPr");
    private static final org.apache.poi.javax.xml.namespace.QName CNVPICPR$2 = 
        new org.apache.poi.javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cNvPicPr");
    
    
    /**
     * Gets the "cNvPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps getCNvPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(CNVPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cNvPr" element
     */
    public void setCNvPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps cNvPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(CNVPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(CNVPR$0);
            }
            target.set(cNvPr);
        }
    }
    
    /**
     * Appends and returns a new empty "cNvPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps addNewCNvPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(CNVPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "cNvPicPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties getCNvPicPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties)get_store().find_element_user(CNVPICPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cNvPicPr" element
     */
    public void setCNvPicPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties cNvPicPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties)get_store().find_element_user(CNVPICPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties)get_store().add_element_user(CNVPICPR$2);
            }
            target.set(cNvPicPr);
        }
    }
    
    /**
     * Appends and returns a new empty "cNvPicPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties addNewCNvPicPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties)get_store().add_element_user(CNVPICPR$2);
            return target;
        }
    }
}
