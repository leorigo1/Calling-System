import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCalls } from './list-calls';

describe('ListCalls', () => {
  let component: ListCalls;
  let fixture: ComponentFixture<ListCalls>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListCalls]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListCalls);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
