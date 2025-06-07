# How to deploy App ?
- You need war file
- You need to build.
  - Update the pom.
    ```
    <build>
	<finalName>springmvc</finalName>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</group
			<artifactId>maven-war-plugin</artifactId
			<version>3.3.1</version>
		</plugin>
	</plugins>
    </build>
    ```
- Locate your Apache Tomcat
- If bin folder don't have startup.bat file
- Then Re-download it.
- copy the war from Project to that location.
  - paste & refresh it
  - It will automatically unzipped.
- mvn command 
- You need install maven in your laptop
  - mvn compile
  - mvn package
  - mvn install
  - mvn clean

---

  - mvn clean package
  - mvn clean install

---
- if you add username and password.
- You need to modify
- tomcat-users.xml
<user username="root" password="root" roles="manager-gui,manager-script"/>

- What are the different roles ??

=== Automate with Jenkins ====
- https://www.jenkins.io/download/
- Download war file 
- Locate initial admin Password (Initial Password)
  - Keep it handy
- java -jar jenkins.war
- Username : admin
- Password : 
- Install Plugin 
  - maven
