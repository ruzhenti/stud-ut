package lesson4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

class BookServiceTest {

    // аннотация
    @Mock
    private BookRepository mockBookRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        // Инициализация перед
        MockitoAnnotations.initMocks(this);
        // Создание объекта BookService
        bookService = new BookService(mockBookRepository);
    }

    @Test
    void testFindBookById() {
        String bookId = "1";
        Book expectedBook = new Book("1", "Book1", "Author1");
        // инициализация для findById
        when(mockBookRepository.findById(bookId)).thenReturn(expectedBook);

        Book actualBook = bookService.findBookById(bookId);


        assertNotNull(actualBook);
        assertEquals(expectedBook, actualBook);
        // вызывался
        verify(mockBookRepository).findById(bookId);
    }

    @Test
    void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );

        when(mockBookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.findAllBooks();

        assertNotNull(actualBooks);
        assertEquals(expectedBooks.size(), actualBooks.size());  // на количество
        assertEquals(expectedBooks, actualBooks);  // на наличие
        verify(mockBookRepository).findAll();  // вызывался findAll
    }
}