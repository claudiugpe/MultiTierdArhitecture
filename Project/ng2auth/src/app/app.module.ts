import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { CallbackComponent } from './callback.component';
import { HttpClientModule } from '@angular/common/http';
import { UsersComponent } from './users/users.component';
import { BoardsComponent } from './boards/boards.component';
import { WorkItemsComponent } from './work-items/work-items.component';
import { UsersService } from './users.service';
import { BoardsService } from './boards.service';
import { WorkItemService } from './work-item.service';
import { SprintComponent } from './sprint/sprint.component';
import { SprintService } from './sprint.service';
import { UserFormComponent } from './user-form/user-form.component';
import {FormsModule} from '@angular/forms';
import { Http } from '@angular/http/src/http';
import { HttpHeaders } from '@angular/common/http/src/headers';
import { BoardFormComponent } from './board-form/board-form.component';

@NgModule({
  declarations: [
    AppComponent,
    CallbackComponent,
    UsersComponent,
    BoardsComponent,
    WorkItemsComponent,
    SprintComponent,
    UserFormComponent,
    BoardFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    UsersService,
    BoardsService,
    WorkItemService,
    SprintService],
  bootstrap: [AppComponent]
})
export class AppModule { }
