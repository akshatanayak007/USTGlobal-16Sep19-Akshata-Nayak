import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RegisterstudentComponent } from './registerstudent/registerstudent.component';
import { RegisteradminComponent } from './registeradmin/registeradmin.component';
import { StudentdataComponent } from './studentdata/studentdata.component';
import { FilterPipe } from './filter.pipe';
import { BooksComponent } from './books/books.component';
import { ModifybookComponent } from './modifybook/modifybook.component';
import { AddbooksComponent } from './addbooks/addbooks.component';
import { LibrarianComponent } from './librarian/librarian.component';

import { StudComponent } from './stud/stud.component';
import { ModifylibComponent } from './modifylib/modifylib.component';
import { ModifystudComponent } from './modifystud/modifystud.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { HomeComponent } from './home/home.component';
import { RetbookComponent } from './retbook/retbook.component';
import { StudbookComponent } from './studbook/studbook.component';
import { IssueComponent } from './issue/issue.component';
import { AcceptComponent } from './accept/accept.component';




@NgModule({
  declarations: [
    AppComponent,

    HeaderComponent,
    LoginComponent,
    RegisterstudentComponent,
    RegisteradminComponent,
    StudentdataComponent,
    FilterPipe,
    BooksComponent,
    ModifybookComponent,
    AddbooksComponent,
    LibrarianComponent,
  
    StudComponent,
    ModifylibComponent,
    ModifystudComponent,
    IssuebookComponent,
    HomeComponent,
    RetbookComponent,
    StudbookComponent,
    IssueComponent,
    AcceptComponent,

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 

}

