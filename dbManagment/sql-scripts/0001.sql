CREATE TABLE user (
  userID bigint NOT NULL PRIMARY KEY,
  givenName varchar(25),
  familyName varchar(25),
  middleName varchar(25),
  salutations varchar(25),
  dateOfBirth date,
  description text,
  gender enum('male', 'female', 'trans-female', 'trans-male', 'non-binary')
);