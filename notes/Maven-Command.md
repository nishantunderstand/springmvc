Maven Command :)

# Validate POM
mvn validate

# Clean and package first
mvn clean package

# Run tests
mvn test

# Deploy without tests
mvn deploy -DskipTests


# View effective settings
mvn help:effective-settings

# Clean local repository cache
mvn dependency:purge-local-repository


# Start embedded Tomcat
mvn tomcat7:run

# Run with hot reload (when using IDE)
mvn tomcat7:run-war

# Run without tests
mvn tomcat7:run -DskipTests

# Run with specific context path
mvn tomcat7:run -Dmaven.tomcat.path=/myapp