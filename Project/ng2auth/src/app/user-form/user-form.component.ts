import { Component, OnInit } from '@angular/core';
import {User} from '../user.model';
import {UsersService} from '../users.service';
import {Observable } from 'rxjs/Observable';

@Component({
  selector: 'user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  users: User[];
  error: any;

  private model=new User('','');
  
  constructor(  
    private userService:UsersService) { 
  }

  ngOnInit() {
  }

  submitUser(){
    this.userService.createUser(this.model).subscribe(
      data=>{
        this.getUsers();
        return true;
      },
      error=>{
        console.error("error saving users!");
        return Observable.throw(error);
      }
    );
  }
  getUsers(){
    this.userService
      .getUsers()
      .subscribe(
        users => this.users = users,
        err => this.error = err
      )
  }

  get currentBook(){ return JSON.stringify(this.model);}
}
