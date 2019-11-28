import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})


export class HomeComponent {
    news: any;
    constructor(private http: HttpClient) {
        this.getNews();
    }

    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
        this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log("news got successfull");
    })
}
}
