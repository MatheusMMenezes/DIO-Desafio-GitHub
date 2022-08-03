import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/shared/header/header.component';
import { FooterComponent } from './component/shared/footer/footer.component';
import { NavComponent } from './component/shared/nav/nav.component';
import { BookstoreAppComponent } from './component/shared/bookstore-app/bookstore-app.component';
import { FiltersComponent } from './component/shared/bookstore-app/filters/filters.component';
import { ProductListComponent } from './component/shared/bookstore-app/product-list/product-list.component';
import { BooksService } from './component/shared/bookstore-app/product-list/product-list.component.service';
import { ProductItemComponent } from './component/shared/bookstore-app/product-list/product-item/product-item.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    BookstoreAppComponent,
    FiltersComponent,
    ProductListComponent,
    ProductItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [BooksService],
  bootstrap: [AppComponent]
})
export class AppModule { }
