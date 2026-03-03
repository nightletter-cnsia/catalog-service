package me.nightletter.playgroundcloudnativespringinaction;

import me.nightletter.playgroundcloudnativespringinaction.domain.Book;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CatalogServiceApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

//    @Test
//    void whenPostRequestThenBookCreated() {
//        Book book = Book.of("1231231231", "Title", "Author", 9.90, "polarshphia");
//
//        webTestClient
//                .post()
//                .uri("/books")
//                .bodyValue(book)
//                .exchange()
//                .expectStatus().isCreated()
//                .expectBody(Book.class).value(item -> {
//                    assertThat(item).isNotNull();
//                    assertThat(item.isbn())
//                            .isEqualTo(book.isbn());
//                });
//    }
}
