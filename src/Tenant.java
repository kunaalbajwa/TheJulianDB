/**
 * Created by kunaalbajwa on 12/22/16.
 put one database
 use intelliJ pay for it it works
 web storm for javascript
 use mySQL
 look at hibernate again, give Spring a second chance

 start small make one table and such; baby steps
 */


/*
make only 2 CRUDs one for users and admin, create users (tenant) under admin and have the admin take out ability of users
*/


/*
Address, notes


rent
rental type: apartment or house; use relational tables
 maintenance
sq ft
max occ
utilities
#tenants
allows pets? (boolean)
 maintenance requirement

*/
//have the admin create users and give them an id (primary id) and password, then enter in which complex they are a part of and have
    //the other info connect with that property location (rent, sq ftage ecta)


    //how exactly to start a database in intellij????????
    //how to store users in intellij???
    //webstorm javascript??
public class Tenant {

    int flatRent1;
    int flatRent2;
    double sqFt;
    int maxOccp;
    int cars;

    boolean pets = true;
    double tax1; //use this?? sure it would show different computation
    double tax2;


    int numberHouse;
}