import { Component } from '@angular/core';

@Component({
    selector : 'app-help',
    templateUrl : './help.component.html',
    styleUrls : ['./help.component.css']
})


export class HelpComponent {
    color = 'pink';
    bgcolor = 'black';
    isActive = true;

    constructor() {
        setInterval(()=>{   
            this.isActive =!this.isActive;

        },2000);
    }
}