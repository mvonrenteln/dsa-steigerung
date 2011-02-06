package dsa.util

import grails.test.*

class EnumHelperTests  extends GrailsUnitTestCase{

	enum TestEnum {
		TEST1, TEST_2, EXTRA_LONG_TEST
	}

	enum TestEnum2 {
		TEST1, TEST_2, TEST3 ("Other Test"), UEBUNG, VERSTAENDIGUNG

		TestEnum2() {
			this.name = EnumHelper.enumToString(this)
		}

		TestEnum2(String name) {
			this.name = name
		}

		String toString() {
			return name
		}

		String name
	}

	protected void setUp() {
		super.setUp()
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testEnumToString() {
		assert EnumHelper.enumToString(TestEnum.TEST1) == "Test1"
		assert EnumHelper.enumToString(TestEnum.TEST_2) == "Test 2"
		assert EnumHelper.enumToString(TestEnum.EXTRA_LONG_TEST) == "Extra Long Test"
	}

	void testEnumToStringUsageInEnum() {
		assert TestEnum2.TEST1.toString() == "Test1"
		assert TestEnum2.TEST_2.toString() == "Test 2"
		assert TestEnum2.TEST3.toString() == "Other Test"
	}

	void testEnumToStringWithUmlaut() {
		assert TestEnum2.UEBUNG.toString() == "Übung"
		assert TestEnum2.VERSTAENDIGUNG.toString() == "Verständigung"
	}
}
