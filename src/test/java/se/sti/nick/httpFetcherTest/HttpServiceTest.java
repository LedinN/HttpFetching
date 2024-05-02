package se.sti.nick.httpFetcherTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.sti.nick.httpFetcher.HttpFetcher;
import se.sti.nick.httpFetcher.HttpFetcherImpl;
import se.sti.nick.httpFetcher.HttpService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HttpServiceTest {

    HttpService httpService;

    @BeforeEach
    public void beforeEach(){
        httpService = new HttpService(new HttpFetcherImpl());
    }

    @Test
    void testFetchNotNull() {
        String result = httpService.fetchData("https://jsonplaceholder.typicode.com/posts");
        assertNotNull(result);
    }

    @Test
    void testUrlNotNull() {
        assertThrows(IllegalArgumentException.class, () -> httpService.fetchData(null),"Should throw illegal argument exception" );
    }

    @Test
    void testUrlValid() {
        assertThrows(IllegalArgumentException.class, () -> httpService.fetchData("hppts.com"),"Should throw illegal argument exception" );
    }
}
