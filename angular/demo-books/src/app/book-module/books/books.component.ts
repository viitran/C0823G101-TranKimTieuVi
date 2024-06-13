import { Component } from '@angular/core';
import { Book } from '../../model/book';
import { BookServicesService } from '../../book-services.service';
import { NgFor } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-books',
  standalone: true,
  imports: [NgFor,RouterLink],
  templateUrl: './books.component.htm',
  styleUrl: './books.component.css',
})
export class BooksComponent {
  books: Book[] = [];

  constructor(private services: BookServicesService) {}
  ngOnInit() {
    this.fetchData();    
  }

  fetchData() {
    this.services.getAllBooks().subscribe({
      next: (res) => {
        this.books = res;
      },
    });
  }
}
