import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CallDetails } from './call-details';

describe('CallDetails', () => {
  let component: CallDetails;
  let fixture: ComponentFixture<CallDetails>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CallDetails]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CallDetails);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
