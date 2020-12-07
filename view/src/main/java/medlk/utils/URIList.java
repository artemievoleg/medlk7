package medlk.utils;

public enum URIList {
    DEFAULT_URL_PREFIX ("/view"),
    DEFAULT_ADMIN_URL_SUFFIX ("/admin/index.xhtml"),
    DEFAULT_USER_URL_SUFFIX ("/user/index.xhtml"),
    DEFAULT_URL_SUFFIX ("/index.xhtml");


    public String url;

    URIList(String url) {
        this.url = url;
    }
}
