/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.content.impl.serialize.impl.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author ieb
 *
 */
public class AllTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite(
				"Test for org.sakaiproject.content.impl.serialize.impl.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(ProfileSerializerTest.class);
		suite.addTestSuite(ByteStorageConversionTest.class);
		suite.addTestSuite(Type1BaseContentResourceSerializerTest.class);
		suite.addTestSuite(Type1BaseContentCollectionSerializerTest.class);
		//$JUnit-END$
		return suite;
	}

}
