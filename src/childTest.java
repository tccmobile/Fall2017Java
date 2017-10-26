import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class childTest {

    child boy = new child();
    child girl = new child("sue",6,true);

    @Test
    void plays() {
        boy.plays();

        assertEquals(true,boy.isHappy());

        girl.plays();

        assertEquals(false, girl.isHappy());

    }





    @org.junit.jupiter.api.Test
    void setName() {
        boy.setName("Phil");
        assertEquals("Phil",boy.getName());

        girl.setName("Sally");
        assertEquals("Sally",girl.getName());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        boy.setAge(3);
        assertEquals(3,boy.getAge());

        girl.setAge(9);
        assertEquals(9,girl.getAge());

    }

    @org.junit.jupiter.api.Test
    void setHappy() {
        boy.setHappy(true);
        assertEquals(true,boy.isHappy());

        girl.setHappy(false);
        assertEquals(false,girl.isHappy());

    }



}