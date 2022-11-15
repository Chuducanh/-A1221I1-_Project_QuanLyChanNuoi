import {Directive, ElementRef} from '@angular/core';

@Directive({
  selector: '[appFocusInvalidInput]',
  exportAs: 'focusInvalidInput'
})
export class FocusInvalidInputDirective {

  constructor(private el: ElementRef) { }

  onFormSubmit() {
    const invalidControl = this.el.nativeElement.querySelector('input.ng-invalid');
    if (invalidControl.length > 0) {
      invalidControl[0].focus();
    }
  }
}
