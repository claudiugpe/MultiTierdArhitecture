import { Component, OnInit } from '@angular/core';
import { User } from '../user';

import { UsersService} from '../users.service';
import { OnDestroy } from '@angular/core/src/metadata/lifecycle_hooks';
import { Subscription } from 'rxjs/Subscription';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit, OnDestroy {

  usersSub: Subscription;
  users: User[];
  error: any;

  constructor(public userService: UsersService) { }

  ngOnInit() {
    this.usersSub = this.userService
      .getUsers()
      .subscribe(
        users => this.users = users,
        err => this.error = err
      )
  }

  ngOnDestroy() {
    this.usersSub.unsubscribe();
  }
}
