package com.senac.Receptor.repository;


import com.senac.Receptor.entities.Produto;
import com.senac.Receptor.service.ProdutoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository <Produto,Integer> {

}
