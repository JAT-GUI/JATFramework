package mfp.productBase;

public interface PageObjectPBI{
	public void validatePageElements(boolean showWarnings);
	boolean areBasicElementsDisplayed();
	public void setBaseUrl(String baseUrl);
	public void getUrl();
}
