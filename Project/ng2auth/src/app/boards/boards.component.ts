import { Component, OnInit } from '@angular/core';
import {Board} from '../board';

import {BoardsService} from '../boards.service'
import { OnDestroy } from '@angular/core/src/metadata/lifecycle_hooks';
import { Subscription } from 'rxjs/Subscription';
import {Router} from '@angular/router'
@Component({
  selector: 'app-boards',
  templateUrl: './boards.component.html',
  styleUrls: ['./boards.component.css']
})
export class BoardsComponent implements OnInit, OnDestroy {

  boardsSub: Subscription;
  boards:Board[];
  error:any;

  constructor(public boardService:BoardsService,
              private router:Router)
 { }

  ngOnInit() {
    this.boardsSub=this.boardService
      .getBoards()
      .subscribe(
        boards=>this.boards=boards,
        err=>this.error=err
      )
  }

  ngOnDestroy(){
    this.boardsSub.unsubscribe();
  }

  btnCreateBoardClick(){
    this.router.navigateByUrl('/createBoard')
  }
}
