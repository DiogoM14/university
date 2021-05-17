import { TestBed } from '@angular/core/testing';

import { ZomatoService } from './zomato.service';

describe('ZomatoService', () => {
  let service: ZomatoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ZomatoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
