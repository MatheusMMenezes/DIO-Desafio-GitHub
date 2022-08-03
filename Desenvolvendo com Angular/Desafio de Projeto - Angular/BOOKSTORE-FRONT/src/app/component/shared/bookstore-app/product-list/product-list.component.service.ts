import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http"
import { Book } from "./Model/Book";

@Injectable()

export class BooksService{

  private url = '' //colocar Url da API aqui!

  httpOptions = {
    Headers: new HttpHeaders({'content-type': 'application/json'})
  }

  constructor(private http:HttpClient){}

  getBook(){

    return this.http.get(this.url)
  }

}
