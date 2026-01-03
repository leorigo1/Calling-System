import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateCall } from './create-call';

describe('CreateCall', () => {
  let component: CreateCall;
  let fixture: ComponentFixture<CreateCall>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CreateCall]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateCall);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
