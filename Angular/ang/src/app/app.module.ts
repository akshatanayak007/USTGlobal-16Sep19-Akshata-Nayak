import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { NgIfComponent } from './directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/ng-for/ng-for.component';
import { StructuralBindingComponent } from './data-binding/structural-binding/structural-binding.component';
import { NgSwitchComponent } from './directives/structural-binding/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';


@NgModule({
  declarations: [
    HeaderComponent,
    HomeComponent,
    AppComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectivesComponent,
    NgIfComponent,
    NgForComponent,
    StructuralBindingComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    // AppRoutingModule,
    RouterModule.forRoot([
        {path : '', component : HomeComponent},
        {path : 'About', component : AboutComponent},
        {path : 'Help', component : HelpComponent},
        {path : 'Login', component : LoginComponent},
        {path : 'property-binding' , component : PropertyBindingComponent},
        {path : 'event-binding' , component : EventBindingComponent},
        {path : 'two-way' , component : TwoWayBindingComponent},
        {path : 'ng-if' , component : NgIfComponent},
        {path : 'ng-for' , component : NgForComponent},
        {path : 'ng-switch' , component : NgSwitchComponent},
        {path : 'register' , component : RegisterComponent},
        {path : 'form1', component : Form1Component},
        {path : 'form2', component : Form2Component},
        {path : 'form3', component : Form3Component},
        {path : 'form4', component : Form4Component},
        {path : 'reactive-form', component : ReactiveFormComponent},
        {path : 'parent', component : ParentComponent},
        {path : 'comment-details', component : CommentDetailsComponent}





        

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
