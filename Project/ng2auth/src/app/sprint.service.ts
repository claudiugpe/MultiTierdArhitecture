import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { catchError } from 'rxjs/operators';

@Injectable()
export class SprintService {

  private sprintUrl='http://localhost:8080/MSD-S2/data/sprints/'
  constructor(private http: HttpClient) { }

  getSprints(){
    return this.http
      .get(this.sprintUrl)
      .pipe(
        catchError(this.handleError)
      )
  };

  private handleError(err: HttpErrorResponse | any){
    console.error('An error occured', err)
    return Observable.throw(err.message || err);
  }

}
