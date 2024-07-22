package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();


        try {
//           Member findMemeber =  em.find(Member.class, 1L);
//           findMemeber.setName("HelloJPA");

//            System.out.println("findMember = " + findMemeber.getId());
//            System.out.println("findMember = " + findMemeber.getName());

            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                    .getResultList();

            for(Member member : result){
                System.out.println("member.name = "+ member.getName());
            }


            tx.commit();

        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();


        }

        emf.close();

    }
}
