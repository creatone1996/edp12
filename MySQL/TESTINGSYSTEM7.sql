USE testingsystem3;

-- cau 1
drop TRIGGER IF EXISTS CHECK_CREATE_DATE1;
DELIMITER $$
CREATE TRIGGER CHECK_CREATE_DATE1
BEFORE INSERT ON `group`
FOR EACH ROW
	BEGIN
    DECLARE V_CREATEDATE DATETIME;
    SET V_CREATEDATE = DATE_sub(now(), interval 1 year);
    IF NEW.CREATEDATE < V_CREATEDATE then
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT='KHONG THE TAO MOI GROUP DO NGAY TAO KHONG HOP LE';
	END IF;
	END $$
DELIMITER ;
INSERT INTO `testingsystem3`.`Group` ( groupID , GROUPNAME, CreatorID , CreateDate)
VALUES (16,'ABCD2' , 6
,'2010-03-05 00:00:00');
SELECT current_timestamp();


-- cau 2
drop TRIGGER IF EXISTS CHECK_CREATE_USER;
DELIMITER $$
CREATE TRIGGER CHECK_CREATE_USER
BEFORE INSERT ON `ACCOUNT`
FOR EACH ROW
	BEGIN
    DECLARE V_DEPARTMENTID MEDIUMINT;
    SELECT DEPARTMENTID INTO V_DEPARTMENTID FROM DEPARTMENT WHERE departmentNAME = 'SALE';
    IF NEW.DEPARTMENTID = V_DEPARTMENTID THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT= 'THI PHONG SALE KHONG THE NHAN THEM NGUOI';
	END IF;
	END $$
DELIMITER ;

insert into `testingsystem3`.`account` (ACCOUNTID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values
(260,'tchastang1121f@wiley.com', 'tchast34ang1f', 'Tho34rnie Chastang', 8, 4, '2018-03-05 00:00:00');


-- cau 3
drop TRIGGER IF EXISTS CHECK_CREATE_USER1;
DELIMITER $$
CREATE TRIGGER CHECK_CREATE_USER1
BEFORE INSERT ON `ACCOUNT`
FOR EACH ROW
	BEGIN
    DECLARE V_DEPARTMENTID MEDIUMINT;
    SELECT DEPARTMENTID INTO V_DEPARTMENTID FROM DEPARTMENT WHERE departmentNAME = 'SALE';
    IF NEW.DEPARTMENTID = V_DEPARTMENTID THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT= 'THI PHONG SALE KHONG THE NHAN THEM NGUOI';
	END IF;
	END $$
DELIMITER ;


drop TRIGGER IF EXISTS CHECK_CREATE_GROUP;
DELIMITER $$
CREATE TRIGGER CHECK_CREATE_GROUP
BEFORE INSERT ON GROUPACCOUNT 
FOR EACH ROW
	BEGIN
    DECLARE V_ACCOUNT MEDIUMINT;
    SELECT COUNT(ACCOUNTID) INTO V_ACCOUNT FROM groupaccount WHERE GroupID = NEW.GroupID;
    IF V_ACCOUNT >= 18 THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT= 'PHONG BAN DA DU 18 NGUOI';
	END IF;
	END $$
DELIMITER ;

-- cau 5
DROP TRIGGER IF EXISTS CAU5;
DELIMITER $$
CREATE TRIGGER CAU5
BEFORE DELETE ON `ACCOUNT`
FOR EACH ROW
BEGIN
	DECLARE v_accountid int;
    SELECT accountid into v_accountid from `account` WHERE v_accountid = old.accountid;
    IF OLD.EMAIL = 'ADMIN@GMAIL.COM' THEN
	SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = ' KHONG THE XOA TAI KHOAN ADMIN';
    ELSEIF OLD.EMAIL != 'ADMIN@GMAIL.COM' THEN
    DELETE from groupaccount where AccountID = v_accountid;
    UPDATE question set CreatorID = null  where (CreatorID = v_accountid);
    UPDATE `group` set CreatorID = null  where (CreatorID = v_accountid);
    UPDATE exam set CreatorID = null  where (CreatorID = v_accountid);
    end if;
END $$
DELIMITER ;


DELETE
FROM testingsystem3.`ACCOUNT`
WHERE accountid = 212;


-- cau 6
DROP TRIGGER IF EXISTS CAU6;
DELIMITER $$
CREATE TRIGGER CAU6
BEFORE INSERT ON `ACCOUNT`
FOR EACH ROW
BEGIN
	DECLARE V_DEPARTMENTID INT;
    SELECT DEPARTMENTID INTO V_DEPARTMENTID FROM DEPARTMENT WHERE DEPARTMENTNAME = 'sale';
    IF NEW.DEPARTMENTID IS NULL THEN
    SET NEW.DEPARTMENTID = V_DEPARTMENTID ;
    END IF;
END $$
DELIMITER ;
 SELECT DEPARTMENTID  FROM DEPARTMENT WHERE DEPARTMENTNAME = 'SALE';
insert into testingsystem3.`ACCOUNT` (ACCOUNTID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values
(323, 't61413203@31uQ238c3Re36231fo4rge.3net', 'th123613R0338o44112233w1Q23g12e11go6', 'TafFDEE116043R2331233313113f31y Howge44go', null , 2, '2019-09-27');

-- CAU 7
drop TRIGGER IF EXISTS CAU7;
DELIMITER $$
CREATE TRIGGER CAU7
BEFORE INSERT ON answer
FOR EACH ROW
	BEGIN
    DECLARE V_QUESTION, V_ICORRECT MEDIUMINT;
    SELECT *, count(QUESTIONID) INTO V_QUESTION FROM ANSWER 
    GROUP BY QUESTIONID;
    SELECT *, COUNT(isCorrect) into V_ICORRECT FROM answer
    GROUP BY QuestionID HAVING isCorrect = 1; 
	IF V_QUESTION >= 4 THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT= 'DE THI DA DU 4 CAU HOI';
	END IF;
end $$
DELIMITER ;

insert into Answer (answerID, CONTENT, QuestionID, isCorrect) values ('Answers VTI 4185', 91, 1);


insert into testingsystem3.answer (answerid, content, QuestionID, isCorrect) values (261,'Answers VTI 8050', 26, 0);
insert into  testingsystem3.Answer (answerid, content, QuestionID, isCorrect) values (260,'Answers VTI 8080', 253, 1);

-- cau 8
DROP TRIGGER IF EXISTS CAU8;
DELIMITER $$
CREATE TRIGGER CAU8
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN
	IF NEW.GENDER = 'NAM' THEN
    SET NEW.GENDER = 'M';
    ELSEIF NEW.GENDER = 'NU' THEN
    SET NEW.GENDER = 'F';
    ELSEIF NEW.GENDER = 'CHUA RO' THEN
    SET NEW.GENDER = 'U';
    END IF;
END $$
DELIMITER ;

insert into testingsystem3.`ACCOUNT` (ACCOUNTID, Email, Username, FullName, DepartmentID, PositionID, CreateDate, GENDER) values
(317, 't614173203@1uQcRe36231fo4rge.3net', 'th126127R033o441123w1Q23g12e11go6', 'TafFDEE1160743R312313113f31y Howge44go', 4 , 2, '2019-09-27', 'NAM');


-- cau 9

DROP TRIGGER IF EXISTS CAU9;
DELIMITER $$
CREATE TRIGGER CAU9
BEFORE DELETE ON exam
FOR EACH ROW
BEGIN
	DECLARE H_CREATEDATE DATETIME;
    SET  H_CREATEDATE = date_sub(NOW(), interval 2 DAY);
	IF OLD.CREATEDATE < H_CREATEDATE THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'KHONG THE XOA BAI THI';
    END IF;
END $$
DELIMITER ;

DELETE FROM EXAM
WHERE EXAMID = 9;


-- CAU 10
DROP TRIGGER IF EXISTS CAU10;
DELIMITER $$
CREATE TRIGGER CAU10
BEFORE DELETE ON question
FOR EACH ROW
BEGIN
	DELETE from exam 
    where questionid != old.questionid;
    end $$
DELIMITER ;

DELETE 
FROM testingsystem3.question
WHERE QuestionID = 5;
SELECT * from testingsystem3.question;

SELECT *, count(a.questionid)  FROM QUESTION AS A
    LEFT JOIN examquestion AS B ON A.QuestionID = B.QuestionID
    GROUP BY a.questionid;
    
    SELECT * from examquestion
    GROUP BY questionid;
-- CAU 12
DROP TRIGGER IF EXISTS CAU12;
DELIMITER $$
CREATE TRIGGER CAU12
BEFORE DELETE ON question
FOR EACH ROW
BEGIN
	DELETE from exam 
    where questionid <> old.question;
    end $$
DELIMITER ;
SELECT count(*)

INSERT INTO Exam (EXAMID,`Code` , Title , CategoryID
, Duration , CreatorID , CreateDate )
VALUES (107,'VTIQ001' , N'Đề thi C#' ,
1 , 35 , '5' ,'2019-04-05');