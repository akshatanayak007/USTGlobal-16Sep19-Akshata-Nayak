import {Component} from '@angular/core';
import { Router } from '@angular/router';
@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styleUrls: ['./header.component.css']

})
export class HeaderComponent {
    constructor(private router: Router ) { }
    isLoggedIn():boolean{
        const userbean=JSON.parse(localStorage.getItem('userbean'));
        if(userbean){
            return true;
        }else{
            return false;
        }
    }
    isAdmin(){
        const userbean=JSON.parse(localStorage.getItem('userbean'));
        if(userbean && userbean.role=== 'admin'){
            return true;
        }else{
            return false;
        }
    }
    isStudent(){
        const userbean=JSON.parse(localStorage.getItem('userbean'));
        if(userbean && userbean.role=== 'student'){
            return true;
        }else{
            return false;
        }
    }
    logout(){
        localStorage.removeItem('userbean');
        this.router.navigateByUrl('/login');
    }
}
