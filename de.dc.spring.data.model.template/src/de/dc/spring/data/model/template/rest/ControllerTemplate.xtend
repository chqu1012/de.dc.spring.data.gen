package de.dc.spring.data.model.template.rest

class ControllerTemplate implements IGenerator<Data>{
  
  def String gen()'''
  @RestController
  @RequestMapping("%URL%")
  public class %NAME%Controller {

      @Autowired
      private %NAME%Repository %NAME%Repository;

      @GetMapping
      public Iterable findAll() {
          return bookRepository.findAll();
      }

      @GetMapping("/title/{bookTitle}")
      public List findByTitle(@PathVariable String bookTitle) {
          return bookRepository.findByTitle(bookTitle);
      }

      @GetMapping("/{id}")
      public Book findOne(@PathVariable Long id) {
          return bookRepository.findById(id)
            .orElseThrow(BookNotFoundException::new);
      }

      @PostMapping
      @ResponseStatus(HttpStatus.CREATED)
      public Book create(@RequestBody Book book) {
          return bookRepository.save(book);
      }

      @DeleteMapping("/{id}")
      public void delete(@PathVariable Long id) {
          bookRepository.findById(id)
            .orElseThrow(BookNotFoundException::new);
          bookRepository.deleteById(id);
      }

      @PutMapping("/{id}")
      public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
          if (book.getId() != id) {
            throw new BookIdMismatchException();
          }
          bookRepository.findById(id)
            .orElseThrow(BookNotFoundException::new);
          return bookRepository.save(book);
      }
  }
  '''
}
