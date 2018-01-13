import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { catchError } from 'rxjs/operators';

@Injectable()
export class BoardsService {

  private boardUrl='http://localhost:8080/MSD-S2/data/boards/';
  constructor(private http: HttpClient) { 

  }

  getBoards(){
    return this.http
      .get(this.boardUrl)
      .pipe(
        catchError(this.handleError)
      );
  }

  private handleError(err: HttpErrorResponse | any){
    console.error('An error occured', err)
    return Observable.throw(err.message || err);
  }

  createBoard(board){
    let headers=new HttpHeaders()
                    .set('content-Type','application/json')
                    .set('Accept','application/json');
                    
    let body=JSON.stringify(board);
    return this.http.post(this.boardUrl,body,{headers:headers})
                    .pipe(
                        catchError(this.handleError)
                      );
  }

}
