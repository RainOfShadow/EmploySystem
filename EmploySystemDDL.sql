/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/7/13 20:56:10                           */
/*==============================================================*/


DROP TABLE IF EXISTS ACCOUNT_BEHAVIOR_LOG;

DROP TABLE IF EXISTS ACCOUNT_BEHAVIOR;

DROP TABLE IF EXISTS ADMINUSERADDITIONALINFO;

DROP TABLE IF EXISTS COMPANY;

DROP TABLE IF EXISTS COMPANY_RECRITMENT;

DROP TABLE IF EXISTS CONTRACT_INFO;

DROP TABLE IF EXISTS GRADUATE_INFO;

DROP TABLE IF EXISTS OTHER_RECOMMAND_STUFF;

DROP TABLE IF EXISTS RECRITMENT_INFO;

DROP TABLE IF EXISTS SCORE_SHEET;

DROP TABLE IF EXISTS SELF_REFERENCE_STUFF;

DROP TABLE IF EXISTS STATISTICS;

DROP TABLE IF EXISTS USER;

/*==============================================================*/
/* Table: ACCOUNT_BEHAVIOR_LOG                                  */
/*==============================================================*/
CREATE TABLE ACCOUNT_BEHAVIOR_LOG
(
   BEHAVIOR_ID          VARCHAR(13) NOT NULL,
   USERNAME             VARCHAR(20),
   BEHAVIOR_TIME        DATETIME,
   PRIMARY KEY (BEHAVIOR_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: ACCOUNT_BEHAVIOR                                      */
/*==============================================================*/
CREATE TABLE ACCOUNT_BEHAVIOR
(
   BEHAVIOR_ID          VARCHAR(13) NOT NULL,
   BEHAVIOR_DESCRIPTION LONGTEXT,
   BEHAVIOR_VALUE       VARCHAR(13),
   BEHAVIOR_TYPE        VARCHAR(10),
   PRIMARY KEY (BEHAVIOR_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: ADMINUSERADDITIONALINFO                               */
/*==============================================================*/
CREATE TABLE ADMINUSERADDITIONALINFO
(
   USERNAME             VARCHAR(20) NOT NULL,
   AUTHENTICATIONCODE   VARCHAR(10) NOT NULL,
   PRIMARY KEY (USERNAME, AUTHENTICATIONCODE)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
CREATE TABLE COMPANY
(
   COMPANY_ID           VARCHAR(15) NOT NULL,
   USERNAME             VARCHAR(20),
   COMPANY_NAME         VARCHAR(20),
   COMPANY_TELEPHONE    VARCHAR(11),
   COMPANY_EMAIL        VARCHAR(20),
   COMPANY_INSPECTION   VARCHAR(5),
   PRIMARY KEY (COMPANY_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: COMPANY_RECRITMENT                                    */
/*==============================================================*/
CREATE TABLE COMPANY_RECRITMENT
(
   COMPANY_ID           VARCHAR(15) NOT NULL,
   RECRITMENT_ID        VARCHAR(10) NOT NULL,
   RELEASE_TIME         DATETIME,
   PRIMARY KEY (COMPANY_ID, RECRITMENT_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: CONTRACT_INFO                                         */
/*==============================================================*/
CREATE TABLE CONTRACT_INFO
(
   ID_NUMBER            VARCHAR(18) NOT NULL,
   COMPANY_ID           VARCHAR(15) NOT NULL,
   SIGN_START_TIME      DATE,
   SIGN_END_TIME        DATE,
   SIGN_INFO            LONGTEXT,
   JOB_NAME             VARCHAR(10),
   PRIMARY KEY (ID_NUMBER, COMPANY_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: GRADUATE_INFO                                         */
/*==============================================================*/
CREATE TABLE GRADUATE_INFO
(
   GRADUATE_NAME        VARCHAR(10),
   ID_NUMBER            VARCHAR(18) NOT NULL,
   GRADUATE_STUDENT_ID  VARCHAR(20),
   USERNAME             VARCHAR(20),
   RECOMMEND_ID         VARCHAR(18),
   SELF_ID              VARCHAR(18),
   GRADUATE_SCHOOL      VARCHAR(30),
   GRADUATE_GENDER      BOOL,
   GRADUATE_NATION      VARCHAR(5),
   GRADUATE_EDU         VARCHAR(5),
   POLITICAL_STSTUS     VARCHAR(10),
   GRADUATE_EMAIL       VARCHAR(30),
   GRADUATE_PHONENUMBER VARCHAR(11),
   GRADUATE_ADDRESS     VARCHAR(40),
   DOMICILE_ADDRESS     VARCHAR(40),
   MARRIAGE_CONDITION   VARCHAR(2),
   TIME_LEAVE_SCHOOL    DATETIME,
   DESCRIPTION_LEAVE_SCHOOL LONGTEXT,
   TRAIN_EXPERIENCE     LONGTEXT,
   PRACTICE_EXPERIENCE  LONGTEXT,
   GRADUATE_RESUME      LONGTEXT,
   PRIMARY KEY (ID_NUMBER)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: OTHER_RECOMMAND_STUFF                                 */
/*==============================================================*/
CREATE TABLE OTHER_RECOMMAND_STUFF
(
   RECOMMEND_ID         VARCHAR(18) NOT NULL,
   REFERRER_NAME        VARCHAR(10),
   REFERRER_TELEPHONE   VARCHAR(11),
   RECOMMEND_TIME       DATE,
   RECOMMEND_DESCRIPTION LONGTEXT,
   ID_NUMBER            VARCHAR(18) NOT NULL,
   PRIMARY KEY (RECOMMEND_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: RECRITMENT_INFO                                       */
/*==============================================================*/
CREATE TABLE RECRITMENT_INFO
(
   RECRITMENT_ID        VARCHAR(10) NOT NULL,
   JOB_NAME             VARCHAR(10),
   JOB_DESCRIPTION      LONGTEXT,
   END_AWARD            FLOAT,
   SALARY               FLOAT,
   NEED_NUMBER          INT,
   RECRITED_NUMBER      INT,
   DEADLINE             DATETIME,
   PRIMARY KEY (RECRITMENT_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: SCORE_SHEET                                           */
/*==============================================================*/
CREATE TABLE SCORE_SHEET
(
   GRADUATE_SCHOOL      VARCHAR(30) NOT NULL,
   GRADUATE_STUDENT_ID  VARCHAR(20) NOT NULL,
   SUBJECT              VARCHAR(10),
   SCORE                FLOAT,
   PRIMARY KEY (GRADUATE_STUDENT_ID, GRADUATE_SCHOOL)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: SELF_REFERENCE_STUFF                                  */
/*==============================================================*/
CREATE TABLE SELF_REFERENCE_STUFF
(
   SELF_ID              VARCHAR(18) NOT NULL,
   SELF_REFERENCE_TIME  DATE,
   SELF_REFERENCE_INTENTION LONGTEXT,
   SELF_REFERENCE_SALARY FLOAT,
   WORK_TIME            FLOAT,
   SELF_REFERENCE_DESCRIPTION LONGTEXT,
   PRIMARY KEY (SELF_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: STATISTICS                                            */
/*==============================================================*/
CREATE TABLE STATISTICS
(
   STATISTICS_ID        VARCHAR(18) NOT NULL,
   JOB_NAME             VARCHAR(10),
   EMPLOY_NUMBER        INT,
   EMPLOYMENT           FLOAT,
   STATISTICS_START     DATETIME,
   STATISTICS_END       DATETIME,
   PRIMARY KEY (STATISTICS_ID)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
CREATE TABLE USER
(
   USERNAME              VARCHAR(20) NOT NULL,
   PASSWORD              VARCHAR(50),
   ROLE                  VARCHAR(10),
   ACCOUNTNONEXPIRED     TINYINT(1),
   ACCOUNTNONLOCKED      TINYINT(1),
   CREDENTIALSNONEXPIRED TINYINT(1),
   ENABLED               TINYINT(1),
   PRIMARY KEY (USERNAME)
)DEFAULT CHARACTER SET = utf8,
                      COLLATE = utf8_general_ci;
