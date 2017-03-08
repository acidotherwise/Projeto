package br.com.util;

import java.io.Serializable;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
 

@Interceptor
@Transactional
public class TransactionInterceptor implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Inject
    public EntityManager entityManager;
 

    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        boolean owner = false;
 
        try {
            if (!entityTransaction.isActive()) {

                entityTransaction.begin();
                entityTransaction.rollback();
 

                entityTransaction.begin();
                owner = true;
            }

            return context.proceed();
        } catch (Exception e) {
            if (entityTransaction != null && owner) {
                entityTransaction.rollback();
            }
            throw e;
        } finally {
            if (entityTransaction != null && entityTransaction.isActive() && owner) {
                entityTransaction.commit();
            }
        }
    }
 
}

