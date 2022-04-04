//package com.api.banco.Models;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Getter
//@Setter
//@Entity
//public class Transacao {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Long idTransacao;
//    @ManyToOne()
//    private Conta conta;
//    @Column
//    private double valor;
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column
//    private Date dataTransacao;
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((idTransacao == null) ? 0 : idTransacao.hashCode());
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Transacao other = (Transacao) obj;
//        if (idTransacao == null) {
//            if (other.idTransacao != null)
//                return false;
//        } else if (!idTransacao.equals(other.idTransacao))
//            return false;
//        return true;
//    }
//
//
//}
