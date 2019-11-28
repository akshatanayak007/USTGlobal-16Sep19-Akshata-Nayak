import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StructuralBindingComponent } from './structural-binding.component';

describe('StructuralBindingComponent', () => {
  let component: StructuralBindingComponent;
  let fixture: ComponentFixture<StructuralBindingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StructuralBindingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StructuralBindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
