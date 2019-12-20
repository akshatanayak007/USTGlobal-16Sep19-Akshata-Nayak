import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';

import { RegisterstudentComponent } from './registerstudent/registerstudent.component';
import { RegisteradminComponent } from './registeradmin/registeradmin.component';
import { StudentdataComponent } from './studentdata/studentdata.component';
import { BooksComponent } from './books/books.component';
import { ModifybookComponent } from './modifybook/modifybook.component';
import { AddbooksComponent } from './addbooks/addbooks.component';
import { LibrarianComponent } from './librarian/librarian.component';


import { StudComponent } from './stud/stud.component';
import { ModifystudComponent } from './modifystud/modifystud.component';
import { ModifylibComponent } from './modifylib/modifylib.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { HomeComponent } from './home/home.component';
import { RetbookComponent } from './retbook/retbook.component';
import { IssueComponent } from './issue/issue.component';
import { StudbookComponent } from './studbook/studbook.component';
import { AcceptComponent } from './accept/accept.component';


const routes: Routes = [
  // {path:'home',component:HomeComponent},
  // {path:'header',component:HeaderComponent},
  {path: 'login', component: LoginComponent},

  {path: 'home', component: HomeComponent},


  {path: 'registerstud', component: RegisterstudentComponent},
  {path: 'registeradmin', component: RegisteradminComponent},
  {path: 'student-data', component: StudentdataComponent},
  {path: 'get-book', component: BooksComponent},
  {path: 'edit-book', component: ModifybookComponent},
  {path: 'add-book', component: AddbooksComponent},
  {path: 'get-lib', component: LibrarianComponent},

 
  {path: 'get-stud', component: StudComponent},
  {path: 'modify-stud', component: ModifystudComponent},
  {path: 'modify-lib', component: ModifylibComponent},
  {path: 'issue-book', component: IssuebookComponent},
  {path: 'ret-book',component:RetbookComponent},
  {path: 'issue', component:IssueComponent},
  {path: 'studbook', component:StudbookComponent},
  {path: 'acceptb', component: AcceptComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
