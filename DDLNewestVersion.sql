create table ACCOUNT_BEHAVIOR
(
	BEHAVIOR_ID varchar(13) not null
		primary key,
	BEHAVIOR_DESCRIPTION longtext null,
	BEHAVIOR_VALUE varchar(13) null,
	BEHAVIOR_TYPE varchar(10) null
)
charset=utf8;

create table ACCOUNT_BEHAVIOR_LOG
(
	BEHAVIOR_ID varchar(13) not null,
	USERNAME varchar(20) null,
	BEHAVIOR_TIME datetime null,
	LOG_ID char(20) not null
		primary key
)
charset=utf8;

create table ADMINUSERADDITIONALINFO
(
	USERNAME varchar(20) not null,
	AUTHENTICATIONCODE varchar(10) not null,
	primary key (USERNAME, AUTHENTICATIONCODE)
)
charset=utf8;

create table COMPANY
(
	ID varchar(15) not null
		primary key,
	NAME varchar(20) null,
	USERNAME varchar(20) null,
	CONTRACTNO varchar(11) null,
	EMAILADDRESS varchar(20) null,
	ANNUALINSPECTIONSTATUS varchar(50) null
)
charset=utf8;

create table COMPANY_RECRITMENT
(
	COMPANY_ID varchar(15) not null,
	RECRITMENT_ID varchar(10) not null,
	RELEASE_TIME datetime null,
	primary key (COMPANY_ID, RECRITMENT_ID)
)
charset=utf8;

create table CONTRACT_INFO
(
	ID_NUMBER varchar(18) not null,
	COMPANY_ID varchar(15) not null,
	SIGN_START_TIME date null,
	SIGN_END_TIME date null,
	SIGN_INFO longtext null,
	JOB_NAME varchar(10) null,
	primary key (ID_NUMBER, COMPANY_ID)
)
charset=utf8;

create table GRADUATE_INFO
(
	IDCARDNO varchar(18) not null
		primary key,
	NAME varchar(10) null,
	USERNAME varchar(20) null,
	SCHOOLNO varchar(30) null,
	OTHERSREFERRALSTUFFID varchar(40) null,
	SELFREFERRALSTUFFID varchar(40) null,
	SCHOOL varchar(20) null,
	SEX tinyint(1) null,
	NATIONAL varchar(20) null,
	DEGREE varchar(20) null,
	POLITICALLANDSCAPE varchar(20) null,
	EMAILADDRESS varchar(30) null,
	CONTRACTNO varchar(20) null,
	ADDRESS varchar(40) null,
	HOUSEHOLDREGISTRATION varchar(40) null,
	MARITALSTATUS varchar(20) null,
	SCHOOLLEFTTIME datetime null,
	SCHOOLLEFTINFO longtext null,
	TRAININFO longtext null,
	PRACTICEEXPERIENCE longtext null,
	RESUME longtext null
)
charset=utf8;

create table OTHER_RECOMMAND_STUFF
(
	RECOMMEND_ID varchar(18) not null
		primary key,
	REFERRER_NAME varchar(10) null,
	REFERRER_TELEPHONE varchar(11) null,
	RECOMMEND_TIME date null,
	RECOMMEND_DESCRIPTION longtext null,
	ID_NUMBER varchar(18) not null
)
charset=utf8;

create table RECRITMENT_INFO
(
	RECRITMENT_ID varchar(10) not null
		primary key,
	JOB_NAME varchar(10) null,
	JOB_DESCRIPTION longtext null,
	END_AWARD float null,
	SALARY float null,
	NEED_NUMBER int null,
	RECRITED_NUMBER int null,
	DEADLINE datetime null
)
charset=utf8;

create table SCORE_SHEET
(
	GRADUATE_SCHOOL varchar(30) not null,
	GRADUATE_STUDENT_ID varchar(20) not null,
	SUBJECT varchar(10) null,
	SCORE float null,
	primary key (GRADUATE_STUDENT_ID, GRADUATE_SCHOOL)
)
charset=utf8;

create table SELF_REFERENCE_STUFF
(
	SELF_ID varchar(18) not null
		primary key,
	SELF_REFERENCE_TIME date null,
	SELF_REFERENCE_INTENTION longtext null,
	SELF_REFERENCE_SALARY float null,
	WORK_TIME float null,
	SELF_REFERENCE_DESCRIPTION longtext null
)
charset=utf8;

create table STATISTICS
(
	STATISTICS_ID varchar(18) not null
		primary key,
	JOB_NAME varchar(10) null,
	EMPLOY_NUMBER int null,
	EMPLOYMENT float null,
	STATISTICS_START datetime null,
	STATISTICS_END datetime null
)
charset=utf8;

create table USER
(
	USERNAME varchar(20) not null,
	PASSWORD varchar(50) null,
	ROLE varchar(10) null,
	ACCOUNTNONEXPIRED tinyint(1) null,
	ACCOUNTNONLOCKED tinyint(1) null,
	CREDENTIALSNONEXPIRED tinyint(1) null,
	ENABLED tinyint(1) null
)
charset=utf8;

create table User
(
	id varchar(20) not null,
	name varchar(20) null,
	org_id varchar(20) null,
	email varchar(20) null,
	phone char(20) null,
	primary key (id, USERNAME, USERNAME, id)
);


