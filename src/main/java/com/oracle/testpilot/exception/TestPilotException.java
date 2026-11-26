/*
 ** Oracle Test Pilot
 **
 ** Copyright (c) 2025-2026 Oracle
 ** Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl/
 */
package com.oracle.testpilot.exception;

/**
 * @author LLEFEVRE
 * @since 1.0.0
 */
public class TestPilotException extends RuntimeException {
	public static final int UNKNOWN_COMMAND_LINE_ARGUMENT = 1;
	public static final int WRONG_OCI_SERVICE_PARAMETER = 2;
	public static final int CREATE_DATABASE_WRONG_USER_NAME_LENGTH = 3;
	public static final int WRONG_MAIN_CONTROLLER_URI = 4;
	public static final int CREATE_DATABASE_REST_ENDPOINT_ISSUE = 5;
	public static final int CREATE_DATABASE_WRONG_USER_NAME = 6;
	public static final int WRONG_MAIN_CONTROLLER_REST_CALL = 7;
	public static final int RETRIEVE_OAUTH2_TOKEN = 8;
	public static final int TOO_MANY_USERS_PROVIDED = 9;
	public static final int CREATE_DATABASE_MISSING_USER_NAME = 10;
	public static final int CONNECTION_STRING_FORMAT_MISSING_PARAMETER = 11;
	public static final int CREATE_DATABASE_MISSING_DB_TYPE = 12;
	public static final int SKIP_TESTING_MISSING_OWNER = 13;
	public static final int SKIP_TESTING_MISSING_REPOSITORY = 14;
	public static final int SURROUND_CONNECTION_STRING_WITH_DOUBLE_QUOTES_MISSING_PARAMETER = 15;
	public static final int SKIP_TESTING_MISSING_PREFIX_LIST = 16;
	public static final int SKIP_TESTING_WRONG_URI = 17;
	public static final int SKIP_TESTING_WRONG_REST_CALL = 18;
	public static final int SKIP_TESTING_REST_ENDPOINT_ISSUE = 19;
	public static final int USER_MISSING_PARAMETER = 20;
	public static final int USER_PARAMETER_TOO_LONG = 21;
	public static final int OCI_SERVICE_MISSING_PARAMETER = 22;
	public static final int PREFIX_LIST_MISSING_PARAMETER = 23;
	public static final int OWNER_MISSING_PARAMETER = 24;
	public static final int REPOSITORY_MISSING_PARAMETER = 25;
	public static final int CREATE_REGISTRATION_TOKEN_MISSING_CLIENT_ID = 26;
	public static final int PULL_REQUEST_NUMBER_MISSING_PARAMETER = 27;
	public static final int SKIP_TESTING_MISSING_PULL_REQUEST_NUMBER = 28;
	public static final int DROP_DATABASE_WRONG_USER_NAME_LENGTH = 30;
	public static final int DROP_DATABASE_WRONG_USER_NAME = 31;
	public static final int DROP_DATABASE_MISSING_USER_NAME = 32;
	public static final int DROP_DATABASE_MISSING_DB_TYPE = 33;
	public static final int DROP_DATABASE_REST_ENDPOINT_ISSUE = 34;
	public static final int CREATE_REGISTRATION_TOKEN_MISSING_CLIENT_SECRET = 35;
	public static final int CREATE_REGISTRATION_TOKEN_MISSING_TOKEN = 36;
	public static final int WRONG_CREATE_REGISTRATION_TOKEN_URI = 37;
	public static final int WRONG_CREATE_REGISTRATION_TOKEN_REST_CALL = 38;
	public static final int OWNER_TYPE_MISSING_PARAMETER = 39;
	public static final int WRONG_PROVIDE_REGISTRATION_TOKEN_URI = 40;
	public static final int WRONG_PROVIDE_REGISTRATION_TOKEN_REST_CALL = 41;
	public static final int RETRIEVE_REGISTRATION_TOKEN = 42;
	public static final int CREATE_REGISTRATION_TOKEN_REST_ENDPOINT_ISSUE = 43;
	public static final int FULLY_QUALIFIED_NAMES_MISSING_PARAMETER = 44;
	public static final int GITHUB_OUTPUT_MISSING_ENV = 45;
	public static final int RUNID_MISSING_ENV = 46;
	public static final int JOBID_MISSING_ENV = 47;
	public static final int API_HOST_MISSING_ENV = 48;
	public static final int CLIENT_ID_MISSING_ENV = 49;
	public static final int TOKEN_MISSING_ENV = 50;
	public static final int INIT_SQL_SCRIPT_PATH_MISSING_PARAMETER = 51;
	public static final int INIT_SQL_SCRIPT_PATH_NOT_FOUND = 52;
	public static final int INIT_SQL_SCRIPT_PATH_IO_ERROR = 53;
	public static final int INIT_SQL_SCRIPT_PATH_TOO_BIG = 54;
	public static final int UNAUTHORIZED_SQL_STATEMENT_IN_INIT_SQL_SCRIPT = 55;

	private final int errorCode;

	public TestPilotException(final int errorCode, final Throwable cause) {
		super(String.valueOf(errorCode), cause);
		this.errorCode = errorCode;
	}

	public TestPilotException(final int errorCode) {
		this(errorCode, null);
	}

	public int getErrorCode() {
		return errorCode;
	}
}
