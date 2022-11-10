import {environment} from "../../../environments/environment";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Animal} from "../model/Animal";

const apiUrl = environment.api_url;
@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  constructor(private http: HttpClient) {
  }

  getAll(page): Observable<any[]> {
    return this.http.get<any[]>(apiUrl + "?page=" + page);
  }

  findById(id: number): Observable<Animal> {
    return this.http.get<Animal>(`${apiUrl}/${id}`);
  }

  delete(id: number): Observable<Animal> {
    return this.http.delete<Animal>(`${apiUrl}/${id}`);
  }

  create(animal: Animal): Observable<Animal> {
    return this.http.post<Animal>(apiUrl, animal);
  }

  update(id: number, animal: Animal): Observable<Animal> {
    return this.http.put<Animal>(`${apiUrl}/${id}`, animal);
  }
}
