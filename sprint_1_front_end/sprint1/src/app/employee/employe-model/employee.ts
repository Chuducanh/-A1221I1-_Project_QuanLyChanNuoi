import {User} from "./user";

export interface Employee {
  id: number;
  name: string;
  cmnd: string;
  birthday: Date;
  gender: boolean;
  email: string;
  img_url: string;
  user: User;
}
