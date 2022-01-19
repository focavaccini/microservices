package spring.boot.microservices.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.microservices.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
