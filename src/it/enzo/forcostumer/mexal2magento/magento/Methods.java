package it.enzo.forcostumer.mexal2magento.magento;

public enum Methods {
CATALOG_PRODUCT_CREATE("catalog_product.create"), 
CATALOG_PRODUCT_UPDATE("catalog_product.update"),
CATALOG_PRODUCT_DELETE("catalog_product.delete"),
CATALOG_PRODUCT_LIST("catalog_product.list"),
CATALOG_PRODUCT_ATTRIBUTE_MEDIA_CREATE("catalog_product_attribute_media.create");

private String method;

Methods(String method){
	this.method = method;
}

@Override
public String toString(){
	return this.method;
}

}
