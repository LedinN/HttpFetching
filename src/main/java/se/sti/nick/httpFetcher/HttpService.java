package se.sti.nick.httpFetcher;

public class HttpService
{
    private HttpFetcher httpFetcher;

    public HttpService(HttpFetcher httpFetcher){
        this.httpFetcher = httpFetcher;
    }

    public boolean checkIfCorrectURL(String url){
        return url.startsWith("https://");
    }
    public String fetchData(String url)
    {
        if (url == null){
            throw new IllegalArgumentException("url must not be null");
        }

        String result = httpFetcher.fetchDataForUrl(url);

        return result;
    }
}
