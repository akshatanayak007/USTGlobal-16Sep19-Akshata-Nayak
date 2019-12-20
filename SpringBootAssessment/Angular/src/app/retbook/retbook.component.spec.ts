import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RetbookComponent } from './retbook.component';

describe('RetbookComponent', () => {
  let component: RetbookComponent;
  let fixture: ComponentFixture<RetbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RetbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RetbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
