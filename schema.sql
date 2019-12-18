

-- -----------------------------------------------------
-- Schema stock
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema stock
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `stock` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `stock` ;

-- -----------------------------------------------------
-- Table `stock`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stock`.`user` (
  `us_id` INT NOT NULL AUTO_INCREMENT,
  `us_name` VARCHAR(60) NULL,
  `us_password` VARCHAR(100) NULL,
  `us_email` VARCHAR(30) NULL,
  `us_mobile_number` BIGINT(12) NULL,
  `us_confirmed_status` BOOLEAN NULL,
  PRIMARY KEY (`us_id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `stock`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stock`.`role` (
  `ro_id` INT NOT NULL AUTO_INCREMENT,
  `ro_name` VARCHAR(45) NULL,
  PRIMARY KEY (`ro_id`))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `stock`.`user_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stock`.`user_role` (
  `ur_id` INT NOT NULL AUTO_INCREMENT,
  `ur_us_id` INT NULL,
  `ur_ro_id` INT NULL,
  PRIMARY KEY (`ur_id`),
  INDEX `ur_us_fk_idx` (`ur_us_id` ASC),
  INDEX `ur_ro_fk_idx` (`ur_ro_id` ASC),
  CONSTRAINT `ur_us_fk`
    FOREIGN KEY (`ur_us_id`)
    REFERENCES `stock`.`user` (`us_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ur_ro_fk`
    FOREIGN KEY (`ur_ro_id`)
    REFERENCES `stock`.`role` (`ro_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `stock`.`user`
-- -----------------------------------------------------


CREATE TABLE IF NOT EXISTS `stock`.`confirmation` (
  `co_id` INT NOT NULL AUTO_INCREMENT,
  `co_token` VARCHAR(100) NULL,
  `co_us_name` VARCHAR(60) NULL,
  
  PRIMARY KEY (`co_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `stock`.`sector` (
  `se_id` INT NOT NULL AUTO_INCREMENT,
  `se_sector_name` VARCHAR(30)  NULL,
  `se_brief` VARCHAR(400)  NULL,
   PRIMARY KEY (`se_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `stock`.`company` (
  `cp_id` INT NOT NULL AUTO_INCREMENT,
  `cp_name` VARCHAR(30) NULL,
  `cp_turnover` BIGINT  NULL,
  `cp_ceo` VARCHAR(30)  NULL,
  `cp_board_of_directors` VARCHAR(200) NUll,
  `cp_listed` BOOLEAN DEFAULT FALSE,
  `cp_image` VARCHAR(300) NULL,
  `cp_se_id` INT  NULL,
  `cp_brief` VARCHAR(600) NULL,
  PRIMARY KEY (`cp_id`),
  INDEX `cp_se_fk_idx` (`cp_se_id` ASC),
  CONSTRAINT `cp_se_fk`
    FOREIGN KEY (`cp_se_id`)
    REFERENCES `stock`.`sector` (`se_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `stock`.`stock_exchange` (
  `ex_id` INT NOT NULL AUTO_INCREMENT,
  `ex_stock_exchange` VARCHAR(30)  NULL,
  `ex_brief` VARCHAR(400)  NULL,
  `ex_image` VARCHAR(300) NULL,
  `ex_address` VARCHAR(200)  NULL,
  `ex_remarks` VARCHAR(500)  NULL,
  PRIMARY KEY (`ex_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `stock`.`stock_price` (
  `sp_id` INT NOT NULL AUTO_INCREMENT,
  `sp_company_code` INT  NULL,
  `sp_stock_exchange` VARCHAR(30)  NULL,
  `sp_current_price` BIGINT  NULL,
  `sp_date` DATE  NULL,
  `sp_time` TIME(0)  NULL,
  PRIMARY KEY (`sp_id`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `stock`.`ipo` (
  `ipo_id` INT NOT NULL AUTO_INCREMENT,
  `ipo_cp_id` INT  NULL,
  `ipo_ex_id` INT  NULL,
  `ipo_share_price` BIGINT  NULL,
  `ipo_total_shares` BIGINT  NULL,
  `ipo_date` DATETIME  NULL,
  `ipo_remarks` VARCHAR(400) NULL,
  PRIMARY KEY (`ipo_id`),
  INDEX `ipo_cp_id_fk_idx` (`ipo_cp_id` ASC),
  CONSTRAINT `ipo_cp_fk`
    FOREIGN KEY (`ipo_cp_id`)
    REFERENCES `stock`.`company` (`cp_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
   INDEX `ipo_ex_id_fk_idx` (`ipo_ex_id` ASC),
  CONSTRAINT `ipo_ex_fk`
    FOREIGN KEY (`ipo_ex_id`)
    REFERENCES `stock`.`stock_exchange` (`ex_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `stock`.`company_stock` (
	`cs_id` INT NOT NULL AUTO_INCREMENT,
	`cs_cp_id` INT NULL,
	`cs_ex_id` INT NULL,
	PRIMARY KEY (`cs_id`),
	INDEX `cs_cp_fk_idx` (`cs_cp_id` ASC),
	INDEX `cs_ex_fk_idx` (`cs_ex_id` ASC),
	CONSTRAINT `cs_cp_fk`
		FOREIGN KEY (`cs_cp_id`)
		REFERENCES `stock`.`company` (`cp_id`)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT `cs_ex_fk`
		FOREIGN KEY (`cs_ex_id`)
		REFERENCES `stock`.`stock_exchange` (`ex_id`)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION)
	ENGINE = InnoDB;

select * from user;
delete from user where us_id=4;
select * from user;
select * from confirmation;
delete from user where us_id=2;
select * from role;
select * from user_role;

delete from user_role where ur_id=2;
insert into role values (1,"admin"),(2,"user");
insert into user_role (ur_us_id,ur_ro_id)values(1,2);
update user set us_password="$2a$10$UzFMT2Pqy4YsC49LwgP4UeNTnaSeoJM0MvSIWezDeBAw.G.i2V9Li" where us_id=1;


