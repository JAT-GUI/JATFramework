package mfp.productBase;

public class ElementPath {
	public String pathType="";
	public String path="";
	public final static String xpath="xpath";
	public final static String css="css";
	public final static String className="className";
	public final static String id="id";
	public final static String linkText="linkText";
	public final static String tagName="tagName";
	public final static String partialLinkText="partialLinkText";
	public final static String name="name";
	/**
	 *
	 * @param pathType
	 * @param path
	 */
	public ElementPath(String pathType, String path){
		this.pathType = pathType;
		this.path = path;
	}
	/**
	 * 
	 * @param path
	 */
	public ElementPath(String path){
		this.path = path;
	}
	
}
