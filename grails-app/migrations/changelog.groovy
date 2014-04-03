databaseChangeLog = {

    changeSet(author: "antonio (generated)", id: "1371285599177-1") {
        createTable(tableName: "ASSET") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054537", primaryKeyTablespace: "USERS")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-2") {
        createTable(tableName: "DERIVATIVE") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054539", primaryKeyTablespace: "USERS")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-3") {
        createTable(tableName: "INSTRUMENT") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054541", primaryKeyTablespace: "USERS")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-4") {
        createTable(tableName: "PERSISTABLE") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054547", primaryKeyTablespace: "USERS")
            }

            column(name: "VERSION", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "DATE_CREATED", type: "DATE") {
                constraints(nullable: "false")
            }

            column(name: "LAST_UPDATED", type: "DATE") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR2(255 BYTE)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-5") {
        createTable(tableName: "PORTFOLIO") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054549", primaryKeyTablespace: "USERS")
            }

            column(name: "DESCRIPTION", type: "VARCHAR2(255 BYTE)")
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-6") {
        createTable(tableName: "PORTFOLIO_ITEM") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054555", primaryKeyTablespace: "USERS")
            }

            column(name: "VERSION", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "AMOUNT", type: "NUMBER(10,0)") {
                constraints(nullable: "false")
            }

            column(name: "INSTRUMENT_ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "PORTFOLIO_ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "ITEMS_IDX", type: "NUMBER(10,0)")
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-7") {
        createTable(tableName: "ROLE") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054559", primaryKeyTablespace: "USERS")
            }

            column(name: "VERSION", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "AUTHORITY", type: "VARCHAR2(255 BYTE)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-8") {
        createTable(tableName: "STOCK") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054562", primaryKeyTablespace: "USERS")
            }

            column(name: "DESCRIPTION", type: "VARCHAR2(255 BYTE)")
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-9") {
        createTable(tableName: "TRADE") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054571", primaryKeyTablespace: "USERS")
            }

            column(name: "VERSION", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "AMOUNT", type: "NUMBER(10,0)") {
                constraints(nullable: "false")
            }

            column(name: "COST", type: "FLOAT(126)") {
                constraints(nullable: "false")
            }

            column(name: "INSTRUMENT_ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "PRICE", type: "FLOAT(126)") {
                constraints(nullable: "false")
            }

            column(name: "TRADE_ACTION", type: "VARCHAR2(255 BYTE)") {
                constraints(nullable: "false")
            }

            column(name: "TRANSACTION_DATE", type: "DATE") {
                constraints(nullable: "false")
            }

            column(name: "TRANSACTIONS_IDX", type: "NUMBER(10,0)")
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-10") {
        createTable(tableName: "USER_BEAN") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054580", primaryKeyTablespace: "USERS")
            }

            column(name: "VERSION", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "ACCOUNT_EXPIRED", type: "NUMBER(1,0)") {
                constraints(nullable: "false")
            }

            column(name: "ACCOUNT_LOCKED", type: "NUMBER(1,0)") {
                constraints(nullable: "false")
            }

            column(name: "ENABLED", type: "NUMBER(1,0)") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR2(255 BYTE)") {
                constraints(nullable: "false")
            }

            column(name: "PASSWORD_EXPIRED", type: "NUMBER(1,0)") {
                constraints(nullable: "false")
            }

            column(name: "USERNAME", type: "VARCHAR2(255 BYTE)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-11") {
        createTable(tableName: "USER_ROLE") {
            column(name: "ROLE_ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }

            column(name: "USER_ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-12") {
        createTable(tableName: "VANILLA") {
            column(name: "ID", type: "NUMBER(19,0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_C0054586", primaryKeyTablespace: "USERS")
            }
        }
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-13") {
        addPrimaryKey(columnNames: "ROLE_ID, USER_ID", constraintName: "SYS_C0054584", tableName: "USER_ROLE", tablespace: "USERS")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-14") {
        addUniqueConstraint(columnNames: "AUTHORITY", constraintName: "SYS_C0054560", deferrable: "false", disabled: "false", initiallyDeferred: "false", tableName: "ROLE", tablespace: "USERS")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-15") {
        addUniqueConstraint(columnNames: "USERNAME", constraintName: "SYS_C0054581", deferrable: "false", disabled: "false", initiallyDeferred: "false", tableName: "USER_BEAN", tablespace: "USERS")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-21") {
        createSequence(schemaName: "DTMC_DEV", sequenceName: "HIBERNATE_SEQUENCE")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-16") {
        addForeignKeyConstraint(baseColumnNames: "INSTRUMENT_ID", baseTableName: "PORTFOLIO_ITEM", baseTableSchemaName: "DTMC_DEV", constraintName: "FK7C73BAA483C5B0", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "INSTRUMENT", referencedTableSchemaName: "DTMC_DEV", referencesUniqueColumn: "false")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-17") {
        addForeignKeyConstraint(baseColumnNames: "PORTFOLIO_ID", baseTableName: "PORTFOLIO_ITEM", baseTableSchemaName: "DTMC_DEV", constraintName: "FK7C73BAA753958A4", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PORTFOLIO", referencedTableSchemaName: "DTMC_DEV", referencesUniqueColumn: "false")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-18") {
        addForeignKeyConstraint(baseColumnNames: "INSTRUMENT_ID", baseTableName: "TRADE", baseTableSchemaName: "DTMC_DEV", constraintName: "FK697F164483C5B0", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "INSTRUMENT", referencedTableSchemaName: "DTMC_DEV", referencesUniqueColumn: "false")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-19") {
        addForeignKeyConstraint(baseColumnNames: "ROLE_ID", baseTableName: "USER_ROLE", baseTableSchemaName: "DTMC_DEV", constraintName: "FK143BF46AECAAFFCD", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "ROLE", referencedTableSchemaName: "DTMC_DEV", referencesUniqueColumn: "false")
    }

    changeSet(author: "antonio (generated)", id: "1371285599177-20") {
        addForeignKeyConstraint(baseColumnNames: "USER_ID", baseTableName: "USER_ROLE", baseTableSchemaName: "DTMC_DEV", constraintName: "FK143BF46A77354C7D", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "USER_BEAN", referencedTableSchemaName: "DTMC_DEV", referencesUniqueColumn: "false")
    }
}
