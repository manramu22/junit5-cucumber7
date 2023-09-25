package org.example.runner;

import org.junit.platform.suite.api.ExcludeEngines;
import org.junit.platform.suite.api.Suite;

@Suite
@ExcludeEngines("cucumber")
public class TestRunner {

}
