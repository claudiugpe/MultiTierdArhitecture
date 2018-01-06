import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <div class="container">
      <nav class="navbar navbar-default">
        <div class="navbar-header">
          <a class="navbar-brand" routerLink="/dashboard"></a>
        </div>
        <ul class="nav navbar-nav">
          <li>
            <a routerLink="/board" routerLinkActive="active">Boards</a>
          </li>
          <li>
            <a routerLink="/workitem" routerLinkActive="active">Work Items</a>
          </li>
          <li>
            <a routerLink="/user" routerLinkActive="active">Users</a>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li>
            <a>Log In</a>
          </li>
          <li>
            <a>Log Out</a>
          </li>
        </ul>
      </nav>
      <div class="col-sm-12">
        <router-outlet></router-outlet>
      </div>
    </div>
  `,
  styles: [
    `.navbar-right { margin-right: 0px !important}`
  ]
})
export class AppComponent {
  title = 'Kanban boards';
  
  constructor() {}
}
