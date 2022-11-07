import { Component, OnInit } from '@angular/core';
import {Employee} from "../model/employee";
import {EmployeeService} from "../service/employee.service";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  id: number;
  name: string;

  indexPagination: number = 0;
  public value = '';


  employees;

  constructor(private employeeService: EmployeeService,
              private toastr: ToastrService) { }

  ngOnInit(): void {
    this.getAll(this.indexPagination);
  }

  getAll(indexPagination){
    this.employeeService.getAll(indexPagination).subscribe(
      data => {
        this.employees = data;

      }
    )
  }



  changeId(id: number, name: string) {

    this.id = id;
    this.name = name;


  }

  delete(id: number) {
    this.employeeService.delete(id).subscribe(() => {
      this.getAll(this.indexPagination);
      this.toastr.success('Hello world!', 'Toastr fun!');
    }, error => {
      alert("id không tìm thấy")
    });
  }


  firstPage() {
    this.indexPagination = 0;
    this.ngOnInit();
  }

  nextPage() {
    this.indexPagination = this.indexPagination + 1;
    if (this.indexPagination >= this.employees.totalPages) {
      this.indexPagination = this.indexPagination - 1;
      this.ngOnInit();
    }
    this.employeeService.getAll(this.indexPagination).subscribe(data => {
      this.employees = data;
    })
  }

  nextTwoPage() {
    this.indexPagination = this.indexPagination + 2;
    if (this.indexPagination >= this.employees.totalPages) {
      this.indexPagination = this.indexPagination - 2;
      this.ngOnInit();
    }
    this.employeeService.getAll(this.indexPagination).subscribe(data => {
      this.employees = data;
    })
  }


  previousPage() {
    this.indexPagination = this.indexPagination - 1;
    if (this.indexPagination < 0) {
      this.indexPagination = 0;
      this.ngOnInit();
    } else {
      this.employeeService.getAll(this.indexPagination).subscribe(data => {
        this.employees = data;
      })
    }
  }

  previousTwoPage() {
    this.indexPagination = this.indexPagination - 2;
    if (this.indexPagination < 0) {
      this.indexPagination = 0;
      this.ngOnInit();
    } else {
      this.employeeService.getAll(this.indexPagination).subscribe(data => {
        this.employees = data;
      })
    }
  }


  lastPage() {
    this.indexPagination = this.employees.totalPages-1;
    this.employeeService.getAll(this.indexPagination).subscribe(data => {
      this.employees = data;
    })
  }



}
