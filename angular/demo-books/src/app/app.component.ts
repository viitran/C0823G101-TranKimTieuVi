import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';
import { BooksComponent } from './book-module/books/books.component';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet,BooksComponent,RouterOutlet,RouterLink],
templateUrl: './app.component.htm',
  styleUrl: './app.component.css'
})
export class AppComponent {

}
