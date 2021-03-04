.DEFAULT_GOAL := help

# target: help - Display available recipes.
.PHONY: help
help:
	@egrep "^# target:" [Mm]akefile

# target: test - Run application tests
.PHONY: test
test:
	mvn clean test

# target: run - runs the application with default config for development
.PHONY: run
run:
	mvn clean spring-boot:run
