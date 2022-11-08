import { Component, OnInit } from '@angular/core';
import {AnimalService} from "../service/animal.service";
// @ts-ignore
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {
  indexPagination: number = 0;
  animal;
  id: number;
  deletes: number[] = [];

  constructor(private animalService : AnimalService, private toastr: ToastrService) { }

  ngOnInit(): void {
    this.getAll(this.indexPagination);
  }

  getAll(indexPagination) {
    this.animalService.getAll(indexPagination).subscribe(
      data => {
        this.animal = data;
      });
  }

  changeId(id: number) {
    this.id = id;
  }

  delete(id: number) {
    this.animalService.delete(id).subscribe(() => {
      this.getAll(0);
      this.toastr.success('Đã xóa thành công', 'Thông báo');
    }, error => {
      alert('Loi');
    });
  }


  firstPage() {
    this.indexPagination = 0;
    this.ngOnInit();
  }

  nextPage() {
    this.indexPagination = this.indexPagination + 1;
    if (this.indexPagination >= this.animal.totalPages) {
      this.indexPagination = this.indexPagination - 1;
      this.ngOnInit();
    }
    this.animalService.getAll(this.indexPagination).subscribe(data => {
      this.animal = data;
    })
  }

  previousPage() {
    this.indexPagination = this.indexPagination - 1;
    if (this.indexPagination == -1) {
      this.indexPagination = 0;
      this.ngOnInit();
    } else {
      this.animalService.getAll(this.indexPagination).subscribe(data => {
        this.animal = data;
      })
    }
  }

  previousTwoPage() {
    this.indexPagination = this.indexPagination - 2;
    if (this.indexPagination < 0) {
      this.indexPagination = 0;
      this.ngOnInit();
    } else {
      this.animalService.getAll(this.indexPagination).subscribe(data => {
        this.animal = data;
      })
    }
  }

  nextTwoPage() {
    this.indexPagination = this.indexPagination + 2;
    if (this.indexPagination >= this.animal.totalPages) {
      this.indexPagination = this.indexPagination - 2;
      this.ngOnInit();
    }
    this.animalService.getAll(this.indexPagination).subscribe(data => {
      this.animal = data;
    })
  }


  lastPage() {
    this.indexPagination = this.animal.totalPages-1;
    this.animalService.getAll(this.indexPagination).subscribe(data => {
      this.animal = data;
    })
  }

}
