import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { catchError } from 'rxjs/operators';

@Injectable()
export class UsersService {

  private usersUrl='http://localhost:8080/MSD-S2/data/users/';

  constructor(private http: HttpClient) { }

  getUsers(){
    return this.http
      .get(this.usersUrl)
      .pipe(
        catchError(this.handleError)
      );
  }

  private handleError(err: HttpErrorResponse | any) {
    console.error('An error occurred', err);
    return Observable.throw(err.message || err);
  }

}
