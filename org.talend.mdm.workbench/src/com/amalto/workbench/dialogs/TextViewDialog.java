package com.amalto.workbench.dialogs;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.amalto.workbench.image.ImageCache;

public class TextViewDialog extends Dialog {

	private final static int BUTTON_CLOSE = 10;

	protected String text;
	protected TextViewer textViewer;

	/**
	 * @param parentShell
	 */
	public TextViewDialog(Shell parentShell, String text) {
		super(parentShell);
		this.text = text;
	}

	protected Control createDialogArea(Composite parent) {
		
		try {
			//Should not really be here but well,....
			parent.getShell().setText("Text View");
			
			Composite composite = (Composite) super.createDialogArea(parent);
			GridLayout layout = (GridLayout)composite.getLayout();
			layout.numColumns = 1;
			
    		textViewer = new TextViewer(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
            textViewer.getControl().setLayoutData(    
                    new GridData(SWT.FILL,SWT.FILL,true,true,1,1)
            );
            ((GridData)textViewer.getControl().getLayoutData()).heightHint=250;
            ((GridData)textViewer.getControl().getLayoutData()).widthHint=250;
            textViewer.setEditable(false);
            Document doc = new Document(text);
            textViewer.setDocument(doc);
			
		    return composite;
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(
					this.getShell(),
					"Error", 
					"An error occured trying to create the Views Search window: "+e.getLocalizedMessage()
			);
			return null;
		}
		
	}

	
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, BUTTON_CLOSE, "Close",false);
	}



	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case BUTTON_CLOSE:
			this.close();
		}
	}
	
	
	/**
	 * DOM Tree Content Provider
	 * @author bgrieder
	 *
	 */
	class DOMTreeContentProvider implements IStructuredContentProvider, ITreeContentProvider {

		public DOMTreeContentProvider( ) {
		}
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		
		public void dispose() {
		}
		
		public Object[] getElements(Object parent) {
			return getChildren(parent);
		}
		public Object getParent(Object child) {
			//if (child instanceof Element) {
				return ((Element)child).getParentNode();
			//}
			//return null;
		}
		public Object [] getChildren(Object parent) {
			NodeList nl = ((Element)parent).getChildNodes();
			ArrayList<Element> list = new ArrayList<Element>();
			for (int i = 0; i < nl.getLength(); i++) {
				if (nl.item(i) instanceof Element)
					list.add((Element)nl.item(i));
			}
			if (list.size() == 0)
				return null;
			else
				return list.toArray(new Element[list.size()]);
		}
		public boolean hasChildren(Object parent) {
			if (parent instanceof Element)
				return ((Element)parent).getChildNodes().getLength()>1;
			return false;
		}
		

	}
	
	
	
	/**
	 * DOM Tree Label Provider
	 * @author bgrieder
	 *
	 */
	class DOMTreeLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			if (obj instanceof Element) {
				Element e = (Element)obj;
				if (((Element)obj).getChildNodes().getLength()>1)
					return e.getLocalName();
				else
					return 
					e.getLocalName()+": "+e.getTextContent();
			}
			return "?? "+obj.getClass().getName()+" : "+obj.toString();

		}
		
		public Image getImage(Object obj) {
			if (obj instanceof Element) {
				if (((Element)obj).getChildNodes().getLength()>1)
					return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
				else
					return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
			}
			
			return ImageCache.getImage( "icons/small_warn.gif").createImage();
			//return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);		
		}
		
	}//Class DOM Tree Label Provider
	
	

}
