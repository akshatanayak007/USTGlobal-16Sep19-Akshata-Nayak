import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudbookComponent } from './studbook.component';

describe('StudbookComponent', () => {
  let component: StudbookComponent;
  let fixture: ComponentFixture<StudbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
