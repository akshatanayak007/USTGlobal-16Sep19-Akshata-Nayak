import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifylibComponent } from './modifylib.component';

describe('ModifylibComponent', () => {
  let component: ModifylibComponent;
  let fixture: ComponentFixture<ModifylibComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifylibComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifylibComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
