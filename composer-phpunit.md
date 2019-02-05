# Composer
is a tool for dependency management in PHP. It allows you to declare the libraries your project depends on and it will manage (install/update) them for you.

---

# Autoloader
https://getcomposer.org/doc/01-basic-usage.md#autoloading

---

# Beginner's guide
https://www.codementor.io/jadjoubran/php-tutorial-getting-started-with-composer-8sbn6fb6t

---

# Tasks
- Use composer autoloader in your project
- Install phpunit as dev dependency

---

# Unit testing
is a level of software testing where individual units of a software are tested. The purpose is to validate that each unit of the software performs as designed.
- https://en.wikipedia.org/wiki/Unit_testing
- http://softwaretestingfundamentals.com/unit-testing/

---

# PHPUnit
https://phpunit.readthedocs.io/en/8.0/
:warning: Make sure you have the correct version of PHP

---

# PHPUnit test case sample
```
// tests/SillyTest.php
<?php
use PHPUnit\Framework\TestCase;

class SillyTest extends TestCase
{
    public function testMe()
    {
        $this->assertTrue(true);

    }
}
```

---

# Tasks
- Start with organizing your tests: https://phpunit.readthedocs.io/en/8.0/organizing-tests.html
- Provide tests for your classes, make sure you used:
- - Assertions: https://phpunit.readthedocs.io/en/8.0/assertions.html
- - Test exceptions: https://phpunit.readthedocs.io/en/8.0/writing-tests-for-phpunit.html#testing-exceptions
- - Data providers: https://phpunit.readthedocs.io/en/8.0/writing-tests-for-phpunit.html#writing-tests-for-phpunit-data-providers

---

# Next steps
## Test doubles and mocking
- https://phpunit.readthedocs.io/en/8.0/test-doubles.html
- https://github.com/phpspec/prophecy
- https://github.com/mockery/mockery

---

# Resources
- https://getcomposer.org/doc/
- https://phpunit.de/
- https://www.amazon.com/Test-Driven-Development-Kent-Beck/dp/0321146530