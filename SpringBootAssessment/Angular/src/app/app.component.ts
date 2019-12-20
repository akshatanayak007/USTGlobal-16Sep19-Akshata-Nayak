import { Component } from '@angular/core';
import { NavigationStart, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'application';

  showHead: boolean= false;

  ngOnInit(){

  }
  constructor(private router: Router){
    router.events.forEach((event) => {
      if(event instanceof NavigationStart){
        if(event['url']=='/get-lib' ||event['url']=='/get-lib' ||event['url']=='/get-book' || event['url']=='/edit-book' ||event['url']=='/issue-book'
        ||event['url']=='/modify-lib' ||event['url']=='/register' ||event['url']=='/registerstud'
        ||event['url']=='/get-stud' ||event['url']=='/get-book' ||event['url']=='/add-book' ||event['url']=='/issue'
        ||event['url']=='/studbook' ||event['url']=='/acceptb'
        ){
          this.showHead=false;
        }else{
          this.showHead=true;
        }
      }

    });
  }

}
