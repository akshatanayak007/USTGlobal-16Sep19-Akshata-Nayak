import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  canActivate(route: ActivatedRouteSnapshot): boolean{
    const expectedRoleArray=route.data.role;
    const userbean= JSON.parse(localStorage.getItem('userbean'));
    let expectedRole: String;
    for (const index in expectedRoleArray){
      if(userbean && userbean.role==expectedRoleArray[index])
      {
        expectedRole=expectedRoleArray[index];
      }
    }
    if(userbean && expectedRole===userbean.role){
      console.log('user authenticated');
      return true;
    }else{
      console.log('not authenticated');
      return false;
    }
  }
}
