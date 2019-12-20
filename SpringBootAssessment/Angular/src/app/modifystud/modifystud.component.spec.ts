import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifystudComponent } from './modifystud.component';

describe('ModifystudComponent', () => {
  let component: ModifystudComponent;
  let fixture: ComponentFixture<ModifystudComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifystudComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifystudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
