import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { RouterModule } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
// import { ChildComponent } from './child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
 
    MoviesComponent,
    LoginComponent,
    ReactiveFormComponent

    // ChildComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule,
    // AppRoutingModule
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      
        { path: 'movies', component : MoviesComponent},
        { path: 'login', component : LoginComponent},
        { path: 'reactive' ,component : ReactiveFormComponent}
  
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
