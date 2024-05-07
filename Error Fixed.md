Problem : 
Description	Resource	Path	Location	Type
org.apache.maven:maven-repository-metadata:pom:3.0 failed to transfer from https://repo.maven.apache.org/maven2 during a previous attempt. This failure was cached in the local repository and resolution is not reattempted until the update interval of central has elapsed or updates are forced. Original error: Could not transfer artifact org.apache.maven:maven-repository-metadata:pom:3.0 from/to central (https://repo.maven.apache.org/maven2): The operation was cancelled.	pom.xml	/springmvc	line 1	Maven Configuration Problem

# How to Resolve Maven's ''Failure to Transfer'' Error
https://dzone.com/articles/how-resolve-mavens-failure

for /r %i in (*.lastUpdated) do del %i