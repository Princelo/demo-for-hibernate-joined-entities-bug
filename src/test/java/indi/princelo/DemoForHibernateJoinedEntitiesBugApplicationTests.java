package indi.princelo;

import indi.princelo.entity.Bill;
import indi.princelo.entity.BillExt;
import indi.princelo.entity.Order;
import indi.princelo.repository.BillRepository;
import indi.princelo.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoForHibernateJoinedEntitiesBugApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    BillRepository billRepository;

    @Autowired
    OrderRepository orderRepository;

    @Test
    @Transactional
    public void healthyDemo() {
        Order order = orderRepository.findById("1");
        //order.getItems().size(); //size call
        Bill bill = billRepository.findById("1");
        assertTrue(bill instanceof BillExt);
    }

    @Test
    @Transactional
    public void bugDemo() {
        Order order = orderRepository.findById("1");
        order.getItems().size(); //size call
        Bill billFetchAfterSizeCall = billRepository.findById("1");
        //A javassist proxy instance of Bill comes out. BillExt is expected
        assertFalse(billFetchAfterSizeCall instanceof BillExt);
    }

}
