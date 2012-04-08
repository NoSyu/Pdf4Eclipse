package de.vonloesch.pdf4eclipse.model;

import java.awt.geom.Rectangle2D;


public interface IPDFLinkAnnotation {
	/**
	 * The coordinates of the annotation on the page.
	 * @return
	 */
	public Rectangle2D getPosition();
	
	/**
	 * The destination where this annotation links to.
	 * @return
	 */
	public IPDFDestination getDestination();
}