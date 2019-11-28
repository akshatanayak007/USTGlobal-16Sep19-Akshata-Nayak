import { AbstractControl, ValidationErrors, EmailValidator } from '@angular/forms';




export class CustomValidation {
    constructor() {
    }
     static unique(control: AbstractControl): ValidationErrors | null{
        if (control.value === 'akshata@gmail.com'){
            return{ unique: true};
        } else {
            return null;
        }
     }
}
