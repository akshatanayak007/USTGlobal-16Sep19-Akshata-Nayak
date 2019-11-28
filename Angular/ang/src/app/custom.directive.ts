import { HostBinding, Directive, ElementRef, HostListener } from '@angular/core';


@Directive({
    // tslint:disable-next-line: directive-selector
    selector : '[custdir]'
})




export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';

    }
    @HostBinding('style.color') color ='yellow';

    @HostListener('mouseenter') ms() {
        this.el.nativeElement.style.backgroundColor='green';
    }

    @HostListener('mouseleave') ml() {
        this.el.nativeElement.style.backgroundColor='red';
    }
}
