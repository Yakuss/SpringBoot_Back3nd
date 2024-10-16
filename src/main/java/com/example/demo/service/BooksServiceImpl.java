package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.BookType;
import com.example.demo.models.Books;
import com.example.demo.repos.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService{

	
	@Autowired
	BooksRepository BooksRepository;
	
	@Override
	public Books saveBooks(Books b) {
		return BooksRepository.save(b);
	}

	@Override
	public Books UpdateBooks(Books b) {
		return BooksRepository.save(b);
	}

	@Override
	public void deletebooks(Books b) {
		BooksRepository.delete(b);
		
	}

	@Override
	public void deletebooksById(long id) {
		BooksRepository.deleteById(id);
		
	}

	@Override
	public Books getBooks(Long id) {
		return BooksRepository.findById(id).get();
	}

	@Override
	public List<Books> getAllBooks() {
		return BooksRepository.findAll();
	}
	
	
	/*--------------<*/

	@Override
	public List<Books> findByTitle(String title) {
		return BooksRepository.findByTitle(title);
	}
	

	@Override
	public List<Books> findByTitleContains(String title) {
		return BooksRepository.findByTitleContains(title);
	}

	@Override
	public List<Books> findByTitleAuthor(String title, String author) {
		return BooksRepository.findByTitleAuthor(title, author);
	}

	@Override
	public List<Books> findByBookType(BookType type) {
		return BooksRepository.findByBookType(type);
	}

	@Override
	public List<Books> findByBookTypeId(Long id) {
		return BooksRepository.findByBookTypeId(id);
	}

	@Override
	public List<Books> findByOrderByTitleAsc() {
		return BooksRepository.findByOrderByTitleAsc();
	}

	@Override
	public List<Books> TrierBooksTitreAuthor() {
		return BooksRepository.TrierBooksTitreAuthor();
	}
	
	

	
	
	
	

}
