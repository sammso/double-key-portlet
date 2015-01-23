create table DK_Test (
	testOneId VARCHAR(75) not null,
	testTwoId VARCHAR(75) not null,
	payload VARCHAR(75) null,
	modified STRING null,
	primary key (testOneId, testTwoId)
);