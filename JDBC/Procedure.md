show databases;

-- delimiter //

-- create procedure getMovies()

-- begin

-- select * from movies;

-- end //

-- show procedure status where db = 'demo';

procedure calling

call getMovies()

use demo;

select * from persons;

show procedure status where db = 'demo';

delimiter //

create procedure getProductions()

Begin

select * from productions;

end //

procedure call

call getProductions()