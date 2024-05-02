package se.sti.nick.httpFetcher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.MockInjection;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class HttpServiceTest2 {

    String url = "https://jsonplaceholder.typicode.com/posts";

    @Mock
    HttpFetcher httpFetcher;

    @InjectMocks
    HttpService httpService;

    @Test
    public void testmock() {

        Mockito.when(httpService.fetchData(url)).thenReturn("mockitoman");

        String result = httpService.fetchData(url);

        Assertions.assertTrue(result.equals("mockitoman"));
    }

}