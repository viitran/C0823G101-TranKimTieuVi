import { Category } from "./category";

export class Book {
  id?: number;
  name?: string;
  author?: string;
  quantity?: number;
  description?: string;
  category?: Category;
  constructor(
    id: number,
    name: string,
    author: string,
    quantity: number,
    description: string
  ) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.quantity = quantity;
    this.description = description;
  }
}
