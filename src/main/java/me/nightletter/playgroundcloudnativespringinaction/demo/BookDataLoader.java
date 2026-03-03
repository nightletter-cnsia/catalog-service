package me.nightletter.playgroundcloudnativespringinaction.demo;

import lombok.RequiredArgsConstructor;
import me.nightletter.playgroundcloudnativespringinaction.domain.Book;
import me.nightletter.playgroundcloudnativespringinaction.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("testdata")
@RequiredArgsConstructor
public class BookDataLoader {
    private final BookRepository bookRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        bookRepository.deleteAll();

        var book1 = Book.of("1234567891", "Northern Lights", "Lyra Silverstar", 9.90, "Polarshphia");
        var book2 = Book.of("1234567892", "Polar Journey", "Iorek Polarson", 12.90, "Polarshphia");
        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
