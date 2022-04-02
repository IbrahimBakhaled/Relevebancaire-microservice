DROP TABLE IF EXISTS acteur;
DROP TABLE IF EXISTS banque;
DROP TABLE IF EXISTS comptebancaire;
DROP TABLE IF EXISTS lignereleve;
DROP TABLE IF EXISTS operationcredit;
DROP TABLE IF EXISTS produit;
DROP TABLE IF EXISTS relevebancaire;

CREATE TABLE `acteur` (
  `acteur_id` int NOT NULL,
  `nom_acteur` varchar(255) DEFAULT NULL,
  `prenom_acteur` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`acteur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `banque` (
  `banque_id` int NOT NULL,
  `nom_banque` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`banque_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `comptebancaire` (
  `compte_bancaire_id` int NOT NULL AUTO_INCREMENT,
  `code_swift` varchar(255) DEFAULT NULL,
  `rib` varchar(255) DEFAULT NULL,
  `fk_acteur` int DEFAULT NULL,
  `fk_banque` int DEFAULT NULL,
  PRIMARY KEY (`compte_bancaire_id`),
  KEY `FK3uwtq8ql8jsjesvjycs4fwtko` (`fk_acteur`),
  KEY `FKnimidimh0b7wueqmehq57hl9j` (`fk_banque`),
  CONSTRAINT `FK3uwtq8ql8jsjesvjycs4fwtko` FOREIGN KEY (`fk_acteur`) REFERENCES `acteur` (`acteur_id`),
  CONSTRAINT `FKnimidimh0b7wueqmehq57hl9j` FOREIGN KEY (`fk_banque`) REFERENCES `banque` (`banque_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `lignereleve` (
  `ligne_releve_id` bigint NOT NULL AUTO_INCREMENT,
  `credit_debit` varchar(255) DEFAULT NULL,
  `date_operation` date DEFAULT NULL,
  `mode_paiment` varchar(255) DEFAULT NULL,
  `montant` decimal(19,2) DEFAULT NULL,
  `operation_nature` varchar(255) DEFAULT NULL,
  `ref_cdg` int NOT NULL,
  `ref_paiment` int NOT NULL,
  `fk_releve_bancaire` bigint DEFAULT NULL,
  PRIMARY KEY (`ligne_releve_id`),
  KEY `FKr61nwbjfj0vs8gavwj3k0rsum` (`fk_releve_bancaire`),
  CONSTRAINT `FKr61nwbjfj0vs8gavwj3k0rsum` FOREIGN KEY (`fk_releve_bancaire`) REFERENCES `relevebancaire` (`releve_bancaire_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `operationcredit` (
  `dtype` varchar(31) NOT NULL,
  `operation_credit_id` bigint NOT NULL,
  `operation_date` date DEFAULT NULL,
  `numero_cheque` int DEFAULT NULL,
  `cin` varchar(255) DEFAULT NULL,
  `nom_emetteur` varchar(255) DEFAULT NULL,
  `prenom_emetteur` varchar(255) DEFAULT NULL,
  `rib` varchar(255) DEFAULT NULL,
  `fk_ligne_releve` bigint DEFAULT NULL,
  PRIMARY KEY (`operation_credit_id`),
  KEY `FKc3a8jum666j07k36jvun8nwt0` (`fk_ligne_releve`),
  CONSTRAINT `FKc3a8jum666j07k36jvun8nwt0` FOREIGN KEY (`fk_ligne_releve`) REFERENCES `lignereleve` (`ligne_releve_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `produit` (
  `produit_id` bigint NOT NULL,
  `produit_code` varchar(255) DEFAULT NULL,
  `produit_label` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`produit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `relevebancaire` (
  `releve_bancaire_id` bigint NOT NULL AUTO_INCREMENT,
  `date_reception` date DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL,
  `nbr_lignes` int NOT NULL,
  `nbr_operation_credit` int NOT NULL,
  `nbr_operation_debit` int NOT NULL,
  `solde_initial` decimal(19,2) DEFAULT NULL,
  `sole_final` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`releve_bancaire_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM `Releve-Bancaire-CDG`.operationcredit;