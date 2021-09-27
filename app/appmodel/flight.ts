import { Time } from "@angular/common";
export class Flight{
    flightId:number;
    from:string;
    to:string;
    departureTime:Date;
    ArrivalTime:Date;
    capacity:number;
    imgUrl:string='/assets/image/select_flightLogo.jpg';
    constructor(flightId,from,to,departureTime,arrivalTime,capacity){
        this.flightId=flightId;
        this.from=from;
        this.to=to;
        this.departureTime=departureTime;
        this.ArrivalTime=arrivalTime;
        this.capacity=capacity;
        
    }
}