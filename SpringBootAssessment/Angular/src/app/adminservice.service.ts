import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService {

  constructor(private http: HttpClient) { }

  loginadmin(admin): Observable<any> {
    return this.http.post(`http://localhost:8080/adminlogin/${admin.id}/${admin.psw}`,admin);
  }

  loginlib(lib): Observable<any> {
    return this.http.post(`http://localhost:8080/lms/librarianlogin/${lib.id}/${lib.psw}/${lib.role}`,lib);
  }


  loginstud(lib): Observable<any> {
    return this.http.post(`http://localhost:8080/lms/studentlogin/${lib.id}/${lib.psw}/${lib.role}`,lib);
  }


  addLib(librarian): Observable<any> {
    return this.http.post(`http://localhost:8080/lms/add-librarian`, librarian);
  }

  addAdmin(admin): Observable<any> {
    return this.http.post(`http://localhost:8080/add-admin`, admin);
  }

  addStud(stud): Observable<any> {
    return this.http.post(`http://localhost:8080/lms/reg-student`, stud);
  }

  addBook(book): Observable<any> {
    return this.http.post(`http://localhost:8080/add-product`, book);
  }

  getData(): Observable <any>{
    return this.http.get('http://localhost:8080/lms/get-all-student');
  }

  allBooks(): Observable <any>{
    return this.http.get('http://localhost:8080/get-all-products');
  }

  allLibs(): Observable <any>{
    return this.http.get('http://localhost:8080/lms/get-all-librarian');
  }

    deleteBook(book): Observable<any>{
      return this.http.delete(`http://localhost:8080/lms/delete-book/${book.bid}`);
    }

    deleteStud(book): Observable<any>{
      return this.http.delete(`http://localhost:8080/delete-product/${book.pid}`);
    }
    
    deleteLib(book): Observable<any>{
      return this.http.delete(`http://localhost:8080/lms//delete-librarian/${book.lid}`);
    }

    updateUser(student_id : number, user): Observable<any>{
      return this.http.put('http://localhost:8080/library/librarian/modify',user);
    }
    issuebook(book): Observable <any>{
      return this.http.post(`http://localhost:8080/lms/requestBook/${book.sid}/${book.bid}/${book.status}`,book);
    }

    editBook(book): Observable <any>{
      return this.http.put('http://localhost:8080/modify-product',book);
    }
    
    searchBook(book): Observable <any>{
      console.log(book);
      return this.http.post(`http://localhost:8080/get-product/${book.name}`,book);
    }

    searchStud(book): Observable <any>{
      console.log(book);
      return this.http.get(`http://localhost:8080/lms/get-student/${book.sid}`,book);
    }

    searchLibs(book): Observable <any>{
      console.log(book);
      return this.http.get(`http://localhost:8080/lms/get-librarian/${book.lid}`,book);
    }

    editLib(book): Observable <any> {
      console.log(book);
      return this.http.post(`http://localhost:8080/lms/modify-librarian/${book.lid}`,book);
    }

    editStud(book): Observable <any> {
      console.log(book);
      return this.http.put(`http://localhost:8080/lms//modify-student`,book);
    }

    issueBook(book): Observable <any> {
      console.log(book);
      return this.http.post(`http://localhost:8080/lms/requestBook/${book.sid}/${book.bid}/${book.status}`,book);
    }

    
    retBook(book): Observable <any> {
      console.log(book);
      return this.http.post(`http://localhost:8080/lms/returnRequest/${book.issue_id}/${book.book.bid}/${book.student.sid}`,book);
    }

    allIssueBook(): Observable <any>{
      return this.http.get('http://localhost:8080/lms/requestIssue');
    }

    acceptBook(book): Observable <any> {
      console.log(book);
      return this.http.post(`http://localhost:8080/lms/returnReq/${book.issue_id}/${book.status}/${book.issuedate}/${book.returndate}/${book.bid}`,book);
    }

  
}
