package Day4;

public class O10 {
    /*
    cmd -
    select first_name,last_name,concat(first_name,last_name) from actor;

    first name in one column ,2nd name in 2nd col and 1st+2nd in the 3rd column

    select first_name from actor;
    // o/p- gives the only first name

select first_name from actor order by first_name;
o/p - all the datas are getting displayed in an alphabetical order

select distinct first_name from actor order by first_name;
o/p - distinct keyword for all the distinct or unique entries

select * from actor where actor_id<4;
// where keyword is like giving an condition
// * means all the rows

// op - only the first 3 rows where the actor id < 4 ie 3

select * from actor where actor_id<>4;
or select * from actor where actor_id!=4;
same

 select count(actor_id) from actor group by first_name having ='ALBERT' order by first_name limit 2;
 // nums of alberts will be displayed




     */
}
