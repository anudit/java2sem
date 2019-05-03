drop database Movies;
create database Movies;
use Movies;
create table `Movies` (
`ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
`Name` varchar(100) NOT NULL,
`Rating` varchar(10) NOT NULL,
PRIMARY KEY (`ID`)
);

create table `Movie_Review` (
`ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
`MovieID` int(10) unsigned NOT NULL,
`Review` varchar(500) NOT NULL,
`Stars` int(10) unsigned NOT NULL,
PRIMARY KEY (`ID`),
);
