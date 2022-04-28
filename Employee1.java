package com.collectionmap2;

public class Employee1 {
int id;
String name;
Employee1(){
	
}
Employee1(int id,String name){
	this.id=id;
	this.name=name;
}
@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + "]";
}

}
