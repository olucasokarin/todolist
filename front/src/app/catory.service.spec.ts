import { TestBed } from '@angular/core/testing';

import { CatoryService } from './catory.service';

describe('CatoryService', () => {
  let service: CatoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CatoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
