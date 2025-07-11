# Hibernate-practical

This project is a simple Hibernate-based Java application that demonstrates object-relational mapping (ORM) with a PostgreSQL database. It includes two entity classes: `Regions`, which represents a region with an auto-generated ID and a name, and `Countr`, which represents a country with its own ID, name, and a many-to-one relationship to a `Region`. The Hibernate configuration is defined in `hibernate.cfg.xml`, specifying database connection details and mapping the entity classes. The `Main` class initializes Hibernate, creates instances of `Regions` and `Countr`, links them together, and saves them to the database within a transaction. The project uses Jakarta Persistence annotations and connects to PostgreSQL using the Hibernate ORM framework. It's designed as a basic example of how to persist related entities using Hibernate in a real-world database environment.

Features : 

* Hibernate ORM Integration** – Uses Hibernate to map Java objects to database tables.
* PostgreSQL Database** – Connects to a PostgreSQL database using JDBC.
* Maven-based Project** – Manages dependencies using `pom.xml`.
* JPA Annotations** – Uses `@Entity`, `@Id`, `@ManyToOne`, etc. from Jakarta Persistence API.
* Entity Relationship** – Defines a many-to-one relationship between `Countr` and `Regions`.
* Auto Table Creation** – Uses `hibernate.hbm2ddl.auto=update` to auto-create/update DB tables.
* Session and Transaction Management** – Saves entities using Hibernate sessions and transactions.
* Console Output for Debugging** – Prints entity info and success messages to the console.
* Data Persistence** – Persists Java objects as rows in `regions` and `countries` tables.
* SQL Logging** – SQL queries are logged using `hibernate.show_sql=true`.


Technologies Used : 

Java – Core programming language.
Hibernate ORM – For object-relational mapping between Java classes and database tables.
Jakarta Persistence (JPA) – For entity annotations like @Entity, @Id, @ManyToOne.
PostgreSQL – Relational database used for data storage.
Maven – Build and dependency management tool (pom.xml).
Hibernate Configuration XML – Used to define database connection and entity mappings (hibernate.cfg.xml).
JDBC (Java Database Connectivity) – Underlying connection mechanism between Java and PostgreSQL.
Eclipse IDE / Spring Tool Suite – Development environment (based on your folder path).

Dependencies :

<dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.hibernate.orm</groupId>
        <artifactId>hibernate-platform</artifactId>
        <version>7.0.5.Final</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      <dependency>
        <groupId>jakarta.platform</groupId>
        <artifactId>jakarta.jakartaee-bom</artifactId>
        <version>11.0.0</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>

  <dependencies>
    <dependency>
      <groupId>org.hibernate.orm</groupId>
      <artifactId>hibernate-core</artifactId>
    </dependency>
    
    <dependency>
      <groupId>jakarta.persistence</groupId>
      <artifactId>jakarta.persistence-api</artifactId>
      </dependency>

   <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.7</version>
</dependency>
  </dependencies>

  Prerequisites :
Before running the project,ensure you have the following installed:
1 . JDK
2 . Apache Maven
3 . Hibernate ORM
4 . PostgreSQL
5 . PostgreSQL JDBC Driver
6 . hibernate.cfg.xml file
7 . OOP concepts

  -- For Regions table
create table Regions (
    region_id serial primary key,
    region_name varchar(255)
);

-- For Countries table
create table countries (
    country_id integer not null,
    country_name varchar(255),
    region_id integer,
    primary key (country_id),
    foreign key (region_id) references Regions (region_id)
);

Contact :
* Your Name : samruddhi Andhalkar
* Your Email : samruddhiandhalkar20072gmail.com
* GitHub : samruddhiandhalkar
